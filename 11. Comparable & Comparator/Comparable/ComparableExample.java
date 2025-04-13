package Comparable;

import java.util.Arrays;

class Student implements Comparable<Student>{
	String name;
	int rollNo;
	
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student other)
	{
		return this.rollNo - other.rollNo;
	}
	@Override
	public String toString()
	{
		return "Roll No. " + rollNo + " and Student Name: " + name; 
	}
}

public class ComparableExample {

	public static void main(String[] args)
	{
		// Array of Objects
		Student[] obj = {new Student(3, "zain"), new Student(2, "Ali"), new Student(1, "Usman")};
		
		Arrays.sort(obj);
		for(Student arrObj : obj)
		{
			System.out.println(arrObj);
		}
	}

}
