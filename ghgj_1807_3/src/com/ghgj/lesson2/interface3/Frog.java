package com.ghgj.lesson2.interface3;

public class Frog extends Animals implements Iswim { //���� ��  �̳ж���  �ӿ���Ӿ
	public Frog(String name, String color, String type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("��Ȼ�����㣬������Ҳ����Ӿ����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������"+type+"����������");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("��ֻ"+color+"�ģ�����"+name+"�������������ɵĽ�");
	}
}
