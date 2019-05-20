package com.ghgj.lesson4.animal;

public class Duck extends Animal implements ITerrestrial {
	private int legNum;
	
	public Duck(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("¸Â¸Â¸Â");;
	}

	@Override
	public String toString() {
		return "Duck [legNum=" + legNum + ", getName()=" + getName() + "]";
	}

	@Override
	public int getLegNum() {
		// TODO Auto-generated method stub
		return legNum;
	}

}
