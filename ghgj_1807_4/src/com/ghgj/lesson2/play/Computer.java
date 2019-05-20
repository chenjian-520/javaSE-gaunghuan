package com.ghgj.lesson2.play;

public class Computer extends FatherUser{

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String name, int number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int start(int b) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*(b-1+1)+1);
		return a;
	}

	@Override
	public int punches(int b) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*(b-1+1)+1);
		return a;
	}

}
