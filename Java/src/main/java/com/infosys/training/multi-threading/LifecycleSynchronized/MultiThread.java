package com.demo;

class MyThread extends Thread {
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch ( Exception e) {
			}
		}
		 long time = System.currentTimeMillis() - startTime;
		System.out.println("Time to execute: " + time);

	}
}

public class MultiThread {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

}