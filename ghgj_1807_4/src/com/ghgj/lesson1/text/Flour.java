package com.ghgj.lesson1.text;

public class Flour {
	String type;
	int weight;
	boolean soup;
	
	public Flour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flour(String type, int weight, boolean soup) {
		super();
		this.type = type;
		this.weight = weight;
		this.soup = soup;
	}
	public Flour(String type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
		this.soup = true;
		
	}
	
	public String check() {
		return "Flour [type=" + type + ", weight=" + weight + ", soup=" + soup + "]";
	}
	
	
	
}
