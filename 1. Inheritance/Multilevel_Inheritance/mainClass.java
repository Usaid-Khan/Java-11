package Multilevel_Inheritance;

class grandFather {
	public void grandFatherMethod()
	{
		System.out.println("This is grand father method");
	}
}

class father extends grandFather {
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
		c.grandFatherMethod();
	}

}
