package com.ghgj.lesson2.employee;

public class Programmer extends Employee {  //子类程序员类
	
	public void read() {
		System.out.println("看小黄书");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(this.number+","+this.name+","+this.price+",");
		System.out.println("  ,"+"做开发编程工作");
	}
	
	public Programmer(String number, String name, int price) {
		super(number, name, price);
		// TODO Auto-generated constructor stub
	}
	
	
}
