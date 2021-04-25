package com.multithread;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.List;

/**
 * Created by amitsenapati on 11/16/16.
 */
public class AdvisorDelegate {


    public static void main(String a[])
    {
        AdvisorDelegate advisorDelegate = new AdvisorDelegate();

        Customer customer = new Customer();
        customer.setPin("1234567");

        try {
            advisorDelegate.retrieveTerritoryAndBOBValue(customer);
        }
        catch(Exception e)
        {

        }

        System.out.println(customer.getPin());
        System.out.println(customer.getTerritory());
        System.out.println(customer.getBobValue());

    }



    public void retrieveTerritoryAndBOBValue(Customer customer) throws InterruptedException, TimeoutException, ExecutionException {
        List<Callable<Void>> tasks = new ArrayList<Callable<Void>>();
        tasks.add(new RetrieveTerritory(customer));
        tasks.add(new RetrieveBOB(customer));

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {

            CompletionService<Void> completionService = new ExecutorCompletionService<Void>(executorService);

            for (Callable<Void> task : tasks) {
                completionService.submit(task);
            }

            for (int i = 0; i < tasks.size(); ++i) {
                Future<Void> taskResult = completionService.poll(10, TimeUnit.SECONDS);


                if (null == taskResult) {
                    System.out.print("Error during polling");
                } else {
                    taskResult.get();
                }
            }

    }
    catch (ExecutionException e) {
        System.out.println("Error while processing");
    }


   }


    private final class RetrieveTerritory implements Callable<Void>
    {
        private final Customer customer;

        RetrieveTerritory(Customer customer)
        {
            this.customer = customer;
        }

        @Override
        public Void call()
        {
            getTerritoryInfo(customer);

            return null;
        }
    }

    private void getTerritoryInfo(Customer customer)
    {
        customer.setTerritory("NYC");
    }


    private final class RetrieveBOB implements Callable<Void>
    {
        private final Customer customer;

        RetrieveBOB(Customer customer)
        {
            this.customer = customer;
        }

        @Override
        public Void call()
        {
            getBOB(customer);

            return null;
        }
    }

    private void getBOB(Customer customer)
    {
        customer.setBobValue("123");
    }

}
