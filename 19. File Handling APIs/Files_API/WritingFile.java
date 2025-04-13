package Files_API;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WritingFile {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\uet\\Desktop\\test1.txt");
		
		try
		{
			/*Writing in File*/
			String data = "hey Java \nhey Java2 \nhey Java3";
			Files.write(p, data.getBytes());
			
			/*Reading from File*/
			List<String> readData = Files.readAllLines(p);
			System.out.println(readData);
			readData.forEach(System.out::println);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
