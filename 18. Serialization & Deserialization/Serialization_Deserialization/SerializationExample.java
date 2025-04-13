package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int age;
}

public class SerializationExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s = new Student();
		s.id = 1;
		s.name = "Zain";
		s.age = 20;
		
		String path = System.getProperty("user.home") + "\\Desktop\\person.ser";
		try(FileOutputStream fos = new FileOutputStream(path))
		{
			ObjectOutputStream bs = new ObjectOutputStream(fos);
			bs.writeObject(s);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Object Serialized: " + "Id: " + s.id + " " + "Name: " + s.name + " " + "Age: " + s.age);
	}
}
