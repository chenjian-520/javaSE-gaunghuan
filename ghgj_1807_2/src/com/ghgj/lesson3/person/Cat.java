package com.ghgj.lesson3.person;

public class Cat extends Animal{
	String hobby;
	public void paly() {
		System.out.println("玩耍");
	}
	
	@Override     //方法重写 提示符
	public void eat() {
		System.out.println("吃鱼");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.paly();
		cat.type="猫";
		System.out.println(cat.type);
	}
}
