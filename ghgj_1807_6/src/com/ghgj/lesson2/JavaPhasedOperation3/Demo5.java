package com.ghgj.lesson2.JavaPhasedOperation3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Enlyee{
	private String name;
	private int age;
	private int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Enlyee(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Enlyee [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}

public class Demo5 {

	public static void main(String[] args) {
		List<Enlyee> list = new ArrayList<>();
		Enlyee a1 = new Enlyee("zhang3",18,3000);
		Enlyee a2 = new Enlyee("li4",25,3500);
		Enlyee a3 = new Enlyee("wang5",22,3200);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.forEach(System.out::println);
		list.remove(2);
		System.out.println("----------------------------");
		for(Enlyee e : list) {
			System.out.println(e);
		}
		System.out.println("----------------------------");
		Iterator<Enlyee> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
