package com.infosys.multithreading.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Integer> sharedQueue;

    public Consumer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Consumed: " + sharedQueue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
