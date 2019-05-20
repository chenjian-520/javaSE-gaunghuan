package com.ghgj.lesson7.work;

public class Mouse {
	String name;
	String hobby;
	public void sprak() {
		System.out.println("我叫杰瑞，我爱好吃，一只小猫有啥可以怕的");
	}
	public static void main(String[] args) {
		Mouse mouse1 = new Mouse();
		Mouse mouse2 = new Mouse();
		Mouse mouse3 = new Mouse();
		Person  visit = new Person();
//		System.out.println(visit.show());
	}
}


/*class Person {
	String name ;
	int age;

	public String show() {
		return "person [name=" + name + ", age=" + age + "]";
	}
}*/