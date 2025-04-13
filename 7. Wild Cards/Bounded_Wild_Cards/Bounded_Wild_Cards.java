package Bounded_Wild_Cards;

import java.util.*;

public class Bounded_Wild_Cards {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PrintList print = new PrintList();
		List<Double> weight = new ArrayList<>();
		
		weight.add(2.3);
		weight.add(4.5);
		weight.add(1.1);
		print.PrintList(weight);    //We only have to change Data Type from String to Integer in PrintList function, that's why error is occurring
	}

}
