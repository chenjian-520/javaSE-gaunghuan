package com.ghgj.lesson2.interface3;

public class Frog extends Animals implements Iswim { //青蛙 类  继承动物  接口游泳
	public Frog(String name, String color, String type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("虽然不是鱼，但青蛙也是游泳高手");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("青蛙是"+type+"，爱吃昆虫");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("那只"+color+"的，名叫"+name+"的青蛙正在呱呱的叫");
	}
}
