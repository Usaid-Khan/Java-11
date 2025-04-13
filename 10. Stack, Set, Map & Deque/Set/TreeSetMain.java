package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> ts = new TreeSet<>();
		
		ts.add("Apple");
		ts.add("Mango");
		ts.add("Mango");
		ts.add("Banana");
		ts.add("Grapes");
		ts.add("Apple");
		System.out.println(ts);
		System.out.println(ts.contains("Mango"));
		System.out.println(ts.size());
		
		if(ts.contains("Grapes"))
		{
			System.out.println("This element is included in the list");
		}
		else
		{
			System.out.println("This element is not included in the list");
		}
		
		ts.remove("Apple");
		System.out.println(ts);
		
		ts.clear();
		System.out.println(ts);
		
		Set<Integer> tsInt = new TreeSet<>();
		tsInt.add(1);
		tsInt.add(5);
		tsInt.add(2);
		tsInt.add(4);
		tsInt.add(3);
		System.out.println(tsInt);
	}

}
