package Heirarchical_Inheritance;

class father {
	public void fatherMethod()
	{
		System.out.println("This is father method");
	}
}

class child1 extends father {
	public void child1Method()
	{
		System.out.println("This is child1 method");
	}
}

class child2 extends father {
	public void child2Method()
	{
		System.out.println("This is child2 method");
	}
}


public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		child1 c1 = new child1();
		c1.child1Method();
		c1.fatherMethod();
		
		child2 c2 = new child2();
		c2.child2Method();
		c2.fatherMethod();
	}

}
