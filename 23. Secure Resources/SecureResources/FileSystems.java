package SecureResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class FileSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String desktopPath = System.getProperty("user.home") + "/Desktop/sensitivedata.txt";
		try
		{
			File file = new File(desktopPath);
			/*Create file if not exists*/
			if(!file.exists())
			{
				createSecureFile(file);
			}
			//Accessing file with security check
			checkFilePermissions(file);
			//Reading file content
			readFile(file);
		}
		catch(AccessDeniedException e)
		{
			System.out.println("Access denied: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("An error occurred while accessing the file: " + e.getMessage());
		}
	}
	
	private static void createSecureFile(File file) throws IOException
	{
		/*Creating file*/
		if(file.createNewFile())
		{
			System.out.println("Secure file created: " + file.getName());
			
			FileWriter writer = new FileWriter(file);
			writer.write("This is sensitive data.");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		}
		/*Set permissions (readable only by the owner)*/
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
			System.out.println("Windows OS detected, manual permissions might be needed.");
		}
		else
		{
			Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-----");
			Files.setPosixFilePermissions(Paths.get(file.getPath()), permissions);
		}
	}
	
	/*Cecking file permissions*/
	private static void checkFilePermissions(File file) throws AccessDeniedException
	{
		if(!file.canRead())
		{
			throw new AccessDeniedException("Read access to file denied.");
		}
		if(!file.canWrite())
		{
			throw new AccessDeniedException("Write access to file denied.");
		}
		System.out.println("File has necessary permissions.");
	}
	
	/*Reading the file*/
	private static void readFile(File file) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String line;
		while((line = reader.readLine()) != null)
		{
			System.out.println("File content: " + line);
		}
		reader.close();
	}
}