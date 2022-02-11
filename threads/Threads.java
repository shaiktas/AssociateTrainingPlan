/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

/**
 *
 * @author sri.vipparla
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        //Creating the instance for MYRunnable class
        MyRunnable thread = new MyRunnable();
        //Passing MyRunnable instance to Thread class
        Thread t1 = new Thread(thread);
        //Assigning name to thread
        t1.setName("Thread1");
        System.out.println("state: After Initialization: " + t1.getName() + " : " + t1.getState());

        t1.start();
        System.out.println("state: After invoking start(): " + t1.getName() + " : " + t1.getState());

        Thread.sleep(1000);
        System.out.println("state: Sleeping Thread: " + t1.getName() + " : " + t1.getState());
        System.out.println("Dont call Thread2 till the completion of run() in MyRunnable class");
        t1.join();
        System.out.println("Calling Thread2");

        MyThread1 t2 = new MyThread1();
        t2.setName("Thread2");
        System.out.println("state: " + t2.getName() + " : " + t2.getState());
        t2.start();
        System.out.println("state: " + t2.getName() + " : After Initialization: " + t2.getState());
        System.out.println("State: " + t2.getName() + " : " + t2.getState());

    }

}
