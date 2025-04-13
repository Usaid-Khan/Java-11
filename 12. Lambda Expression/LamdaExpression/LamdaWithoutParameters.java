package LamdaExpression;

@FunctionalInterface
interface Animal {
	void print();
}

@FunctionalInterface
interface Parent {
	abstract String print();
}

public class LamdaWithoutParameters{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Animal objAnimal = ()-> { System.out.println("Hello World"); };
		objAnimal.print();
		
		Parent objP = ()-> {return "Hello World Parent"; };
		String result = objP.print();
		System.out.println(result);
		System.out.println(objP.print());
	} 
}
