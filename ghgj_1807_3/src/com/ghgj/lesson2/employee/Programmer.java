package com.ghgj.lesson2.employee;

public class Programmer extends Employee {  //�������Ա��
	
	public void read() {
		System.out.println("��С����");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(this.number+","+this.name+","+this.price+",");
		System.out.println("  ,"+"��������̹���");
	}
	
	public Programmer(String number, String name, int price) {
		super(number, name, price);
		// TODO Auto-generated constructor stub
	}
	
	
}
