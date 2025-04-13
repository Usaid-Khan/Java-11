package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThread {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ExecutorService exeObj = Executors.newFixedThreadPool(3);
			
			//Rough
			exeObj.submit(()-> {
				for(int i=0; i<10; i++)
				{
					System.out.println(Thread.currentThread().getName()  + " Performing Task No: " + i);
				}
			});
			
			for(int i=0; i<10; i++)
			{
				exeObj.submit(()-> {
					System.out.println(Thread.currentThread().getName() + " Performing Task");
				});
			}
			
		exeObj.shutdown();
	}

}
