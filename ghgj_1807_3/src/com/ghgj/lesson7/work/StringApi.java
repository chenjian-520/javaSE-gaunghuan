package com.ghgj.lesson7.work;

import java.util.Scanner;

public class StringApi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11_4();
	}
	
	public static void demo11_4() {
		//���ַ������ַ�������Ȼ˳������
		String str = "abhykiofg";
		char [] str1 =str.toCharArray();
		System.out.println(str1);
		char temp;
		for(int i = 0;i<str1.length-1;i++) {
			for(int j =0;j<str1.length-1-i;j++) {
				if(str1[j]>str1[j+1]) {
					temp = str1[j];
					str1[j]= str1[j+1];
					str1[j+1]=temp;
				}
			}
		}
		for(int i = 0;i<str1.length;i++) {
			int a =str1[i];
			System.out.println(a);
		}
		 str= String.valueOf(str1);
		System.out.println(str);
	}
	
	public static void demo11_3() {
		//��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
		//���罫��abcdefg����תΪ��abfedcg��
		System.out.println("����Ҫ��ת�Ŀ�ʼ�±굽�����±�");
		String str = "abcdefg";
		char [] str1 =str.toCharArray();
		System.out.println(str1);
		Scanner sc = new Scanner(System.in);
		char temp;
		for(int i =sc.nextInt(), j =sc.nextInt();i<=j;i++,j--) {
			temp = str1[i];
			str1[i]= str1[j];
			str1[j]=temp;
		}
		 str= String.valueOf(str1);
		System.out.println(str);
		sc.close();
	}
	public static void demo11_2() {
		String str = "  sssssds  ";
		String str1 = str.trim();
		System.out.println(str1);
			
	}
	public static void demo11_1() {
		System.out.println("-------------��ҵ�ύϵͳ1.0-------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ļ�����");
		String str1 = sc.next();
		System.out.println("�������䣺");
		String str2 = sc.next();
		boolean a = str1.contains(".")&&(!str1.startsWith("."))&&(str1.endsWith(".java"));
		boolean b = str2.contains("@")&&str2.contains(".")&&(str2.indexOf("@")<str2.indexOf("."));
		if(a) {
			System.out.println("�ļ�����ȷ");
		}else {
			System.out.println("�ļ�����ȷ");
		}
		
		if(b) {
			System.out.println("�����ʼ���ȷ");
		}else {
			System.out.println("�����ʼ�����");
		}
		if(a&&b) {
			System.out.println("�ļ��ύ�ɹ�");
		}else {
			System.out.println("�ļ��ύʧ��");
		}
	}
}
