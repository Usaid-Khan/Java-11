package Thread_Safe_Code;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class counterClass {
	int count = 0;
	private final ReentrantReadWriteLock rl = new ReentrantReadWriteLock();
	public void increment()
	{
		rl.writeLock().lock();
		try
		{
			count++;
		}
		finally
		{
			rl.writeLock().unlock();
		}
	}
	public int getCount()
	{
		rl.readLock().lock();
		try
		{
			return count;
		}
		finally
		{
			rl.readLock().unlock();
		}
		
	}
}

public class ReentrantReadWriteLockExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		counterClass obj = new counterClass();
		
		Runnable task = ()-> {
			for(int i=0; i<1000; i++)
			{
				obj.increment();
			}
		};
		
		Thread th1 = new Thread(task);
		Thread th2 = new Thread(task);
		
		th1.start();
		th2.start();
		
		try
		{
			th1.join();
			th2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Total count: " + obj.getCount());
	}

}
