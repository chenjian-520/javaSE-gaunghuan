package com.ghgj.lesson2.day5;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Atm.ATM();
	}
	
	public static void ATM() {
		Scanner sc = new Scanner(System.in);
		Atm.print();
		boolean flag= true;
		int  money =10000;
		while(flag) {
		System.out.println("***���������ѡ��");
		String st = sc.next();
		switch(st) {
		case "1": System.out.println("�����������");
				int a1 = sc.nextInt();
				money += a1; 
				System.out.println("�˴δ�����Ϊ��"+a1);
			break;
		case "2": System.out.println("������ȡ�����");
				int a2 = sc.nextInt();
				if(a2>money) {
					System.out.println("���㣬������ѡ��");
					break;
				}
				money -= a2; 
				System.out.println("�˴�ȡ�����Ϊ��"+a2);
			break;
		case "3": System.out.println("��ѯ�����������Ϊ��"+money);
			break;
		case "4": System.out.println("�˳��ɹ���");
				flag = false;
				System.exit(0);  //�˳�JVM
			break;
		default: System.out.println("������������ѡ��");
			break;
		  }
		}
	}
	
	public static void print() {
		System.out.println("********************************");
		System.out.println("\t ATMϵͳ                                          ");
		System.out.println("********************************");
		System.out.println("------------�˵�-----------------");
		System.out.println("\t 1.��Ǯ");
		System.out.println("\t 2.ȡǮ");
		System.out.println("\t 3.��ѯ���");
		System.out.println("\t 4.�˳�");
		System.out.println("--------------------------------");	
		
	}

}
