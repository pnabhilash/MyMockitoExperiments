package com.pabs.app.service;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BusinessImplStubTest {

    @Test
    public void calculateSum_UsingStubbedDataService () {
        BusinessImpl business = new BusinessImpl ();
        business.setDataService (new DataServiceStub ());
        int actualResult = business.calculateSumFromDataService ();
        int expectedResult = 6;
        assertEquals (expectedResult, actualResult);

    }

    class DataServiceStub implements DataService {
        @Override
        public int[] retriveAllData () {
            return new int[]{1, 2, 3};
        }


    }


}
