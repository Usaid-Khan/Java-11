package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClass2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ExecutorService exeObj = Executors.newFixedThreadPool(2);
		
		Future<String> f1 = exeObj.submit(()-> {
			System.out.println(Thread.currentThread().getName());
			return "Task no. 1";
		});

		Future<String> f2 = exeObj.submit(()-> {
			System.out.println(Thread.currentThread().getName());
			return "Task no. 1";
		});
		
		System.out.println(Thread.currentThread().getName() + " " + f1.get());
		System.out.println(Thread.currentThread().getName() + " " + f1.get());
	}

}
