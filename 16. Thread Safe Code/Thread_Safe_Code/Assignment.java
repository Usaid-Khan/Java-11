package Thread_Safe_Code;

import java.util.concurrent.locks.ReentrantLock;

class ExplicitLock2 {
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
}

public class Assignment {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ExplicitLock2 obj = new ExplicitLock2();
		
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
		
		System.out.println("Final Count: " + obj.getCount());
	}

}
