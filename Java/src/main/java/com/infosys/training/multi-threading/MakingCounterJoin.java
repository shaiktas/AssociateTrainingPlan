package multi.threading.example;

public class MakingCounterJoin implements Runnable {

	private int counter;

	@Override
	public void run() {
		for (int i = 1; i <=20000; i++) {
			increment();
		}
	}

	private synchronized void increment() {
		counter++;
	}
	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) throws InterruptedException  {

		MakingCounterJoin r = new MakingCounterJoin();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Counter final Value: "+r.getCounter());
	}
}
