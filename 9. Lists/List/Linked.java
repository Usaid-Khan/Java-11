package List;

import java.util.*;

public class Linked {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> linkedList = new LinkedList<>();	
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
//		linkedList.addFirst("5");    addFirst & addLast are only defined for LinkedList Reference Type
//		linkedList.addLast("5");
		System.out.println(linkedList);
		System.out.println(" ");
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("1");
		linkedList2.add("2");
		linkedList2.add("3");
		linkedList2.add("4");
		linkedList2.add("5");
		linkedList2.add("6");
		linkedList2.add("7");
		linkedList2.addFirst("5");
		linkedList2.addLast("5");
		System.out.println(linkedList2);
		linkedList2.remove(1);    //removing by index
		System.out.println(linkedList2);
		linkedList2.remove("6");    //removing by element itself
		System.out.println(linkedList2);
		linkedList2.removeFirst();
		linkedList2.removeLast();
		System.out.println(linkedList2);
		System.out.println(" ");
		
		LinkedList<Integer> linkedList3 = new LinkedList<>();	
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		linkedList3.add(4);
		linkedList3.add(5);
		linkedList3.add(6);
		linkedList3.add(7);
		System.out.println(linkedList3);
		System.out.println(linkedList3.getFirst());
		System.out.println(linkedList3.getLast());
		linkedList3.removeFirst();
		linkedList3.removeLast();
		System.out.println(linkedList3);
		System.out.println(" ");
		
		LinkedList<String> linkedList4 = new LinkedList<>();
		linkedList4.add("Apple");
		linkedList4.add("Banana");
		linkedList4.add("Cherry");
		linkedList4.add("Grapes");
		linkedList4.addFirst("Mango");
		linkedList4.addLast("Guava");
		System.out.println(linkedList4);
		for(String element : linkedList4)
		{
			System.out.println(element);
		}
	}

}
