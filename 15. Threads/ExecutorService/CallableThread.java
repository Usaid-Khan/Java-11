package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ExecutorService exeObj = Executors.newFixedThreadPool(3);
		
			Future<String> ft = exeObj.submit(()-> {
				
				for(int i=0; i<10; i++)
				{		
					return (Thread.currentThread().getName() + "Performing Task No: " + i);
//					return (Thread.currentThread().getName() + "Performing Task No: " + i);
				}
			});
			
		System.out.println(ft.get());
	}
}
