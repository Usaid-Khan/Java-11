package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		
		String desktopPath = System.getProperty("user.home") + "/Desktop/person.ser";
		
		try(FileInputStream fis = new FileInputStream(desktopPath))
		{
			ObjectInputStream objRead = new ObjectInputStream(fis);
			Student sTemp = (Student) objRead.readObject();
			System.out.println("Object Deserialized: " + "Id: " + sTemp.id + " " + "Name: " + sTemp.name + " " + "Age: " + sTemp.age);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}