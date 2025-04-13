package Bounded_Wild_Cards;

import java.util.List;

public class Lower_Bounded_PrintList {
	public void PrintList(List<? super Integer> item)    //We only give Wrapper Class or Bigger Class in upper bound
	{
		for(Object itemElement : item)
		{
			System.out.println(itemElement);
		}
	}
}
