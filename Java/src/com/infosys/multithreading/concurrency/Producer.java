package com.infosys.multithreading.concurrency;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> sharedQueue;

    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 5; i++) {
                sharedQueue.put(randGen());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Integer randGen() {
        Random random = new Random();
        int data = random.nextInt(100);
        System.out.println("Produced: " + data);
        return data;
    }
}
