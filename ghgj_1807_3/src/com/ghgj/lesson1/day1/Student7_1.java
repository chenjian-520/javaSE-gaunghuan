package com.ghgj.lesson1.day1;

import java.util.Scanner;

public class Student7_1 {
	int id;
	String sex;
	String name;
	
	public static int mark(int day) {
		return 1000-3*day;
	}
	
	public static void main(String[] args) {
		Student7_1 student = new Student7_1();
		System.out.println(student.mark(20));
		luck();
		
	}
	
	
	public static void luck() {
		Scanner sc = new Scanner(System.in); 
		String [] name = new String [] {"����","����","ŷ����","������","���"}; 
		while(true) {
		int a = (int)(Math.random()*7+1);
		switch(a) {
		case 1: System.out.println(name[a-1]+"�н�");break;
		case 2:	System.out.println(name[a-1]+"�н�");break;
		case 3:	System.out.println(name[a-1]+"�н�");break;
		case 4:	System.out.println(name[a-1]+"�н�");break;
		case 5:	System.out.println(name[a-1]+"�н�");break;
		default:System.out.println("û�����н�");break;
		}
		System.out.println("�Ƿ�����齱��y/n����");
		String b =sc.next();
		if(b.equals("n") ) {
			break;
		}
		}
	}
}






