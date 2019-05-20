package com.ghgj.lesson2.dog;

public class Penguin extends Animal {

	public Penguin() {
		super.setName("无名");
		super.setHealth(100);
		super.setFriendly(0);
		super.setType("无敌帝企鹅");
	}

	public Penguin(String name, String type, String sex, int health, int friendly) {
		super.setName(name);
		super.setType(type);
		super.setSex(sex);
		super.setHealth(health);
		super.setFriendly(friendly);
	}

	public Penguin(String name, String type, String sex) {
		super.setName(name);
		super.setType(type);
		super.setSex(sex);

	}

}
