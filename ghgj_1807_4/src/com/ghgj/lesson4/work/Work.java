package com.ghgj.lesson4.work;

import java.util.Scanner;

public class Work {
	
	public static void main(String[] args) {
		demo1();
	}
	public static void demo1() {
		Scanner sc = new Scanner(System.in);
		String a="chen";
		String b = "123456";
		String str1 , str2;
		for(int i=2;i>=0;i--) {
			System.out.println("请输入用户名：");
			str1= sc.next();
			System.out.println("请输入密码：");
			str2 = sc.next();
			if(str1.equals(a)&&str2.equals(b)) {
				System.out.println("欢迎登陆shop系统");
				return;
			}else {
				System.out.println("输入错误你还有"+i+"次机会");
			}
		}
		System.out.println("三次机会已用完");
	}
	
	public static void demo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一行字符串");
		String str = sc.next();
		System.out.println("输入从左取几个字符");
		int a = sc.nextInt();
		String str1 = str.substring(0, a);
		System.out.println(str1);
		String str2 = str.substring(0, str.length());
		String str3 = str.substring(str.length()-a);
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
