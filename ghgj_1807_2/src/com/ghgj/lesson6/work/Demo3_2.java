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
		System.out.println("请输入年");
		int a1 = sc.nextInt();
		System.out.println("请输入月");
		int a2 = sc.nextInt();
		System.out.println("请输入日");
		int a3 = sc.nextInt();
		int sum = 0;
		if ((a1 % 4 == 0 && a1 / 100 != 0) || a1 / 400 == 0) {// 闰年
				for (int i = 0; i < a2 - 1; i++) {
					sum += year1[i];
				}		sum += a3;
			
		} else {// 普通年份
			for (int i = 0; i < a2 - 1; i++) {
				sum += year2[i];
			}
			sum += a3;
		}

		System.out.println("今天是今年的第" + sum + "天");
	}

	public static void demo3_4() {
		int a = 1, b = 0, c = 0;
		boolean fa = true;
		Scanner sc = new Scanner(System.in);
		while (a != 0) {
			System.out.println("输入一个数：");
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
		System.out.println("最大为 " + b + "最小为" + c);
	}

	public static void demo3_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数：");
		int a = sc.nextInt();
		boolean fg = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println("这个数是非素数");
				fg = false;
			}
		}
		while (fg) {
			System.out.println("这个数是素数");
			break;
		}
	}

	public static void demo3_2() {
		int a = 50, i = 0;
		while (a > 3) {
			a = a - 3;
			i++;
		}
		System.out.println("一共喝完" + i + "瓶");
	}

	public static void demo3_1() {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[50];
		int a = 1, i = 0, sum = 0;
		while (a != -1) {
			System.out.println("输入成绩：");
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
