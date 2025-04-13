package Deque;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BoundedQueueMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue<String> queue = new ArrayBlockingQueue<>(3);
		
		queue.add("Apple");
		queue.add("Banana");
		queue.add("Apple");
		queue.offer("Apple");    //It does not gives exception and doesn't add any new element
//		queue.add("Apple");        It will give you an exception on adding new elements 
		
		System.out.println(queue);
		System.out.println(queue.offer("Apple"));
		
		System.out.println(queue.poll());
	}

}
