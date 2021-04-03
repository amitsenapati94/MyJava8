package com.delayQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class DelayQueueConsumer implements Runnable {


    private BlockingQueue<DelayObject> queue;
    private Integer numberOfElementsToTake;
    public AtomicInteger numberOfConsumedElements = new AtomicInteger();

    public DelayQueueConsumer(BlockingQueue<DelayObject> queue, int numberOfElementsToProduce) {
        this.queue = queue;
        this.numberOfElementsToTake = numberOfElementsToProduce;
    }


    @Override
    public void run() {

        //for(int i=0; i<numberOfElementsToTake;i++){
        while(true){
                try {
                    DelayObject object = queue.take();
                    numberOfConsumedElements.incrementAndGet();
                    System.out.println("Consumer take: " + object);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

