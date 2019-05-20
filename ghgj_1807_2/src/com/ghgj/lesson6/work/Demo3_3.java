package com.ghgj.lesson6.work;

import java.util.Scanner;

public class Demo3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_3.demo3_6();
	}
	
	public static void demo3_6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年");
		int a1 = sc.nextInt();
		System.out.println("请输入月");
		int a2 = sc.nextInt();
		System.out.println("请输入日");
		int a3 = sc.nextInt();
		int sum = 0;
		if ((a1 % 4 == 0 && a1 / 100 != 0) || a1 / 400 == 0) {// 闰年
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
			default: System.out.println("输入错误"); break;	
			}
			sum +=a3;
			
		} else {// 普通年份
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
			default: System.out.println("输入错误"); break;	
			}
			sum +=a3;
		}

		System.out.println("今天是今年的第" + sum + "天");
	}
	
	public static void demo3_5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("输入一个星期几的单词");
			String a = sc.next();
			switch (a.charAt(0)) {
			case 'm':
				System.out.println("星期一");
				break;
			case 't':
				if(a.charAt(1)=='u') {
				System.out.println("星期二");
				}else if(a.charAt(1)=='h') {
				System.out.println("星期四");
				}
				break;
			case 'w':
				System.out.println("星期三");
				break;
			case 'f':
				System.out.println("星期五");
				break;
			case 's':
				if(a.charAt(1)=='u') {
					System.out.println("星期日");
					}else if(a.charAt(1)=='a') {
					System.out.println("星期六");
					}
				break;
			default:
				System.out.println("输入有误");
				break;
			}
		}
	}

	public static void demo3_4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数1~24");
		int a = sc.nextInt();
		if(a>=6&&a<=10) {
			System.out.println("上午好");
		}else if(a>=11&&a<=13){
			System.out.println("中午好");
		}else if(a>=14&&a<=18) {
			System.out.println("下午好");
		}else {
			System.out.println("休息时间");
		}
	}

	public static void demo3_3() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("输入一个数1~12");
			int a = sc.nextInt();
			switch (a) {
			case 1:
			case 2:
			case 3:
				System.out.println("春天 春暖花开  恋爱的季节   春游");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("夏天  夏日炎炎    游泳");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("秋天   秋高气爽    采水果");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("冬天   冰天雪地    滑雪");
				break;
			default:
				System.out.println("输入有误");
				break;
			}
		}
	}

	public static void demo3_2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("输入一个数0~6");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				System.out.println("星期日");
				break;
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			default:
				System.out.println("输入有误");
				break;
			}
		}
	}

	public static void demo3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = sc.nextInt();
		if (a % 5 == 0) {
			System.out.println("能被5整除");
		} else {
			System.out.println("不能被5整除");
		}

	}

}
