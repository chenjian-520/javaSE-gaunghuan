package com.ghgj.lesson2.day6;

public class Person {
	//��Ա
	String name ;
	int age ;
	String sex;
	String address;
	String serial;
	
	public void run() {
		System.out.println("�ܲ�");
	}
	
	public int run1() {
		return 1;
	}
	
	public void say() {
		//this �������
		System.out.println(this.name+","+this.age+","+sex);
	}
	
	public void self() {
		System.out.println(this.name+","+this.age+","+this.sex);
	}
	
	public void work() {
		System.out.println("���湤��");
	}
	
	public int daka() {
		return 1;
	}
}
