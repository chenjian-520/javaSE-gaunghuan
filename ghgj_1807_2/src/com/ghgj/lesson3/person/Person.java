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
		this.sex = "��";
		this.age=18;
	}
	
	public Person() {
		this.name ="�½�";
		this.sex ="��";
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
		if(sex.equals("��")||sex.equals("Ů")) {
			
			this.sex = sex;
		}else {
			System.out.println("��ֵ����");
			this.sex = "��";
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<=60&&age>=18) {
			this.age = age;
		}else {
			System.out.println("���ܹ���");
			this.age = 24;
		}
	}
	public static void main(String[] args) {
		//                ���÷���
		Person per = new Person("chenjian");
		System.out.println(per.getName());
		System.out.println(per.getSex());
		System.out.println(per.getAge());
	}
	
}
