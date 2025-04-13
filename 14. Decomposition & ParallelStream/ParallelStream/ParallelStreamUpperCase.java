package ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamUpperCase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Daniel");
		
		List<String> upperCaseNames = names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames);
	}

}
