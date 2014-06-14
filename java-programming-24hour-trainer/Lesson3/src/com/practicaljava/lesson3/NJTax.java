package com.practicaljava.lesson3;

public class NJTax extends Tax {
	
	public NJTax() {
		System.out.println("Constructor NJTax");
	}
	
	double adjustForStudents (double stateTax) {
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
}
