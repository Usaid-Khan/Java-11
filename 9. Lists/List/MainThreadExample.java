package List;

public class MainThreadExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Yeh main thread ka code hai
		System.out.println("Yeh main thread ka code hai!");
		
		//Ek naya thread create karte hain
		Thread thread = new Thread(() -> {
			System.out.println("Yeh ek naya thread hai!");
		});
		
		//Naye thread ko start karte hain
		thread.start();
	}
}