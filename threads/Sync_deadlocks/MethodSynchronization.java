/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads.Sync_deadlocks;

/**
 *
 * @author sriva
 */
public class MethodSynchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food food=new Food();
        Thread t1=new Thread(new Thread1(food));
        t1.setName("t1");
        t1.start();
        Thread t2=new Thread(new Thread1(food));
        t2.setName("t2");
        t2.start();
    }
    
}
class Food{
           static int noOfApples=5;
    public synchronized void countApples(){
        System.out.println("Total Number of Apples before starting :"+Thread.currentThread().getName()+" : "+noOfApples);
        for(int i=noOfApples;i>0;i--){
        
            noOfApples-=1;
            System.out.println("noOfApples: "+noOfApples+" from: "+Thread.currentThread().getName());
        }
    }
}
class Thread1 implements Runnable{
    Food f;
    public Thread1(Food f){
        this.f=f;
    }

    @Override
    public void run() {
        f.countApples();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Thread2 implements Runnable{
    Food f;
    public Thread2(Food f){
        this.f=f;
    }

    @Override
    public void run() {
        f.countApples();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

