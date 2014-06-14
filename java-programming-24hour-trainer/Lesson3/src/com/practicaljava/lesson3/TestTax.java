package com.practicaljava.lesson3;

public class TestTax {

	public static void main(String[] args) {
		Tax tax = new Tax();
		tax.grossIncome = 50000;
		tax.dependents = 2;
		tax.state = "NJ";
		
		double yourTax = tax.calcTax();
		
		System.out.println("Your tax is " + yourTax);
		
		NJTax tax2 = new NJTax();
		double yourTax2 = tax2.calcTax();
		double totalTax2 = tax2.adjustForStudents(yourTax2);
		
		System.out.println("Your total tax is " + totalTax2);
	}
}
