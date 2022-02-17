/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads.Sync_deadlocks;

/**
 *
 * @author sriva
 */
public class BlockSynchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Food1 food=new Food1();
        Thread t1=new Thread(new Thread3(food));
        t1.setName("t1");
        t1.start();
        Thread t2=new Thread(new Thread4(food));
        t2.setName("t2");
        t2.start();
    }
    
}
class Food1{
           static int noOfApples=5;
    public void countApples(){
        System.out.println("Total Number of Apples before starting :"+Thread.currentThread().getName()+" : "+noOfApples);
       synchronized(this){
           if(noOfApples>0){
        for(int i=noOfApples;i>0;i--){
        
            noOfApples-=1;
            System.out.println("noOfApples: "+noOfApples+" from: "+Thread.currentThread().getName());
        }}
           else{
               System.out.println("Apples are not available for : "+Thread.currentThread().getName()+"\nCount of Apples: "+noOfApples);
           }
    }}
}
class Thread3 implements Runnable{
    Food1 f;
    public Thread3(Food1 f){
        this.f=f;
    }

    @Override
    public void run() {
        f.countApples();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Thread4 implements Runnable{
    Food1 f;
    public Thread4(Food1 f){
        this.f=f;
    }

    @Override
    public void run() {
        f.countApples();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

