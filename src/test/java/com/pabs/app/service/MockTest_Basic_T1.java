package com.pabs.app.service;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest_Basic_T1 {
    BusinessImpl business = new BusinessImpl ();
    DataService dataServiceMock = mock (DataService.class);

    @Test
    public void calculateSum_UsingMockedStubDataService () {
        System.out.println(" @Before Call already executed !! ");
        when(dataServiceMock.retriveAllData ()).thenReturn(new int[]{1,2,3});
        assertEquals (6, business.calculateSumFromDataService ());

    }

    @Before
    public void before(){
        System.out.println(" @Before Call Done ");
        business.setDataService (dataServiceMock);
    }


}
