package com.counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterRunning implements Runnable{
    //public static AtomicInteger counter = new AtomicInteger();
    public static volatile int i;


    public static void main(String[] args) {

        ExecutorService  service = Executors.newFixedThreadPool(1);
        //SourceProcess sourceProcess = new SourceProcess();
        CounterRunning counterRunning = new CounterRunning();
        service.submit(counterRunning);


    }

    @Override
    public void run() {

        while(true) {
            //int i = CounterRunning.counter.incrementAndGet();
            i++;
            System.out.println("value: "+i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //try {
        //System.out.println("value: "+i);
        //Thread.sleep(1000);
       /* } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}

/*class SourceProcess implements Runnable{

   *//* public SourceProcess(){

    }*//*

    //public volatile int i =0;
    //public AtomicInteger counter = new AtomicInteger();



    @Override
    public void run() {

        while(true) {
            //int i = CounterRunning.counter.incrementAndGet();
            int j = CounterRunning.i;
            j++;
            CounterRunning.i=j;
            //CounterRunning.i = CounterRunning.i++;
            System.out.println("value: "+CounterRunning.i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
        //try {
            //System.out.println("value: "+i);
            //Thread.sleep(1000);
       *//* } catch (InterruptedException e) {
            e.printStackTrace();
        }*//*

    }*/

