package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessImplTest {
	
	@Test
	public void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int calculateSum = business.calculateSum(new int [] {1,2,3});
		
		int expectedResult = 6;
		assertEquals(expectedResult, calculateSum);
	}
	
	@Test
	public void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int calculateSum = business.calculateSum(new int [] {});
		
		int expectedResult = 0;
		assertEquals(expectedResult, calculateSum);
	}
	
	@Test
	public void calculateSum_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int calculateSum = business.calculateSum(new int [] {5});
		
		int expectedResult = 5;
		assertEquals(expectedResult, calculateSum);
	}
}
