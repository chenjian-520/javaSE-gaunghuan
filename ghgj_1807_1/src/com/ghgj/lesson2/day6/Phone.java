package com.ghgj.lesson2.day6;

public class Phone {
	String name;
	int  age;
	double price;
	String cell;
	 
	public void bfyy() {
		System.out.println("��������");
	}
	
	public void down() {
		System.out.println("����");
	}
	
	public void charge() {
		Cell d1 =new Cell();
		d1.csh("���",350,8);
		System.out.println(d1.age+d1.name+d1.price);
	}
}
