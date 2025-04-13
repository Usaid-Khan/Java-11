package List;

import java.util.LinkedList;
import java.util.*;

public class Iterators {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<String> linkedList4 = new LinkedList<>();
		linkedList4.add("Apple");
		linkedList4.add("Banana");
		linkedList4.add("Cherry");
		linkedList4.add("Grapes");
		linkedList4.addFirst("Mango");
		linkedList4.addLast("Guava");
		System.out.println(linkedList4);
		
		Iterator listIterator = linkedList4.iterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());    //listIterator.next() returns the current value and reference of next value
		}
	}

}
