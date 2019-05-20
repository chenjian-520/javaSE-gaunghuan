package com.ghgj.lesson2.dog;

public class Animal {
	private String name;
	private String type;
	private int health;
	private String sex;
	private int friendly;

	public Animal() {

	}

	public Animal(String name, String type, int health, String sex, int friendly) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health >= 1 && health <= 100) {
			this.health = health;
		} else {
			this.health = 60;
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getFriendly() {
		return friendly;
	}

	public void setFriendly(int friendly) {
		if (friendly <= 100 && friendly >= 1) {
			this.friendly = friendly;
		} else {
			this.friendly = 0;
		}
	}

	public String show() {
		return "�ҵ����ֽ�:" + this.name + "  ����ֵΪ:" + this.health + "  Ʒ����:" + this.type + "  �Ա�Ϊ:" + this.sex + "  ���Ѷ�Ϊ:"
				+ this.friendly;
	}

}
