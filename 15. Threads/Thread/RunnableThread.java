package Thread;
import java.util.concurrent.Callable;

//It cannot return anything and cannot throw exception
class RunnableClass implements Runnable {
	@Override
	public void run()
	{
		System.out.println("Executing Through Runnable");
	}
	public void print()
	{
		System.out.println("Hello World");
	}
}

public class RunnableThread {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RunnableClass obj = new RunnableClass();
		Thread t = new Thread(obj);
		t.start();
	}
}
