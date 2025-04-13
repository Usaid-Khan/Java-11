package Serialization_Deserialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class UserManager {
	
	public void addUser(Person p)
	{
		try
		{
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(input);
			
			System.out.print("Enter the name: ");
			String name = br.readLine();
			
			System.out.print("Enter the age: ");
			String ageString = br.readLine();
			Integer age = Integer.parseInt(ageString);
			
			System.out.print("Enter the email: ");
			String email = br.readLine();
			
			Person per = new Person(name, age, email);
			
			FileOutputStream fos = new FileOutputStream("user_data.ser");
			ObjectOutputStream serObj = new ObjectOutputStream(fos);
			serObj.writeObject(per);	
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void loadUser()
	{
		try(FileInputStream fis = new FileInputStream("user_data.ser"))
		{
			ObjectInputStream objRead = new ObjectInputStream(fis);
			Person tempPer= (Person)objRead.readObject();
			System.out.println("Object Deserialized: " + "Name: " + tempPer.name + " " + "Age: " + tempPer.age + " " + " Email: " + tempPer.email);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Task5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		UserManager userMng = new UserManager();
		
		Person anyPer = new Person();
		userMng.addUser(anyPer);
		
		userMng.loadUser();
	}

}
