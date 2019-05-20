package com.ghgj.lesson2.employee;

public class Manage extends Employee{  //子类项目经理类
	int bonus;
	public void soccess() {
		System.out.println("踢足球");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(this.number+","+this.name+","+this.price+","+this.bonus);
		System.out.println("  ,"+"做管理工作");
	}

	public Manage(String number, String name, int price, int bonus) {
		super(number, name, price);
		this.bonus = bonus;
	}
}
