package main.java.com.countdownlatch;

import main.java.com.model.Employee;
import main.java.com.model.EmployeeGraph;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class CountConcurrencyUsingCDL {

    final private AtomicLong totalCount = new AtomicLong();
    final private CountDownLatch latch = new CountDownLatch(1);
    final private AtomicLong pendingVisits = new AtomicLong();
    private ExecutorService service;


    public static void main(String[] args) {

        Employee emp1 = EmployeeGraph.createEmployeeGraph();

        CountConcurrencyUsingCDL countConcurrencyUsingCDL = new CountConcurrencyUsingCDL();

        try {
            System.out.println(countConcurrencyUsingCDL.getTotalCount(emp1));
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


    }




    private long getTotalCount(final Employee emp) throws InterruptedException {

        service = Executors.newFixedThreadPool(100);
        pendingVisits.incrementAndGet();
        try {
            updateTotalCount(emp);
            latch.await(100, TimeUnit.SECONDS);
            return totalCount.longValue();
        }finally {
            service.shutdown();
        }

    }

    private void updateTotalCount(final Employee emp) {
        long count = 0;
        if(emp.isAdvisor()) {
            count = emp.getAdvisorCount();
        }else {
            final List<Employee> childrenList = emp.getEmployeeList();
            if (childrenList != null) {
                for (Employee child : childrenList) {
                    if(child.isAdvisor()) {
                        count += child.getAdvisorCount();
                    }else {
                        pendingVisits.incrementAndGet();
                        service.execute(new Runnable() {

                            @Override
                            public void run() {
                                updateTotalCount(child);

                            }
                        });
                    }
                }
            }
        }

        totalCount.addAndGet(count);
        if(pendingVisits.decrementAndGet() == 0) {
            latch.countDown();
        }
    }
}
