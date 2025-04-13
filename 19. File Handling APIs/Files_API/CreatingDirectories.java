package Files_API;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreatingDirectories {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path p = Path.of("C:\\Users\\uet\\Desktop\\Subjects");
		Path p2 = Path.of("C:\\Users\\uet\\Desktop\\Subjects\\Math");
		
		try
		{
			Files.createDirectory(p);
			Files.createDirectory(p2);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
