package Generics;

import java.util.*;

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> fruitsList = new ArrayList<>();
		List<Integer> tableOf3 = new ArrayList<>();
		
		fruitsList.add("Apple");
		fruitsList.add("Peach");
		fruitsList.add("Grapes");
		System.out.println(fruitsList);
		
		for(int i=1; i<=10; i++)
		{
			tableOf3.add(3*i);
		}
		System.out.println(tableOf3);
	}
}
