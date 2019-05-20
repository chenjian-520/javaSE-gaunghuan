package com.ghgj.lesson2.employee;

public abstract class Employee { //∏∏¿‡‘±π§
	String number;
	String name;
	int price;
	
	public Employee(String number, String name, int price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public abstract void show() ;
}
