package multi.threading.example;

public class ImplRunnable implements Runnable {

	@Override
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
		
		ImplRunnable runn = new ImplRunnable();
		
		Thread th1 = new Thread(runn, "TH-1");
		Thread th2 = new Thread(runn, "TH-2");
		
		th1.start();
		th2.start();

	}

}
