package com.ghgj.lesson4.animal;

public class Cat extends Animal implements ITerrestrial {
	int legNum;
	
	public Cat(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}

	@Override
	public int getLegNum() {
		// TODO Auto-generated method stub
		return legNum;
	}

	@Override
	public String toString() {
		return "Cat [legNum=" + legNum + ", getName()=" + getName() + "]";
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ίχίχίχ");
	}
	

}
