package WritingInFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteInFile {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path desktopPath = Paths.get(System.getProperty("user.home"), "Desktop");
		Path filePath = desktopPath.resolve("example.txt");
		
		String content = "Hello, this is a test file created on the desktop.";
		 
		try
		{
			Files.write(filePath, content.getBytes());
			System.out.println("File created and written successfully at: " + filePath.toString());
		}
		catch(IOException e)
		{
			 System.err.println("An error occurred while creating or writing to the file: " + e.getMessage());
		}
	}
}
