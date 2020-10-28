package multi.threading.example;

public class ExtThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"\t i = "+i);			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {
		
		ExtThread th1 = new ExtThread();
		ExtThread th2 = new ExtThread();		
		
		System.out.println(th1);    // min - 1, max - 10, default - 5 
		System.out.println(th2);
		
		th1.setPriority(10);
		th2.setPriority(1);
		
		th1.start();
		th2.start();
	}
}
