package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableClass23 implements Callable<String> {
	@Override
	public String call() throws Exception
	{
		throw new Exception("Returning Exception");
	}
}

public class CallableThread2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		CallableClass23 obj = new CallableClass23();
		FutureTask<String> ft = new FutureTask(obj);
		Thread t = new Thread(ft);
		t.start();
		
		try
		{
			System.out.println(ft.get());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
