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
public class MockTest_With_List_Returns_T3 {
	
	List<String> mockList = mock(List.class);
	
	// Verify a specific method with various condition ...
	
	@Test
	public void verificationBasics()
	{
		String value1=mockList.get(0);
		verify(mockList).get(0);
		verify(mockList,times(1)).get(0);
	}
	
	
	
	
}
