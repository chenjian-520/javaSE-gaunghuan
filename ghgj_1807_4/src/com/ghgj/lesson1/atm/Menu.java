package com.ghgj.lesson1.atm;

import java.util.Scanner;

public class Menu {
	
	UserManger  um = new UserManger();
	
	public void menu1() {
		System.out.println("-----------ATM����ϵͳ---------");
		System.out.println("  1.��¼        2.����      3.�˳�     4.��ѯ     ");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("--����ѡ��");
		int a = sc.nextInt();
		switch(a) {
		case 1 :
			System.out.println("--���뿨��");
			String number = sc.next();
			System.out.println("--��������");
			String password = sc.next();
			boolean bl = um.login(number,password);
			if(bl) {
				System.out.println("������ȷ��");
				menu3();
			}else {
				System.out.println("�ȿ�����");
				menu1();
			}
			break;
		case 2 : menu2();
			break;
		case 3 : 
			System.out.println("�ɹ��˳�");
			System.exit(0);
			break;
		case 4:
			um.xun();
			menu1();
			break;
		default: 
			System.out.println("���������룺");
			menu1();
			break;
		}	
	}
	
	public void menu2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--���뿨��");
		String number = sc.next();
		System.out.println("--��������");
		String password = sc.next();
		User chen = new User(number,password);
		um.addUser(chen);   //�������û�����   ����	
		menu1();
	}
	
	public void menu3() {
		System.out.println("----------------------���˵�--------------------");
		System.out.println("    1.��Ǯ	2.ȡǮ	3.ת��	4.�����	5.�˳�                ");
		System.out.println("----------------------------------------------");
		System.out.println("--����ѡ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("���������");
			um.addMoney(sc.nextInt());
			menu3();
			break;
		case 2: 
			System.out.println("������ȡ���");
			um.takeMoney(sc.nextInt());
			menu3();	
			break;
		case 3:
			System.out.println("������ת�����˺ţ� ");
			String number=sc.next();
			System.out.println("������ת�˽�� ��");
			int money = sc.nextInt();
			boolean bea=um.transfer(number,money);
			if(bea) {
				System.out.println("ת�˳ɹ�");
				menu3();
			}else{
				System.out.println("ת��ʧ����˶�ת�����˺�");
				menu3();
			}
			break;
		case 4: 
			um.query();
			menu3();
			break;
		case 5:
			System.out.println("�ɹ��˳�");
			System.exit(0);
			break;
		default:
			System.out.println("���������룺");
			menu3();
			break;
		}
		
	}
}





















