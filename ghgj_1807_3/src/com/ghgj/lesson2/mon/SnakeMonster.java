package com.ghgj.lesson2.mon;

public class SnakeMonster extends Subtle {
	
	
	public SnakeMonster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnakeMonster(String name, int lifeValue, int agressvity) {
		super(name, lifeValue, agressvity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�����ƶ�");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("��������");
		System.out.println(this.toString());
		
	}

	public void addBlood() {  //��Ѫ
		if (lifeValue <= 10) {
			lifeValue += 20;
		}
	}
}
