package LamdaExpression;

import java.util.function.Function;

public class Function_JavaUtils {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Function<String, Integer> obj = s-> s.length();
		System.out.println(obj.apply("Of Java"));
		
		Function<String, Boolean> obj2 = s-> s.length()>5;
		System.out.println(obj2.apply("Of Java"));
	}

}
