package com.ghgj.lesson6.work;

import java.util.Scanner;

public class Demo3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_2.demo3_5();
	}

	public static void demo3_5() {
		int[] year1 = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] year2 = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int a1 = sc.nextInt();
		System.out.println("��������");
		int a2 = sc.nextInt();
		System.out.println("��������");
		int a3 = sc.nextInt();
		int sum = 0;
		if ((a1 % 4 == 0 && a1 / 100 != 0) || a1 / 400 == 0) {// ����
				for (int i = 0; i < a2 - 1; i++) {
					sum += year1[i];
				}		sum += a3;
			
		} else {// ��ͨ���
			for (int i = 0; i < a2 - 1; i++) {
				sum += year2[i];
			}
			sum += a3;
		}

		System.out.println("�����ǽ���ĵ�" + sum + "��");
	}

	public static void demo3_4() {
		int a = 1, b = 0, c = 0;
		boolean fa = true;
		Scanner sc = new Scanner(System.in);
		while (a != 0) {
			System.out.println("����һ������");
			a = sc.nextInt();
			while (fa) {
				c = a;
				fa = false;
			}
			if (a > b) {
				b = a;
			} else if (a < c && a != 0) {
				c = a;
			}
		}
		System.out.println("���Ϊ " + b + "��СΪ" + c);
	}

	public static void demo3_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������");
		int a = sc.nextInt();
		boolean fg = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println("������Ƿ�����");
				fg = false;
			}
		}
		while (fg) {
			System.out.println("�����������");
			break;
		}
	}

	public static void demo3_2() {
		int a = 50, i = 0;
		while (a > 3) {
			a = a - 3;
			i++;
		}
		System.out.println("һ������" + i + "ƿ");
	}

	public static void demo3_1() {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[50];
		int a = 1, i = 0, sum = 0;
		while (a != -1) {
			System.out.println("����ɼ���");
			a = sc.nextInt();
			if (a != -1) {
				su[i] = a;
				sum += su[i];
				i++;
			}
		}
		System.out.println(sum + "   " + i);
	}

}
