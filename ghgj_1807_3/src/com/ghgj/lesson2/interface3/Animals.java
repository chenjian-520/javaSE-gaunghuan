package com.ghgj.lesson2.interface3;

public abstract class Animals {  //抽象动物类
	String name;
	String color;
	String type;
	
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animals(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public abstract void eat();
	public abstract void shout();
}
