package com.ghgj.lesson2.interface3;

public class Rabbit extends Animals {  //������ �̳ж�����

	public Rabbit(String name, String color, String type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������"+type+"���Ժ��ܲ�");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("��ֻ"+color+"�ģ�����"+name+"��������������Ľ�");
	}

}
