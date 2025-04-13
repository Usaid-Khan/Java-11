package LamdaExpression;

import java.util.function.BiFunction;

public class BiFunction_JavaUtils {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> obj = (a,b)-> a+b;
		System.out.println(obj.apply(4, 5));
		
		BiFunction<String, Integer, String> obj2 = (a,b)-> a+b;
		System.out.println(obj2.apply("danish", 5));
		
		BiFunction<Integer, Integer, Boolean> obj3 = (a,b)-> a+b<6;
		System.out.println(obj3.apply(4, 5));
	}
}
