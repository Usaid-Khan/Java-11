package Streams;

import java.util.Arrays;
import java.util.List;

public class ProcessData {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		int s = nums.stream().filter(num-> num%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(s);
		
		nums = Arrays.asList(1, 2, 3, 4, 5);
		s = nums.stream().filter(num-> num%2!=0).mapToInt(num-> num*3).sum();
		System.out.println(s);
		
	}

}
