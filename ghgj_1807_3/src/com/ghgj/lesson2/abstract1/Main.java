package com.ghgj.lesson2.abstract1;

public class Main {  //测试类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director(001,1,"郭靖","财务",5555,2);
		NormalEmployee normal = new NormalEmployee(002,2,"黄蓉","boss",55555,10);
		director.display();
		System.out.println("出勤工资"+normal.getSbsidy(director.holidays));
		normal.display();
		System.out.println("出勤工资"+normal.getSbsidy(normal.holidays));
	}

}
