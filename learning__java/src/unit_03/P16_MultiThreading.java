package unit_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * ****************************************************************************************************************************************
 * 
 * Multithreading in Java is a process of executing multiple threads simultaneously.
 * 
 * A thread is a lightweight sub-process, the smallest unit of processing. 
 * 
 * Multiprocessing and multithreading,both are used to achieve multitasking.
 * However, we use multithreading than multiprocessing because threads use a shared memory area. 
 * They don't allocate separate memory area so saves memory, 
 * and context-switching between the threads takes less time than process.
 * 
 * Java Multithreading is mostly used in games, animation, etc.
 * 
 * ****************************************************************************************************************************************
 * 
 * *** Advantages of Java Multithreading
 * 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
 * 2) You can perform many operations together, so it saves time.
 * 3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 * 
 * ****************************************************************************************************************************************
 * 
 * *** Life cycle of a Thread (Thread States)
 * 
 * 1.New
 * 2.Runnable
 * 3.Running
 * 4.Waiting/Blocked
 * 5.Terminated
 * 
 * ****************************************************************************************************************************************
 * 
 */

public class P16_MultiThreading {
		public static void main(String[] args)
		{
			/*
			 * Without multithreading subprocesses are sequentially executed
			 */
			
			//WithoutMultiThreading obj= new WithoutMultiThreading();
			
			
			//obj.fun1();
			//obj.fun2();
			//first fun1 is executed then fun2 is executed
			
			 
			
			/*
			 * ***problem with sequential execution
			 * 
			 * example:: 
			 * fun3 requests for input and then only fun4 can be executed (if fun4 is called after fun3)
			 * now if user do not give input for months...fun4 will have to wait for execution 
			 *  
			 */
			
			//obj.fun3();
			//obj.fun4();
			
			/*
			 * With Multithreading subprocesses (Threads) are concurrently executed
			 * Threads are arranged in a queue and JVM gives a fixed time to every thread one by one
			 * Until a thread is terminated it again enqueue to the queue after getting JVM time once
			 * The process of switching between threads for execution is known as context switching
			 * 
			 * if we execute T1 and T2 that are objects of Thread1 and Thread2 respectively
			 * they will be executed concurrently
			 * JVM will wait for fixed time for input in T1
			 * but if input is not provided it will execute T2 for that time
			 * 
			 */
			
			Thread1 T1=new Thread1();
			
			
			Thread T2 = new Thread(new Thread2());
			//for threads made by implementing runnable interface we need to make object of 
			//thread class and pass object of our class into constructor
			
			T1.start();
			T2.start();
			
			/*
			 * Threads are put into queue once start method of Thread class in called
			 * It is put into runnable state
			 * 
			 * start() method internally calls run() when Thread gets JVM time
			 */
			
		}
}


class WithoutMultiThreading
{
	 
	void fun1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("In fun1:"+i);
		}
	}
	
	void fun2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("In fun2:"+i);
		}
	}
	
	void fun3()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("In fun3:"+i);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number in fun3:");
		int num= scan.nextInt();
	}
	
	
	void fun4()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("In fun4:"+i);
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
 */

class Thread1 extends Thread
{
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		
		
		try {
			FileWriter file= new FileWriter("E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\multithreading",true);
			BufferedWriter bf= new BufferedWriter(file);
			
			for(int i=0;i<100000;i++)
			{
				bf.write("\nIn Thread1:"+i);
				bf.flush();
			}
			bf.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	
		
		System.out.println("Enter a number in Thread1:");
		int num= scan.nextInt();
		
		scan.close();
	}
}


class Thread2 implements Runnable
{
	public void run()
	{
		try {
			FileWriter file= new FileWriter("E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\multithreading",true);
			BufferedWriter bf= new BufferedWriter(file);
			
			for(int i=0;i<100000;i++)
			{
				bf.write("\nIn Thread2:"+i);
				bf.flush();
			}
			bf.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}