package com.ghgj.lesson2.work;

public class Fish implements Iswim {
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("�������Ӿ");
	}
	public static void main(String[] args) {
		Iswim fs = new Fish();
		fs.swim();
		Iswim ps = new Person1();
		ps.swim();
		Iswim sm = new Submarine();
		sm.swim();
	}
	
} 

class Person1 implements Iswim{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("�˿�����Ӿ");
	}
	
}

class Submarine implements Iswim{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Ǳˮͧ������Ӿ");
	}
	
}
