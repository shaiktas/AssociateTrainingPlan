/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads.Sync_deadlocks;

import static threads.Sync_deadlocks.Deadlocks.resource1;
import static threads.Sync_deadlocks.Deadlocks.resource2;


/**
 *
 * @author sriva
 */
public class Deadlocks {
     static String resource1 = "resource1";  
    static String resource2 = "resource2";  
    

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {  
    // t1 tries to lock resource1 then resource2  
      Thread t5=new Thread(new Thread5());
      t5.start();
      Thread t6=new Thread(new Thread6());
      t6.start(); 
      
   }  
}

class Thread5 implements Runnable{
   @Override
   public void run() {  
        synchronized (resource2) {  
          System.out.println("Thread 5: locked resource 2");  
  
          try { Thread.sleep(100);} catch (InterruptedException e) {}  
              System.out.println("lock released waiting for resource 1");
  
          synchronized (resource1) {  
            System.out.println("Thread 5: locked resource 1");  
          }  
        }  
      }   
}

class Thread6 implements Runnable{
    @Override
    public void run() {  
          synchronized (resource1) {  
           System.out.println("Thread 6: locked resource 1");  
  
           try { Thread.sleep(100);} catch (InterruptedException e) {}  
              System.out.println("lock released waiting for resource 2");

           synchronized (resource2) {  
            System.out.println("Thread 6: locked resource 2");  
           }  
         }
    }
}