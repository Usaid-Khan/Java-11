package LamdaExpression;

import java.util.function.Consumer;

public class Consumer_JavaUtils {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Consumer<String> obj = (s)-> { System.out.println("Hello World " + s); };
		obj.accept("Of Java");
		
		Consumer<String> obj2 = s-> System.out.println(s.toUpperCase());
		obj2.accept("java");
		
		
	}

}
