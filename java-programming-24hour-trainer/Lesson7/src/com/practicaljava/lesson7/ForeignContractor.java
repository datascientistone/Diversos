package com.practicaljava.lesson7;

public class ForeignContractor extends Person {

	public ForeignContractor(String name) {
		super(name);
	}
	
	@Override
	public boolean increasePay(int percent) {
		System.out.println("I�m just a foreign worker");
		return true;
	}

}
