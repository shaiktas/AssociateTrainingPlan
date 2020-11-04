package Threading;

import java.util.Random;

class Action {

	int balance = 0;
	String name;
	
	synchronized void withdraw(int amount){
		System.out.println("Withdrawing.....");
		if (this.balance < amount) {
			System.out.println("Balance of "+ this.balance +" is too small. Please make a deposit...");
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Sorry. Cannot wait.");
			}
		} else {
			this.balance -= amount;
			System.out.println(amount+" has been withdrawn from your account.");
		}
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Depositing.....");
		this.balance += amount;
		System.out.println(amount+" has been deposited into your account.");
		notify();
	}
	
}

public class Account {
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
				for (int i = 0; i < 5; i++) {
					Random random = new Random();
					action.deposit(random.nextInt(2000));	
					try {
						wait(5000);
					} catch (Exception e) { }
				}
			}
		};
		card2.start();
	}

}
