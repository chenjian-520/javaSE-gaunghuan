package com.ghgj.lesson7.work;

public class Math1 {
	
	public int calculation(int n1,int n2,String operator) {
		switch(operator) {
		case "add": 		return n1+n2;
		case "subtract": 	return n1-n2;
		case "multiply": 	return n1*n2;
		case "divide": 		return n1/n2;
		}
		return 0;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public double divide(int a,int b) {
		return a/b;
	}
	
}
