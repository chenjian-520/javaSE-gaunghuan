package com.ghgj.lesson3.shop;

import java.util.Scanner;

public class Menu {
	static CartOperator co= new CartOperator();
	public static void menu(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѡ��");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("�������ţ�");
			int number = sc.nextInt();
			System.out.print("���������ƣ�");
			String name = sc.next();
			System.out.print("������۸�");
			int price = sc.nextInt();
			System.out.print("������������");
			int quantity = sc.nextInt();
			Goods goods = new Goods(number,name,price,quantity);
			co.add(goods);
			menu();
			break;
		case 2:
			System.out.print("������Ҫ�޸ĵı�ţ�");
			int c=sc.nextInt();
			System.out.print("�������µ�������");
			int b = sc.nextInt();
			co.take(c, b);
			menu();
			break;
		case 3:
			System.out.print("������Ҫɾ���ı�ţ�");
			int d=sc.nextInt();
			co.remove1(d);
			menu();
			break;
		case 4:
			co.query();
			menu();
			break;
		case 5:
			System.out.println("�˳��ɹ�");
			System.exit(0);
			break;
		default:
			System.out.println("�������");
			menu();
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println("****************�˵�*****************");
		System.out.println("1.���   2.�޸�   3.ɾ����Ʒ   4.��ѯȫ��   5.�˳�");
		System.out.println("************************************");
		menu();
	}
}
