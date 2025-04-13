package ParallelStream;

import java.util.Arrays;
import java.util.List;

public class Reduction {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<String> strs = Arrays.asList("Hello", " World");
		
		int s = numbers.parallelStream().reduce(0, Integer::sum);        //Sum of all
		String c = strs.parallelStream().reduce("", (s1, s2)-> s1+s2);    //Concatenating strings
		int max = numbers.parallelStream().reduce(0, Integer::max);    //Finding maximum
		int min = numbers.parallelStream().reduce(1, Integer::min);    //Finding minimum
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(max);
		System.out.println(min);
	}
}
