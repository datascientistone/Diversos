package com.practicaljava.lesson4;

public class TestTax {

	public static void main(String[] args) {
		double grossIncome = 50000;
		String state = "NJ";
		int dependents = 2;
		
		Tax tax = new Tax(grossIncome, state, dependents);
		double yourTax = tax.calcTax();

		System.out.println("Your tax is " + yourTax);
		
		Tax tax2 = new Tax(65000, "TX", 4);
		double hisTax = tax2.calcTax();
		
		double taxInEuro = Tax.convertToEuro(yourTax);
		double tax2InEuro = Tax.convertToEuro(hisTax);
		
		System.out.println("Tax in Euro: " + taxInEuro);
		System.out.println("Tax2 in Euro: " + tax2InEuro);
		
	}

}
