package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Mango");
		hs.add("Banana");
		hs.add("Grapes");
		hs.add("Apple");
		System.out.println(hs);
		System.out.println(hs.contains("Mango"));
		System.out.println(hs.size());
		
		if(hs.contains("Grapes"))
		{
			System.out.println("This element is included in the list");
		}
		else
		{
			System.out.println("This element is not included in the list");
		}
		
		hs.remove("Apple");
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}

}
