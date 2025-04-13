package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Decomposition {

	public static void main(String[] args)
	{
		
        //Task1: Grouping by Sales Region
		List<String> salesRegion = Arrays.asList("PunjabLahore: 5000", "PunjabMultan: 3000", "PunjabIslamabad: 8000", "SindhKarachi: 7500", "BalochistanQuetta: 8700");	
		Map<Character, List<String>> groupingSalesRegion = salesRegion.parallelStream().collect(Collectors.groupingBy(region-> region.charAt(0)));
		System.out.println(groupingSalesRegion);
		System.out.println();
		
		//Task2: Finding total amount of sales
		List<Integer> salesByRegion = new ArrayList<>();
		for(int i=0; i<salesRegion.size(); i++)
		{
			int index = salesRegion.get(i).indexOf(" ");
			String subStr = salesRegion.get(i).substring(index).trim();
			int number = Integer.parseInt(subStr);
			salesByRegion.add(number);
		}
		int totSales = salesByRegion.parallelStream().reduce(0, Integer::sum);
		System.out.println("Total Sales are " + totSales);
		System.out.println();
		
		int startIndex = salesRegion.get(0).indexOf("P");
		int endingIndex = salesRegion.get(0).indexOf(":");
		String reg = salesRegion.get(0).substring(startIndex, endingIndex);
		System.out.println(reg);
		
		//Task3: Partitioning Sales on threshold
		Map<Boolean, List<Integer>> threshold = salesByRegion.parallelStream().collect(Collectors.partitioningBy(n-> n>6000));
		System.out.println(threshold);
	}

}
