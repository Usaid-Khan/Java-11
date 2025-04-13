package Decomposition;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<String> names = Arrays.asList("Asad", "Zain", "Awais", "Majid");
		
		Map<Boolean, List<Integer>> partitionNums = numbers.stream().collect(Collectors.partitioningBy(n-> n%2==0));
		Map<Boolean, List<String>> partitionNames = names.stream().collect(Collectors.partitioningBy(n-> n.startsWith("A")));

		System.out.println(partitionNums);
		System.out.println(partitionNames);
	}

}
