package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{
	String name;
	int rollNo;
	
	Student(){}    //By default constructor
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
	@Override
	public String toString()
	{
		return "Roll No. " + rollNo + " and Student Name: " + name; 
	}
}

public class ComparatorExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Student> obj = new ArrayList<>();
		
		obj.add(new Student(3, "zain"));
		obj.add(new Student(2, "Ali"));
		obj.add(new Student(1, "Usman"));
		
		obj.sort(new Student());    //It sorts by name or alphabetically
		for(Student s : obj)
		{
			System.out.println(s);
		}
	}

}
