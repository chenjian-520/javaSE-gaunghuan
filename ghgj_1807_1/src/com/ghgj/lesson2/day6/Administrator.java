package com.ghgj.lesson2.day6;

public class Administrator {

	String number;
	String code ;
	 
	public void setNumber(String number,String code) {
		this.number = number;
		this.code = code;
				
	}
	public void getNumber() {
		System.out.println(number);
		System.out.println(code);
	}
}
