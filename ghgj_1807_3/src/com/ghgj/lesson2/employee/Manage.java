package com.ghgj.lesson2.employee;

public class Manage extends Employee{  //������Ŀ������
	int bonus;
	public void soccess() {
		System.out.println("������");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(this.number+","+this.name+","+this.price+","+this.bonus);
		System.out.println("  ,"+"��������");
	}

	public Manage(String number, String name, int price, int bonus) {
		super(number, name, price);
		this.bonus = bonus;
	}
}
