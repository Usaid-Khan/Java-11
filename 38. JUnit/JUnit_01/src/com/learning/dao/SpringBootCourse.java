package com.learning.dao;

public class SpringBootCourse implements Course {
	@Override
	public boolean coursePurchased()
	{
		System.out.println("Spring Boot course is purchased.");
		return true;
	}
}
