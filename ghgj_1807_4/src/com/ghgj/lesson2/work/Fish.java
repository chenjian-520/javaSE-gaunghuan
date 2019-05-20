package com.ghgj.lesson2.work;

public class Fish implements Iswim {
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("鱼可以游泳");
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
		System.out.println("人可以游泳");
	}
	
}

class Submarine implements Iswim{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("潜水艇可以游泳");
	}
	
}
