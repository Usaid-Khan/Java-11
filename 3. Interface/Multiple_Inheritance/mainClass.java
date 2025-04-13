package Multiple_Inheritance;

interface flyable{
	void fly();
}

interface swimmable {
	void swim();
}

class duck implements flyable, swimmable {
	public void fly()
	{
		System.out.println("duck flys");
	}
	public void swim()
	{
		System.out.println("duck swims");
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
		duck d = new duck();
		d.swim();
		d.fly();
		d.color();
	}

}
