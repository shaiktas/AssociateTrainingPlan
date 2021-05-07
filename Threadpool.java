package com.training;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import javax.xml.ws.Service;

class PrintJob implements Runnable
{
String name;
PrintJob (String name)
{
	this.name = name;
}

	@Override
	public void run() {
System.out.println(name+ ".......job started by Thread:  "+Thread.currentThread().getName());

try
{
	Thread.sleep(5000);
}
 catch (InterruptedException e)
 {
 }
System.out.println(name+ ".......job  completed by Thread:  "+Thread.currentThread().getName());


}
		
}

public class Threadpool {
	public static void main(String[] args)
	{
		PrintJob[] jobs = { new PrintJob("Sam"),
							new PrintJob("John"),
							new PrintJob("Amy"),
							new PrintJob("kate"),
							new PrintJob("Jim"),
							new PrintJob("Thomas"),
							new PrintJob("Chris")};
		
		 ExecutorService service = Executors.newFixedThreadPool(4);	// threadpool(2) timetaken 20023
		 															//threadpool(4) timetaken 10014
		 
		 long startTime = System.currentTimeMillis();
		for(PrintJob job:jobs)
		{
			 service.submit(job);
		}
		
			 service.shutdown();	
			 while (!service.isTerminated()) {
		        }
		        System.out.println("Finished all threads");
		        long finishtime = System.currentTimeMillis();
				 System.out.println("Total time to complete" +(startTime - finishtime));
		
		
							
		}
		
	}

 

