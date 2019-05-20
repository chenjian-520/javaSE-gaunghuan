package com.ghgj.lesson2.abstract1;

public abstract class Employee { //抽象类 员工
	int id;
	int sex;
	String name;
	String duty;
	double salary;
	int holidays;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int sex, String name, String duty, double salary, int holidays) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.duty = duty;
		this.salary = salary;
		this.holidays = holidays;
	}
	public void display() {
		System.out.println("姓名："+name+"\t性别："+sex+"\t职位："+duty);
	}
	public abstract int getSbsidy(int day) ;
		
	
}
