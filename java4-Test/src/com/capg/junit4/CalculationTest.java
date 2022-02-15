package com.capg.junit4;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	public void testmethod() {
		Calculation calculation = new Calculation();
//		assertEquals(30, calculation.addition(15, 15));
		// assertEquals(30, calculation.sub(15, 15));
		assertEquals(4.0, calculation.multiple(4, 1));
	}
}
