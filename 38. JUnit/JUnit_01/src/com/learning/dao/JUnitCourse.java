package com.learning.dao;

public class JUnitCourse implements Course {
	@Override
	public boolean coursePurchased()
	{
		System.out.println("JUnit course is purchased.");
		return true;
	}
}
