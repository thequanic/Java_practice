package unit_03;


public class P16_MultiThreading_RunOrStart {

	public static void main(String[] args) {
		
		/*
		 * in java main is also a thread with priority 5
		 * it also act like any other thread and follows concurrent execution
		 * 
		 * main is first thread to get into running state
		 * main thread is terminated at last as it performs many shutdown operations
		 */
		
		new Thread3().start();
		//calling start method
		
		//with directly calling run() method
		//new Thread3().run();
		
		for(int i=0;i<1000;i++)
		{
			System.out.println("In Thread Main:"+i);
		}
		
		
	}

}

/*
 * Thread in Java can be created in two ways:
 * 1. By extending Thread class
 * 2. By implementing Runnable interface
 * 
 * We need to write function of thread inside run() method
 * run() method is overrided
 * 
 * for executing a thread we need to call start() method which puts the thread into runnable state in the queue
 * when thread gets CPU time run() method is automatically called and thread is put into running state
 * 
 * if we directly calls run method then there will be sequential execution not concurrent
 * 
 */

class Thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("In Thread3:"+i);
		}
	}
}