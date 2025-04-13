package Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//It returns and can throw checked exception
class CallableClass implements Callable {
	@Override
	public String call() throws Exception
	{
		return "Executing Through Callable";
	}
}

class CallableClass2 implements Callable {
	@Override
	public Integer call() throws Exception
	{
		return 4*3;
	}
}

public class CallableThread {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		CallableClass obj = new CallableClass();
		FutureTask<String> ft = new FutureTask(obj);
		Thread t = new Thread(ft);
		t.start();
		System.out.println(ft.get());
		
		CallableClass2 obj2 = new CallableClass2();
		FutureTask<Integer> ft2 = new FutureTask(obj2);
		Thread t2 = new Thread(ft2);
		t2.start();
		System.out.println(ft2.get());
	}
}
