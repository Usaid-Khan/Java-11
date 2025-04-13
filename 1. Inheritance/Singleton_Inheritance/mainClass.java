package Singleton_Inheritance;

class father {
	public void fatherMethod()
	{
		System.out.println("This is father method");
	}
}

class child extends father {
	public void childMethod()
	{
		System.out.println("This is child method");
	}
}


public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		child c = new child();
		c.childMethod();
		c.fatherMethod();
	}

}
