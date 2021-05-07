package com.training;
class A
{
	 void m1()
	{
		for (int i = 0; i<5; i++)
		{
			String thread_Name = Thread.currentThread().getName();
			System.out.println(thread_Name);
		}
		System.out.println("Thread  exiting.");
	}
}
class MyThread extends Thread
{
	A a;
	
	MyThread(A a)
	{this.a = a;
}
	public void run()
	{synchronized (a)
		{
		a.m1();
		}
	
	}
}
public class Synchronizedmethod {

	public static void main(String[] args) throws InterruptedException {
		
		A a1 = new A();
		long startTime = System.nanoTime();
		MyThread t1 = new MyThread(a1);
		MyThread t2 = new MyThread(a1);
		MyThread t3 = new MyThread(a1);
		
			t1.setName("AAA");
			t2.setName ("BBB");
			t3.setName ("CCC");
		
		t1.start();
		t2.start();
		t3.start();
		
		t3.join();
		
		long finishTime = System.nanoTime();
		System.out.println("Completed in : " + (finishTime - startTime));
	
	}

}
