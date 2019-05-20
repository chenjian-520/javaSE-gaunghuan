package com.ghgj.lesson1.day1;

public class Demo6_2 {
	public int max(int a , int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}	
	}
	public double max(double a , double b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public double max(double a , double b,double c) {
		if(a>b&&a>c) {
			return a;
		}else if(b>a&&b>c){
			return b;
		}else {
			return c;
		}
	}
}



class Student{
	String number;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name, int age) {
		super();
		this.number = "0000";
		this.name = name;
		this.age = age;
	}
}