package com.pabs.app.service;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

/**
 *  This is test with @InjectMocks example 
 * @author peethanabhilash
 *
 */


@RunWith(MockitoJUnitRunner.class)
public class MockTest_VerificationsBasics_T4 {
	
	List mockList = mock(List.class);
	
	@Test
	public void single_SizeCheckWithListMock() {
	when(mockList.size()).thenReturn(5);
	assertEquals(5,mockList.size());
	
	}
	
	
	@Test
	public void multiple_SizeCheckWithListMock() {
	when(mockList.size()).thenReturn(5).thenReturn(10);
	assertEquals(5,mockList.size());
	assertEquals(10,mockList.size());	
	}
	
	@Test
	public void checkKeyValueParamValueWithListMock() {
	when(mockList.get(0)).thenReturn("BhaveeNPachooAreTooGood");
	assertEquals("BhaveeNPachooAreTooGood",mockList.get(0));
	
	}
	
	
	@Test
	public void returnWithAnyParameterTestListMock() {
	when(mockList.get(anyInt())).thenReturn("BhaveeNPachooAreTooGood");
	assertEquals("BhaveeNPachooAreTooGood",mockList.get(0));
	assertEquals("BhaveeNPachooAreTooGood",mockList.get(1));
	}
	
	
}
