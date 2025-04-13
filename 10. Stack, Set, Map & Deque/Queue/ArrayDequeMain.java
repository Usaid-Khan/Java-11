package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Deque<String> ad = new ArrayDeque<>();
		
		ad.add("Apple");
		ad.add("Mango");
		ad.addLast("Banana");
		ad.addFirst("Grapes");
		ad.addFirst("Guava");       //It will give us exception
		ad.offerFirst("Orange");    //It will give us false
		ad.offerLast("Orange");
		System.out.println(ad);
		
		/*These functions deletes the elements*/
		ad.removeFirst();
		ad.removeLast();
		ad.pollFirst();
		ad.pollLast();
		
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		/*These functions are only for accessing elements not for deleting*/
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
	}

}
