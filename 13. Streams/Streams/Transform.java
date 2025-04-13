package Streams;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transform {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();	
		names.add("Ali");
		names.add("Zain");
		names.add("Asad");
		List<String> transformNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(transformNames);
		
		List<String> names2 = Arrays.asList("Ali", "Zain", "Asad");
		transformNames = names2.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(transformNames);
		
		List<Integer> nums = Arrays.asList(1, 4, 8, 12, 16);
		List<Integer> transformNums = nums.stream().map(num-> num*3).collect(Collectors.toList());
		System.out.println(transformNums);
	}
}
