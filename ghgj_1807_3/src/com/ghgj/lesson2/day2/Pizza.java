package com.ghgj.lesson2.day2;

import java.util.Scanner;

public class Pizza {
	String name;
	int price;
	int size;	
	public Pizza(String name, int price, int size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + ", size=" + size + "]";
	}	
}
class Hxpizza extends Pizza{

	public Hxpizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hxpizza(String name, int price, int size) {
		super(name, price, size);
		// TODO Auto-generated constructor stub
	}
	
}
class Pgpizza extends Pizza{

	public Pgpizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pgpizza(String name, int price, int size) {
		super(name, price, size);
		// TODO Auto-generated constructor stub
	}
	
}

