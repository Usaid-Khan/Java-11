package Bounded_Wild_Cards;

import java.util.*;

public class Assignemt {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PrintList print = new PrintList();
		List<String> names = new ArrayList<>();
		
		char name1 = 'A';
		String str1 = Character.toString(name1);
		names.add(str1);
		char name2 = 'B';
		String str2 = Character.toString(name2);
		names.add(str2);
		
		names.add("Hassan");
		
		System.out.println(names);
	}

}
