package Thread_Safe_Code;

class Counter {
	private int count = 0;
	
	// Synchronized method to increment the counter
	public synchronized void increment() 
	{
		count++;
	}
	// Synchronized method to get the current count value
	public synchronized int getCount()
	{
		return count;
	}
};

public class SynchronizedMethods {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		// Create a Runnable task that increments the counter 1000 times
		Runnable task = ()-> {
			for (int i=0; i<1000; i++)
			{
				counter.increment();
			}
		};
		
		// Create two threads to run the task concurrently
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		// Start the threads
		thread1.start();
		thread2.start();
		
		// Wait for both threads to finish
		try
		{
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// Print the final count value
		System.out.println("Final Count: " + counter.getCount());
	}

}
