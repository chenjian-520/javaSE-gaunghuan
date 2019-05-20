package com.ghgj.lesson2.play;

public class FatherUser {
	private String name;
	private int number;
	

	public FatherUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FatherUser(String name) {
		super();
		this.name = name;
	}
	public FatherUser(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void addNumber() {
		this.number += 1;
	}
	public void takeNumber() {
		this.number -= 1;
	}
	
	public int start(int a) {
		return a;
	}
	
	public int punches(int a ) {
		return  a;
	}
}
