package Serialization_Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	int age;
	String email;
	private static final long serialVersionUID = 1L;
	
	Person()
	{
		
	}
	Person(String name, int age, String email)
	{
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getEmail()
	{
		return email;
	}
}

class SerializationDemo {
	
	public void serializePerson(Person person, String fileName)
	{
		try(FileOutputStream fos = new FileOutputStream(fileName))
		{
			ObjectOutputStream bs = new ObjectOutputStream(fos);
			bs.writeObject(person);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Task3Serialization {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person per = new Person("Usaid", 23, "ik157099@gmail.com");
		
		SerializationDemo serObj = new SerializationDemo();
		serObj.serializePerson(per, "serialized.ser");
	}

}
