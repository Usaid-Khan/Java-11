package Decomposition;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ali", "Zain", "Asad", "Hamza");
		
		Map<Character, List<String>> groupingNames = names.stream().collect(Collectors.groupingBy(name-> name.charAt(0)));  //It groups on behalf of Ali's first character
		Map<Integer, List<String>> groupingAges = names.stream().collect(Collectors.groupingBy(name2-> name2.length()));   //It groups on the basis of length of names
		
		System.out.println(groupingNames);
		System.out.println(groupingAges);
	}

}
