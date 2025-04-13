package Files_API;

import java.nio.file.Files;
import java.nio.file.Path;

public class DeletingDirectory {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path p = Path.of("C:\\Users\\uet\\Desktop\\Subjects");
		Path p2 = Path.of("C:\\Users\\uet\\Desktop\\Subjects\\Math");
		
		try
		{
			Files.delete(p);
			
			Files.createDirectories(p2);
			Files.deleteIfExists(p2);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
