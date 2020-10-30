package Threading;

import java.util.concurrent.ArrayBlockingQueue;

class AccountAction {

	int balance = 0;
	ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(1);
	
	void withdraw(int amount){
		System.out.println("Withdrawing.....");
		if (this.balance < amount) {
			System.out.println("Balance of "+ this.balance +" is too small. Please make a deposit...");
			try {
				this.q.take();
			} catch (Exception e) {
				System.out.println("Sorry. Cannot wait.");
			}
		} else {
			this.balance -= amount;
			System.out.println(amount+" has been withdrawn from your account.");
		}
	}
	
	void deposit(int amount) {
		try {
			this.q.put(this.balance);
		} catch (Exception e) {
			System.out.println("Sorry. Deposit cannot wait again.");
		}
		System.out.println("Depositing.....");
		this.balance += amount;
		System.out.println(amount+" has been deposited into your account.");
	}
	
}

public class BlockingQueueAccount {
	public static void main(String[] args) {
		final Action action = new Action();
		
		Thread card1 = new Thread() {
			public void run() {
				for (int i = 0; i < 4; i++) {
					action.withdraw(1500);
				}
			}
		};
		card1.start();
		
		Thread card2 = new Thread() {
			public void run() {
				for (int i = 0; i < 4; i++) {
					action.deposit(1500);	
					try {
						Thread.sleep(1000);
					} catch (Exception e) { }
				}
			}
		};
		card2.start();
	}

}

