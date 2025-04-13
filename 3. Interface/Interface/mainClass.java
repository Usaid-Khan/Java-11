package Interface;

interface animal{
	void sound();
}

class cat implements animal {
	@Override
	public void sound()
	{
		System.out.println("meow");
	}
	
	public void color()
	{
		System.out.println("white");
	}
}

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		animal c = new cat();
		c.sound();
//		c.color();    This creates an error because we are treating c as an animal, which means it only has access to the methods declared in the animal interface
	
		cat ca = new cat();
		ca.color();
	}

}
