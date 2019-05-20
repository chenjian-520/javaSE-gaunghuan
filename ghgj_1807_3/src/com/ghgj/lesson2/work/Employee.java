package com.ghgj.lesson2.work;

public class Employee {
	int id;
	String sex;
	String name ;
	String duty;
	public Employee(int id, String sex, String name, String duty, double salary, int holidays) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.duty = duty;
		this.salary = salary;
		this.holidays = holidays;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	double salary;
	int holidays;
	public void display() {
		System.out.println(name+"\t"+sex+"\t"+duty);
	}
	public int getDecMoney(int day) {
		if(day<=3) {
			return day*30;
		}else{
			return day*50;	
		}	
	}
	
	
}
