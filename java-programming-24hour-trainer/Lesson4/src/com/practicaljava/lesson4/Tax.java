package com.practicaljava.lesson4;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	
	public Tax(double grossIncome, String state, int dependents) {
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
		
		customerCounter++;
		
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	public double calcTax() {
		return grossIncome * 0.33 - dependents * 100; 
	}
	
	public static double convertToEuro(double tax) {
		double result = tax * 1.25;
		
		System.out.println("Tax in Euros is " + result);
		
		return result;
	}
}
