package unit_03;


/*
 * Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
 * Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 * 
 * The synchronization is mainly used to
 * To prevent thread interference
 * To prevent consistency problem.
 * 
 * 
 * join(): When the join() method is invoked, 
 * the current thread stops its execution and the thread goes into the wait state. 
 * The current thread remains in the wait state until the thread on which the join() method is invoked has achieved
 * its dead state. If interruption of the thread occurs, 
 * then it throws the InterruptedException.
 * 
 */

public class P16_MultiThreading_Synchronization {

	public static void main(String[] args) {
		

		WebCount obj = new WebCount();

		Thread threadOne = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					
					//System.out.println("In threadOne:"+i);

					obj.webcount();
					//System.out.println("In threadOne "+WebCount.count);
					
					

				}
				

			}
		});

		Thread threadTwo = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				
				for (int i = 1; i <= 1000; i++) 
				{

					//System.out.println("In threadTwo:"+i);
					
					obj.webcount();
					//System.out.println("In threadTwo "+WebCount.count);
					

				}
			}
		});

		threadOne.start();
		
		threadTwo.start();
		
		

		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		try 
		{
			threadOne.join();
			
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		try 
		{
			threadTwo.join();
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}

		System.out.println("Count: " + WebCount.count);


	}

}


class WebCount {

	public static int count = 0;

	//You want T1 to complete first and then T2 
	public synchronized void webcount() {
		
		//If not synchronized then, T1 and T2 may read the same value of count at 
		//the same time and may increment same time as well
		count++;
		
		//System.out.println(count);
	}
}