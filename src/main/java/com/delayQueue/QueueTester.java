package main.java.com.delayQueue;

import java.util.concurrent.*;

public class QueueTester {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        BlockingQueue<DelayObject> queue = new DelayQueue<>();
    int numberOfElementsToProduce = 10;
    int delayOfEachProducedMessageMilliseconds = 500;
    DelayQueueConsumer consumer = new DelayQueueConsumer(queue, numberOfElementsToProduce);
    DelayQueueProducer producer = new DelayQueueProducer(queue, numberOfElementsToProduce, delayOfEachProducedMessageMilliseconds);

    executor.submit(producer);
    executor.submit(consumer);

        try {
            executor.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();


    }
}
