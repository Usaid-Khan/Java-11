package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationDemo {
	
	public void deserializePerson(String fileName)
	{
		try(FileInputStream fis = new FileInputStream(fileName))
		{
			ObjectInputStream objRead = new ObjectInputStream(fis);
			Person p = (Person)objRead.readObject();
			System.out.println("Object Deserialized: " + "Name: " + p.name + " " + "Age: " + p.age + " Email: " + p.email);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Task4Deserialization {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DeserializationDemo dSerObj = new DeserializationDemo();
		
		dSerObj.deserializePerson("serialized.txt");
	}

}
