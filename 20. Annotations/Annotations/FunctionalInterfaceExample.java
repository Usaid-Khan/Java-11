package Annotations;

@FunctionalInterface
interface SimpleAnnotation {
	public void print();
}

class Printing implements SimpleAnnotation{
	@Override
	public void print()
	{
		System.out.println("Hey Java");
	}
}

public class FunctionalInterfaceExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Printing p = new Printing();
		p.print();
	}

}
