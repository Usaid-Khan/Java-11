package Thread_Safe_Code;

import java.util.concurrent.ConcurrentHashMap;

class ConcurrentMapExample {
	int count = 0;
	private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
	
	public void add(String key, int value)
	{
		map.put(key, value);
	}
	public int get(String key)
	{
		return map.getOrDefault(key, 1);
	}
}

public class ConcurrentHashMapExample {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ConcurrentMapExample obj = new ConcurrentMapExample();
		
		obj.add("Apple", 500);
		
		// Create a Runnable task that increments the counter 1000 times
		Runnable task = ()-> {
			for (int i=0; i<1000; i++)
			{
				obj.add("Apple" + i, i);
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
		System.out.println("Final Count: " + obj.get("Apple500"));
		System.out.println("Final Count: " + obj.get("Apple400"));
	}

}
