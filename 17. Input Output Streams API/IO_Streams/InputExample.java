package IO_Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial {
	
	public int findFactorial(int a)
	{
		int temp = a;
		while(a>1)
		{
			temp = temp*(a-1);
			a--;
		}
		return temp;
	}
}

public class InputExample {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.print("Enter any number to find its factorial: ");
		String numString = br.readLine();
		Integer num = Integer.parseInt(numString);
		
		Factorial fact = new Factorial();
		
		int factorial = fact.findFactorial(num);
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
