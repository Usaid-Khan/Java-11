package Serialization_Deserialization;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Factorial implements Serializable {
	
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

public class SerializableAssignment {

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
		
		String path = System.getProperty("user.home") + "\\Desktop\\factorial.ser";
		try(FileOutputStream fos = new FileOutputStream(path))
		{
			ObjectOutputStream bs = new ObjectOutputStream(fos);
			bs.writeObject(fact);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
