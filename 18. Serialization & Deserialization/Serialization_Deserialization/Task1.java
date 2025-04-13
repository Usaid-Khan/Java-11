package Serialization_Deserialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleIO {
	
	public void readAndDisplayInput()
	{
		try
		{
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(input);
			
			System.out.print("Please enter your name: ");
			String name = br.readLine();
			System.out.print("Please enter your age: ");
			String age = br.readLine();
			
			System.out.println("Hello " + name + "! You are " + age + "years old.");
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Task1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ConsoleIO cio = new ConsoleIO();
		
		cio.readAndDisplayInput();
	}

}
