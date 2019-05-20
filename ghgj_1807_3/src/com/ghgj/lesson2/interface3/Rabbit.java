package com.ghgj.lesson2.interface3;

public class Rabbit extends Animals {  //兔子类 继承动物类

	public Rabbit(String name, String color, String type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("兔子是"+type+"爱吃胡萝卜");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("那只"+color+"的，名叫"+name+"的兔子正在唧唧的叫");
	}

}
