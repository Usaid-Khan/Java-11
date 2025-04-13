package Files_API;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class gettingPath {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path p1 = Paths.get("C:\\Users\\uet\\Desktop\\example.txt");
		Path p2 = Path.of("C:/Users/uet/Desktop/example.txt");
		Path p3 = Paths.get("C:\\Users\\uet\\Desktop\\test.txt");    //It does not exist
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		if(Files.exists(p3))
		{
			System.out.println("Path exists.");
		}
		else
		{
			System.out.println("Path does not exist.");
		}
	}

}
