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

/**
 *  This is test with @InjectMocks example 
 * @author peethanabhilash
 *
 */


@RunWith(MockitoJUnitRunner.class)
public class MockTest_WithAt_InjectMock_Ex_T2 {
	
	// Here we say - to this instance InjectMocked object which is DataService in the case !!
	
	@InjectMocks
    BusinessImpl business;
	
	@Mock
    DataService dataServiceMock = mock (DataService.class);

    @Test
    public void calculateSum_UsingMockedStubDataService () {
        when(dataServiceMock.retriveAllData ()).thenReturn(new int[]{1,2,3});
        assertEquals (6, business.calculateSumFromDataService ());

    }

/*
 * Since @InjectMock is being used this will be automatically set and hence this @Before implementation is not required.
    @Before
    public void before(){
        System.out.println(" @Before Call Done ");
        business.setDataService (dataServiceMock);
    }

*/
}
