package com.ghgj.lesson2.day6;

public class Person {
	//成员
	String name ;
	int age ;
	String sex;
	String address;
	String serial;
	
	public void run() {
		System.out.println("跑步");
	}
	
	public int run1() {
		return 1;
	}
	
	public void say() {
		//this 本类对象
		System.out.println(this.name+","+this.age+","+sex);
	}
	
	public void self() {
		System.out.println(this.name+","+this.age+","+this.sex);
	}
	
	public void work() {
		System.out.println("认真工作");
	}
	
	public int daka() {
		return 1;
	}
}
