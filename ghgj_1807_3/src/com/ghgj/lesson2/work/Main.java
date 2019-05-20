package com.ghgj.lesson2.work;

public class Main {

	public static void main(String[] args) {
		Employee a = new Employee(1,"ÄÐ","¹ù¾¸","boss",384792,10);
		a.display();
		System.out.println(a.getDecMoney(a.holidays));
		Employee a1 = new Director("üSÈØ");
		a1.getDecMoney(a1.holidays);
		System.out.println(a1.getDecMoney(a1.holidays));
		a1.display();
	}
}
