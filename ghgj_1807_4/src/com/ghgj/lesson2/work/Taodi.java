package com.ghgj.lesson2.work;

public class Taodi extends Music{



	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("������"+getName()+"����");
	}

	public Taodi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class Xiao extends Music{

	public Xiao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("������"+getName()+"����");
	}
	
	
}
