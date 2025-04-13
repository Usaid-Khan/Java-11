package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Filter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();	
		names.add("Ali");
		names.add("Zain");
		names.add("Asad");
		List<String> FilteredNames = names.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
		System.out.println("Names started with A are " + FilteredNames);
		
		List<Integer> ages = new ArrayList<>();
		ages.add(30);
		ages.add(20);
		ages.add(45);
		ages.add(50);
		List<Integer> FilteredAges = ages.stream().filter(age-> age>40).collect(Collectors.toList());
		System.out.println("Ages greater than 40 are " + FilteredAges);
	}
}
