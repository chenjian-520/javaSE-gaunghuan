package com.ghgj.lesson6.work;

interface IRent {
	public abstract void rent();
}

class Landlord implements IRent{

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("���������������н�����ⷿ>>>>>>");
		System.out.println("�н�������>>>>>>");
		System.out.println("---------------------");	
	}
}

class Intermediary implements IRent{
	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("ʵ����ķ�ʽ>>>>>");
		System.out.println("�н鿪ʼ�����ⷿ>>>>>");
	}
}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRent ren = new Landlord();
		IRent ren1 = new Intermediary();
		ren1.rent();
		ren.rent();
		//�����ڲ���
		new Intermediary() {
			@Override
			public void rent() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ķ�ʽ>>>>>");
				System.out.println("�н鿪ʼ�����ⷿ>>>>>");
			}	
		}.rent();
		new Landlord() {
			@Override
			public void rent() {
				// TODO Auto-generated method stub
				System.out.println("���������������н�����ⷿ>>>>>>");
				System.out.println("�н�������>>>>>>");
				System.out.println("---------------------");
			}
		}.rent();
		//lamdba ���ʽ
		IRent  lan =	()->{
			System.out.println("���������������н�����ⷿ>>>>>>");
			System.out.println("�н�������>>>>>>");
			System.out.println("---------------------");
		};
		IRent  lan1 = ()->{
			System.out.println("lamdba ���ʽ�ķ�ʽ>>>>>");
			System.out.println("�н鿪ʼ�����ⷿ>>>>>");
		};
		
		lan1.rent();
		lan.rent();
		
	}

}
