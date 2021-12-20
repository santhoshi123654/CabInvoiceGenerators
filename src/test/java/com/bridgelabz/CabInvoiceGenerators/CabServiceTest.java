package com.bridgelabz.CabInvoiceGenerators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabServiceTest {
	
	CabService cabService = null;

    @Before
    public void setUp() throws Exception {
    	cabService = new CabService();
    }
    
    @Test
    public void calculateFare_should_return_totalFare() {
        double distance = 4.0;
        int time = 10;
        double totalFare = cabService.calculateFare(distance, time);

        Assert.assertEquals(50.0,totalFare,0.0);
    }

    @Test
    public void calculateFare_should_return_Minimum_Fare() {
        double distance = 0.25;
        int time = 2;
        double totalFare = cabService.calculateFare(distance, time);

        Assert.assertEquals(5.0,totalFare,0.0);
    }
}