package com.ghgj.lesson.carRental;

import java.util.Scanner;

public class Send {
	public static void main(String[] args) {
		Send send = new Send();
		boolean flag = true;
		while(flag) {
			send.menu1();
			System.out.println("�Ƿ�����⳵(y/n)");
			Scanner sc = new Scanner(System.in);
			String str= sc.next();
			if(str.equals("y")) {
				flag = true;
			}else {
				flag = false;
			}
		}
		
	}
	
	public void menu1() {
		System.out.println("--��ӭ�����������޹�˾--");
		System.out.println("--(1.�γ�    2.�ͳ�)--");
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("--������Ҫ���޵���������:");
		int c =sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("--Ҫ���޵�����Ʒ��--");
			System.out.println("--(1.����    2.���)--");
			System.out.print("������ѡ��");
			int a = sc.nextInt();
			if(a == 1) {
				Car car = new Car("����");
				System.out.println("Ҫ���޵������ͺţ�");
				System.out.println("1.����5ϵ");
				System.out.print("--����γ��ͺţ�");
				int b = sc.nextInt();
				car.type = "����5ϵ";
				System.out.print("--����Ҫ���޵�������");
				int d = sc.nextInt();
				System.out.println("-----------------------------------------------------\n");
				System.out.println("���õĽγ�Ʒ�ƣ�"+car.brand+"���ͣ�"+car.type+",ÿ�����"+car.Calrent(a, b));
				System.out.println("����Ҫ֧���ķ���Ϊ��"+car.Calrent(a, b)*d);
				System.out.println("-----------------------------------------------------\n");
			}else {
				a = 2;
				Car car = new Car("���");
				System.out.println("Ҫ���޵������ͺţ�");
				System.out.println("2.���GL6 3.���GL8");
				System.out.print("--����γ��ͺţ�");
				int b = sc.nextInt();
				if(b==2) {
					car.type = "���GL6";
				}else {
					car.type = "���GL8";
				}
				System.out.print("--����Ҫ���޵�������");
				int d = sc.nextInt();
				System.out.println("-----------------------------------------------------\n");
				System.out.println("���õĽγ�Ʒ�ƣ�"+car.brand+"���ͣ�"+car.type+",ÿ�����"+car.Calrent(a, b));
				System.out.println("����Ҫ֧���ķ���Ϊ��"+car.Calrent(a, b)*d);
				System.out.println("-----------------------------------------------------\n");
			}
			break;
		case 2:
			System.out.println("--Ҫ���޵Ŀͳ�Ʒ��--");
			System.out.println("--(1.��    2.����)--");
			System.out.print("������Ʒ�Ʊ�ţ�");
			int b = sc.nextInt();
			Bus bus = new Bus();
			if(b==1) {
				bus.brand="��";
			}else {
				bus.brand="����";
			}
			System.out.print("--������ͳ�����λ����");
			bus.number = sc.nextInt();
			System.out.print("--����Ҫ���޵�������");
			int d = sc.nextInt();
			System.out.println("-----------------------------------------------------\n");
			System.out.println("���õĿͳ�Ʒ�ƣ�"+bus.brand+"��λ����"+bus.number+",ÿ�����"+bus.Calrent(b, d));
			System.out.println("����Ҫ֧���ķ���Ϊ��"+bus.Calrent(b, d)*bus.number);
			System.out.println("-----------------------------------------------------\n");
			break;
		default:
			System.out.println("����������");
			menu1();
			break;
		}
		
	}

	
}
