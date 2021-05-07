package com.training;

public class MultiThreadingExample extends Thread{

	public void run()
	{
		printSomething();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + "Woke up from sleep");
	}
	
	public void printSomething()
	{
		System.out.println("I am processing MultiThread" +this.getName());
	}
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		Thread thread1 = new MultiThreadingExample();
		Thread thread2 = new MultiThreadingExample();
		
		long starttime = System.currentTimeMillis();
		System.out.println("Starting the thread");
		thread1.start();
		
		thread2.start();
		
		thread1.join();
		
		//Thread.sleep(5000);
		System.out.println("completed the thread");
long finishtime = System.currentTimeMillis();
System.out.println("Total time to complete" +(starttime - finishtime));
	}

}
