package multithreading;

/*
Write a Producer/Consumer code using BlockingQueue
in Java, instead of using wait & notify methods.
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest
{
    /*
        A queue that supports operations that wait for the queue to become non-empty
        when retrieving an element and wait for space to become available in the queue
        when storing an element.
     */

    public static void main(String[]args)
    {
        BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
        Producer p = new Producer(sharedQueue);
        Consumer c = new Consumer(sharedQueue);

        new Thread(p).start();
        new Thread(c).start();
    }

}

class Producer implements Runnable
{
    private final BlockingQueue<Integer>queue;

    Producer(BlockingQueue q)
    {
        queue = q;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++)
            {
                queue.put(produce());
                Thread.sleep(200);
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public Integer produce()
    {
        Integer i = (int) (Math.random() * 25);
        System.out.println("Produced: " + i);
        return i;
    }

}

class Consumer implements Runnable
{

    private final BlockingQueue<Integer>queue;

    Consumer(BlockingQueue q)
    {
        queue = q;
    }

    @Override
    public void run() {
        try {
            while(true)
            {
                consume(queue.take());
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public void consume(Integer i)
    {
        System.out.println("Consumed: " + i);
    }

}
