package com.ghgj.lesson6.work;

import java.util.Scanner;

public class Demo3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_3.demo3_6();
	}
	
	public static void demo3_6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int a1 = sc.nextInt();
		System.out.println("��������");
		int a2 = sc.nextInt();
		System.out.println("��������");
		int a3 = sc.nextInt();
		int sum = 0;
		if ((a1 % 4 == 0 && a1 / 100 != 0) || a1 / 400 == 0) {// ����
			switch(a2-1) {
			case 12: sum +=31;
			case 11: sum +=30;
			case 10: sum +=31;
			case 9: sum +=30;
			case 8: sum +=31;
			case 7: sum +=31;
			case 6: sum +=30;
			case 5: sum +=31;
			case 4: sum +=30;
			case 3: sum +=31;
			case 2: sum +=29;
			case 1: sum +=31;break;
			default: System.out.println("�������"); break;	
			}
			sum +=a3;
			
		} else {// ��ͨ���
			switch(a2-1) {
			case 12: sum +=31;
			case 11: sum +=30;
			case 10: sum +=31;
			case 9: sum +=30;
			case 8: sum +=31;
			case 7: sum +=31;
			case 6: sum +=30;
			case 5: sum +=31;
			case 4: sum +=30;
			case 3: sum +=31;
			case 2: sum +=28;
			case 1: sum +=31;break;
			default: System.out.println("�������"); break;	
			}
			sum +=a3;
		}

		System.out.println("�����ǽ���ĵ�" + sum + "��");
	}
	
	public static void demo3_5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("����һ�����ڼ��ĵ���");
			String a = sc.next();
			switch (a.charAt(0)) {
			case 'm':
				System.out.println("����һ");
				break;
			case 't':
				if(a.charAt(1)=='u') {
				System.out.println("���ڶ�");
				}else if(a.charAt(1)=='h') {
				System.out.println("������");
				}
				break;
			case 'w':
				System.out.println("������");
				break;
			case 'f':
				System.out.println("������");
				break;
			case 's':
				if(a.charAt(1)=='u') {
					System.out.println("������");
					}else if(a.charAt(1)=='a') {
					System.out.println("������");
					}
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
	}

	public static void demo3_4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����1~24");
		int a = sc.nextInt();
		if(a>=6&&a<=10) {
			System.out.println("�����");
		}else if(a>=11&&a<=13){
			System.out.println("�����");
		}else if(a>=14&&a<=18) {
			System.out.println("�����");
		}else {
			System.out.println("��Ϣʱ��");
		}
	}

	public static void demo3_3() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("����һ����1~12");
			int a = sc.nextInt();
			switch (a) {
			case 1:
			case 2:
			case 3:
				System.out.println("���� ��ů����  �����ļ���   ����");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("����  ��������    ��Ӿ");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("����   �����ˬ    ��ˮ��");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("����   ����ѩ��    ��ѩ");
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
	}

	public static void demo3_2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("����һ����0~6");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				System.out.println("������");
				break;
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
	}

	public static void demo3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����");
		int a = sc.nextInt();
		if (a % 5 == 0) {
			System.out.println("�ܱ�5����");
		} else {
			System.out.println("���ܱ�5����");
		}

	}

}
