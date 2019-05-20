package com.ghgj.lesson3.person;

import com.ghgj.lesson3.person.Person;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	public Person(String name ,String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Person(String name ,String sex) {
		this.name = name;
		this.sex = sex;
		this.age=18;
	}
	
	public Person(String name ) {
		this.name = name;	 
		this.sex = "男";
		this.age=18;
	}
	
	public Person() {
		this.name ="陈健";
		this.sex ="男";
		this.age=18;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setSex(String sex) {
		if(sex.equals("男")||sex.equals("女")) {
			
			this.sex = sex;
		}else {
			System.out.println("赋值出错");
			this.sex = "男";
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<=60&&age>=18) {
			this.age = age;
		}else {
			System.out.println("不能工作");
			this.age = 24;
		}
	}
	public static void main(String[] args) {
		//                调用方法
		Person per = new Person("chenjian");
		System.out.println(per.getName());
		System.out.println(per.getSex());
		System.out.println(per.getAge());
	}
	
}
