package Thread_Safe_Code;

import java.util.concurrent.locks.ReentrantLock;

class ExplicitLock {
	private int count = 0;
	private final ReentrantLock lock = new ReentrantLock();
	
	public void increment()
	{
		lock.lock();	
		try
		{
			count++;
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public int getCount()
	{
		lock.lock();
		try
		{
			return count;
		}
		finally
		{
			lock.unlock();
		}
	}
};

public class ReentrantLockExample {
	
	public static void main(String[] args)
	{
		ExplicitLock obj = new ExplicitLock();
		
		// Create a Runnable task that increments the counter 1000 times
		Runnable task = ()-> {
			for (int i=0; i<1000; i++)
			{
				obj.increment();
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
		System.out.println("Final Count: " + obj.getCount());
	}
}
