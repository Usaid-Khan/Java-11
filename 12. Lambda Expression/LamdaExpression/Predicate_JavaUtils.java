package LamdaExpression;

import java.util.function.Predicate;

public class Predicate_JavaUtils {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Predicate<String> obj = s-> s.length()>5;
		System.out.println(obj.test("Of Java"));
		System.out.println(obj.test("Java"));
	}

}