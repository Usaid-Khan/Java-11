package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Apple");
		lhs.add("Mango");
		lhs.add("Mango");
		lhs.add("Banana");
		lhs.add("Grapes");
		lhs.add("Apple");
		System.out.println(lhs);
		System.out.println(lhs.contains("Mango"));
		System.out.println(lhs.size());
		
		if(lhs.contains("Grapes"))
		{
			System.out.println("This element is included in the list");
		}
		else
		{
			System.out.println("This element is not included in the list");
		}
		
		lhs.remove("Apple");
		System.out.println(lhs);
		
		lhs.clear();
		System.out.println(lhs);
	}

}
