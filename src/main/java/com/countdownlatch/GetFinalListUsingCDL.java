package com.countdownlatch;

import com.model.Employee;
import com.model.EmployeeGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class GetFinalListUsingCDL {

    final private List<Employee> finalList = Collections.synchronizedList(new ArrayList<Employee>());
    final private CountDownLatch latch = new CountDownLatch(1);
    final private AtomicLong pendingVisits = new AtomicLong();
    private ExecutorService service;

    public static void main(String[] args) {

        Employee emp1 = EmployeeGraph.createEmployeeGraph();

        GetFinalListUsingCDL latch = new GetFinalListUsingCDL();

        try {
            List<Employee> list = (latch.getFinalList(emp1));

            for(Employee emp : list)
            {
                System.out.println(emp.getEmpId());
                System.out.println(emp.getAdvisorCount());
            }


        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    private List<Employee> getFinalList(final Employee emp) throws InterruptedException {

        service = Executors.newFixedThreadPool(100);
        pendingVisits.incrementAndGet();
        try {
            updateChildEmployee(emp);
            latch.await(100, TimeUnit.SECONDS);
            return finalList;
        }finally {
            service.shutdown();
        }

    }
    private void updateChildEmployee(final Employee emp) {

        if(emp.isAdvisor()) {
            finalList.add(emp);
        }else {
            final List<Employee> childrenList = emp.getEmployeeList();
            if (childrenList != null) {
                for (Employee child : childrenList) {
                    if(child.isAdvisor()) {
                        finalList.add(child);
                    }else {
                        pendingVisits.incrementAndGet();
                        service.execute(new Runnable() {

                            @Override
                            public void run() {
                                updateChildEmployee(child);

                            }
                        });
                    }
                }
            }
        }
        if(pendingVisits.decrementAndGet() == 0) {
            latch.countDown();
        }
    }
}
