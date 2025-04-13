package Thread;

public class ThreadExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Yeh main thread ka code hai!");
		Thread thread = new Thread(() -> {
			System.out.println("Yeh ek naya thread hai!");
		});
		
		thread.start();
	}
}
