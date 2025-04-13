package Thread;

class SimpleWorker implements Runnable{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}

public class Assignment {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SimpleWorker obj = new SimpleWorker();
		
		Thread Worker_1 = new Thread(obj);
		Thread Worker_2 = new Thread(obj);
		Thread Worker_3 = new Thread(obj);
		
		Worker_1.start();
		Worker_2.start();
		Worker_3.start();
		
	}

}
