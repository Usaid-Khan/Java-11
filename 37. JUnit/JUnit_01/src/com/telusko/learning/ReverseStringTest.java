package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		String expected = "avaJ";
		
		assertEquals(expected, reverse.reverseString("Java"));
	}

}
