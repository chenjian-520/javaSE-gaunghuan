package com.ghgj.lesson3.person;

public class Cat extends Animal{
	String hobby;
	public void paly() {
		System.out.println("��ˣ");
	}
	
	@Override     //������д ��ʾ��
	public void eat() {
		System.out.println("����");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.paly();
		cat.type="è";
		System.out.println(cat.type);
	}
}
