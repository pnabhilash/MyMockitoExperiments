package com.pabs.app.service;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BusinessImplTest {

    @Test
    public void calculateSum_BasicTest(){
        BusinessImpl business=new BusinessImpl ();
        int actualResult=business.calculate (new int[] {1,2,3});
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);

    }

}
