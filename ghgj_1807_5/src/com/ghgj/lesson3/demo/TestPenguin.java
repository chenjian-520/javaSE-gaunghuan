package com.ghgj.lesson3.demo;

import java.util.ArrayList;
import java.util.List;

class Penguin{
	private String name;
	private int age;
	public Penguin(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Penguin [name=" + name + ", age=" + age + "]";
	}
	
}

public class TestPenguin {

	public static void main(String[] args) {
		List<Penguin> list = new ArrayList<>();
		Penguin p1 = new Penguin("Q1",3);
		Penguin p2 = new Penguin("Q2",1);
		Penguin p3 = new Penguin("Q3",2);
		Penguin p4 = new Penguin("Q4",4);
		list.add(p1);
		list.add(p1);
		list.add(p1);
		list.add(p1);
		System.out.println("企鹅数量为："+list.size());
		System.out.println("遍历------------");
		list.forEach(System.out::println);
		list.remove(2);
		System.out.println("遍历------------");
		list.forEach(System.out::println);
	}

}
