package com.ghgj.lesson2.dog;

public class Dog extends Animal{

	public Dog() {
		super.setName("����");
		super.setHealth(100);
		super.setFriendly(0);
		super.setType("��������������");
	}

	public Dog(String name, String type, String sex, int health, int friendly) {
		super.setName(name);
		super.setType(type);
		super.setSex(sex);
		super.setHealth(health);
		super.setFriendly(friendly);
		
	}

	public Dog(String name, String type, String sex) {

		super.setName(name);
		super.setType(type);
		super.setSex(sex);

	}





}