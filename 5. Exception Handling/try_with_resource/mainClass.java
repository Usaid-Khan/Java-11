package try_with_resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String desktopPath = System.getProperty("user.home") + "/Desktop/example.txt";
		//Create the file
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(desktopPath)))
		{
			writer.write("14th August\n");
			writer.write("Pakistan");
		}
		catch(IOException ex)
		{
			System.out.println("I/O error occurred while creating the file: " + ex.getMessage());
		}
		
		// Read the file
        try(BufferedReader reader = new BufferedReader(new FileReader(desktopPath)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException ex)
        {
            System.out.println("I/O error occurred while reading the file: " + ex.getMessage());
        }
	}
}
