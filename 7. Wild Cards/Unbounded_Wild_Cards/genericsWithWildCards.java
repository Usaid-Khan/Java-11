package Unbounded_Wild_Cards;

import java.util.*;

public class genericsWithWildCards {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		
		List<String> fruitName = new ArrayList<>();
		List<Integer> fruitTypes = new ArrayList<>();
		
		fruitName.add("Apple");
		fruitName.add("Orange");
		fruitName.add("Mango");
		fruit.PrintFruitsList(fruitName);
		
		fruitTypes.add(3);
		fruit.PrintFruitsList(fruitTypes);
	}
}
