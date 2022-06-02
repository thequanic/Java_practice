package unit_03;

import java.util.ArrayList;

import java.util.List;

public class P16_MultiThreading_ProducerConsumer {
	
	
	/*
	 * In computing, the producer-consumer problem (also known as the bounded-buffer problem) 
	 * is a classic example of a multi-process synchronization problem. The problem describes two processes, 
	 * the producer and the consumer, which share a common, fixed-size buffer used as a queue. 
	 * 
	 * The producer’s job is to generate data, put it into the buffer, and start again.
	 * At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.
	 * 
	 * ***Problem 
	 * To make sure that the producer won’t try to add data into the buffer if it’s full and 
	 * that the consumer won’t try to remove data from an empty buffer.
	 */

	public static class Producer implements Runnable {

		private List<Integer> queue;
		private int next = 0;

		public Producer(List<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while (true) {

//				if (queue.size() == 100) {
//					break;
//				}

				synchronized (queue) { 

					if (queue.size() == 100) {
						System.out.println("Queue is full now wait for consumer to consume it");;
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					else {

						queue.add(next);
						System.out.println("Produce: " + next);
						// The thread must own the monitor on the queue to call notify
						queue.notifyAll();
					}
				}

				next++;
			}
		}
	}

	public static class Consumer implements Runnable {
		private List<Integer> queue;

		public Consumer(List<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (queue) {

					if (queue.size() > 0) {
						Integer number = queue.remove(queue.size() - 1);
						System.out.println("Consume: " + number);
						queue.notifyAll();

					} else {
						try {
							// The thread must own queue’s monitor to call wait
							queue.wait();
						} catch (InterruptedException e) {
						}
					}
				}
			}
		}
	}

	public static void main(String args[]) throws Exception {

		// Size may grow up to any size {Dynamic Memory Allocation in Heap}
		List<Integer> queue = new ArrayList<Integer>();

		Thread producer1 = new Thread(new Producer(queue));
		
		Thread consumer1 = new Thread(new Consumer(queue));
		
		producer1.start();
		//producer2.start();
		consumer1.start();
		//consumer2.start();

	}


}



