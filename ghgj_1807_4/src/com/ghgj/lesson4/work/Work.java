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
			System.out.println("�������û�����");
			str1= sc.next();
			System.out.println("���������룺");
			str2 = sc.next();
			if(str1.equals(a)&&str2.equals(b)) {
				System.out.println("��ӭ��½shopϵͳ");
				return;
			}else {
				System.out.println("��������㻹��"+i+"�λ���");
			}
		}
		System.out.println("���λ���������");
	}
	
	public static void demo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���");
		String str = sc.next();
		System.out.println("�������ȡ�����ַ�");
		int a = sc.nextInt();
		String str1 = str.substring(0, a);
		System.out.println(str1);
		String str2 = str.substring(0, str.length());
		String str3 = str.substring(str.length()-a);
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
