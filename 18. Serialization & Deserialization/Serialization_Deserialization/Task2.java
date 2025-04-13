package Serialization_Deserialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class FileIO {
	
	public void writeToFile(String fileName, String content)
	{
		try
		{
			FileWriter fw = new FileWriter(fileName);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(content);
			
			pw.flush();
			pw.close();
			fw.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void readFromFile(String fileName)
	{
		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			System.out.println(s);
			
			fr.close();
			br.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Task2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FileIO fio = new FileIO();
		
		String content = "Hello, My name is Usaid.";
		fio.writeToFile("sample.txt", content);
		
		fio.readFromFile("sample.txt");
	}

}
