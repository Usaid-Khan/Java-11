package Bounded_Wild_Cards;

import java.util.*;

//Upper Bounded
public class PrintList {
	public void PrintList(List<? extends String> item)    //We only give Wrapper Class or Bigger Class in upper bound
	{
		for(Object itemElement : item)
		{
			System.out.println(itemElement);
		}
	}
}
