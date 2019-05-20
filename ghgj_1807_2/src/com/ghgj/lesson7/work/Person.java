package com.ghgj.lesson7.work;

public class Person {
	String name;
	int age;
	int sex;
	
	public void study() {
		System.out.println("studing");
	}

	public String showAge() {
		return "Person [age=" + age + "]";
	}
	
	public int addAge() {
		age +=2;
		return age;
	}
	public static void main(String[] args) {
		Person son = new Person();
		Person son1 = new Person();
		System.out.println(son.showAge());
		son.addAge();
		System.out.println(son.showAge());
		
		System.out.println(son1.showAge());
		son1.addAge();
		System.out.println(son1.showAge());
	}
	
}
