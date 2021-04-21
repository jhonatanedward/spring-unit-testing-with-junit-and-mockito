package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockitoRunnerTest {
	
	@InjectMocks
	SomeBusinessImpl business;
	
	@Mock
	SomeDataService dataServiceMock;
	
	@Test
	public void calculateSumUsingDataService_basic() {
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1,2,3});
		
		int calculateSum = business.calculateSumUsingDataService();
		
		assertEquals(6, calculateSum);
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		
		int calculateSum = business.calculateSumUsingDataService();
		
		assertEquals(0, calculateSum);
	}
	
	@Test
	public void calculateSumUsingDataService_oneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {5});
		
		int calculateSum = business.calculateSumUsingDataService();
		
		assertEquals(5, calculateSum);
	}
}
