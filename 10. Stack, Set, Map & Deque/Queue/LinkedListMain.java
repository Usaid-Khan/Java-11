package Deque;

import java.util.LinkedList;
import java.util.Deque;

public class LinkedListMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Deque<String> lld = new LinkedList<>();
		
		lld.add("Apple");
		lld.add("Mango");
		lld.addLast("Banana");
		lld.addFirst("Grapes");
		lld.addFirst("Guava");       //It will give us exception
		lld.offerFirst("Orange");    //It will give us false
		lld.offerLast("Orange");
		System.out.println(lld);
		
		/*These functions deletes the elements*/
		lld.removeFirst();
		lld.removeLast();
		lld.pollFirst();
		lld.pollLast();
		
		System.out.println(lld);
		System.out.println(lld.getFirst());
		System.out.println(lld.getLast());
		
		/*These functions are only for accessing elements not for deleting*/
		System.out.println(lld.peekFirst());
		System.out.println(lld.peekLast());

	}

}
