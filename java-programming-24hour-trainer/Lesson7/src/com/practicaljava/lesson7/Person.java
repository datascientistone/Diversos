package com.practicaljava.lesson7;

public abstract class Person {
	private String name;
	
	protected int INCREASE_CAP = 20; // cap on pay increase
	
	public Person(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void changeAddress(String address) {
		System.out.println("New address is " + address);
	}
	
	public void gideDayOff() {
		System.out.println("Giving a day off to " + name);
	}
	
	public void promote(int percent) {
		System.out.println("Promoting a worker...");
		gideDayOff();
		
		increasePay(percent);
	}

	public abstract boolean increasePay(int percent);
}