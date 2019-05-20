package com.ghgj.lesson5.work;

public class Penguin {
	private String name;
	private int age;
	private String type;
	
	@Override
	public String toString() {
		return "Penguin [name=" + name + ", age=" + age + ", type=" + type + "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Penguin(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	
}
