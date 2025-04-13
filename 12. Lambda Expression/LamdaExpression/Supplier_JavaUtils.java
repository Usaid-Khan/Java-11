package LamdaExpression;

import java.util.function.Supplier;

public class Supplier_JavaUtils {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Supplier<Double> obj = ()-> Math.random();
		System.out.println(obj.get());
	}

}
