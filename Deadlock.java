/**
 * 
 * @author venkatesh.voddem
 *
 */
	public class Deadlock {  
		  public static void main(String[] args) {  
			  String a = "String1";
			  String b = "String2";
			  
			  Thread1 t1 = new Thread1(a, b); // Initializing Thread- 1
			  t1.setName("Thread-1");
			  t1.start();
			  Thread2 t2 = new Thread2(b, a); // Initializing Thread- 2
			  t2.setName("Thread-2");
			  t2.start();
		  }
	}
	
	class Thread1 extends Thread{
		String a;
		String b;
		Thread1(String a, String b){
			this.a = b;
			this.b = b;
		}
		
		public void run() {
			// Nested synchronization leads to dead lock
			synchronized (a) {
				System.out.println(Thread.currentThread().getName()+" Lock on a");
				try {
					Thread.sleep(1000);
				} catch(Exception e){
					System.out.println("Sleep");
				}
				synchronized (b) {
					System.out.println("Lock on b");
				}
				
			}
		}
	}
	class Thread2 extends Thread{
		String a;
		String b;
		Thread2(String a, String b){
			this.a = a;
			this.b = b;
		
	}
		public void run() {
			// Nested synchronization leads to dead lock
			synchronized (b) {
				System.out.println(Thread.currentThread().getName()+" Lock on b");
				try {
					Thread.sleep(2000);
				} catch(Exception e){
					System.out.println("Sleep");
				}
				synchronized (a) {
					System.out.println("Lock on a");
					
			    }// exit lock 2
			} // exit lock 1
		}
	}
	
	