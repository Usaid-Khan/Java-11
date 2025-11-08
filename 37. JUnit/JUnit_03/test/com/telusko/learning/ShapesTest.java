package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();
	
	@Test
	void tesComputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24), ()-> "Area calculation in wrong");
	}

	@Test
	void tesComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5), "Area calculation is wrong");
	}
}
