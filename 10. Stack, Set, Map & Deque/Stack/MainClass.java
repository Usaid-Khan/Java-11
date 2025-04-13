package Stack;

import java.util.Stack;

public class MainClass{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		
		s.push("Apple");
		s.push("Mango");
		s.push("Grapes");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.get(1));
		System.out.println(s.remove(0));
		System.out.println(s);
//		System.out.println(s.remove(0));
//		System.out.println(s.get(0));
//		System.out.println(s.get(0));
	}

}
