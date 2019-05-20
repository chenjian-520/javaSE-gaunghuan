package com.ghgj.lesson4.work;

import java.io.InputStream;
import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		Work a = new Work();
		a.demo2();

	}

	public void demo1() { // 判断是不是元音字符
		System.out.println("请输入一个字符");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		switch (a) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println("是元音字母！");
			break;
		default:
			System.out.println("不是元音字母！");
			break;
		}

	}

	public void demo2() {
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
			}
			sum += a3;
		} else {// 普通年份
			for (int i = 0; i < a2 - 1; i++) {
				sum += year2[i];
			}
			sum += a3;
		}

		System.out.println("今天是今年的第" + sum + "天");
	}

	public void demo3() {
		int[] su = new int[] { 15, 25, 260, 215, 34, 85, 95, 34, 15, 78 };
		System.out.println("数组元素");
		double sum = 0;
		for (int a : su) {
			System.out.print(a + "  ");
			sum += a;
		}
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {

				if (su[i] > su[j]) {
					su[i] = su[i] + su[j];
					su[j] = su[i] - su[j];
					su[i] = su[i] - su[j];
				}
			}

		}
		System.out.println();
		System.out.println("数组最大值为：" + su[su.length - 1]);
		System.out.println("数组平均值为：" + sum / 10);
		System.out.println("排序：");
		for (int a : su) {
			System.out.print(a + "  ");
		}

	}

	public int demo4(int sum) {

		sum = (sum + 1) * 2;
		return sum;
	}

	public void demo5() {
		int sum = 1;
		for (int i = 1; i < 10; i++) {
			sum = demo4(sum);
		}
		System.out.println("第一天摘了" + sum + "个桃子");
	}

}
