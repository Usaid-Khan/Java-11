package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception()
	{
//		try
//		{
//			SortingArray array = new SortingArray();
//			int unsorted[] = null;
//			int sorted[] = array.sortingArray(unsorted);
//			
//			for(int elem : sorted)
//			{
//				System.out.print(elem);
//			}
//			System.out.println();
//			
//			System.out.println("Statements just above fail");
////			fail();
//			System.out.println("Statements just below fail");
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("Exception occured.");
//		}
		
		SortingArray array = new SortingArray();
		int unsorted[] = null;
		assertThrows(NullPointerException.class, ()-> array.sortingArray(unsorted));
	}
}
