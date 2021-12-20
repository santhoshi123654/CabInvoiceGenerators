package com.bridgelabz.CabInvoiceGenerators;

public class CabService {
	
	private static final int Cost_Per_Minute = 1;
    private static final double Minimum_Cost_Per_Km = 10;
    private static final double Minimum_Fare = 5.0;

    public double calculateFare(double distance, int time) {

        double totalFare = distance * Minimum_Cost_Per_Km + time * Cost_Per_Minute;

        if(totalFare < Minimum_Fare)
            return Minimum_Fare;
        
        return totalFare;
    }
    
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalAggregateFare = 0;
        for (Ride ride :rides) {
            totalAggregateFare += this.calculateFare(ride.distance,ride.time);
        }
        System.out.println(totalAggregateFare);
        return new InvoiceSummary(rides.length,totalAggregateFare);
    }
}
