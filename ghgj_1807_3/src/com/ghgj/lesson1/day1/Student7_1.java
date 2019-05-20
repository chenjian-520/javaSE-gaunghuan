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
		String [] name = new String [] {"郭靖","黄蓉","欧阳锋","张三丰","杨过"}; 
		while(true) {
		int a = (int)(Math.random()*7+1);
		switch(a) {
		case 1: System.out.println(name[a-1]+"中奖");break;
		case 2:	System.out.println(name[a-1]+"中奖");break;
		case 3:	System.out.println(name[a-1]+"中奖");break;
		case 4:	System.out.println(name[a-1]+"中奖");break;
		case 5:	System.out.println(name[a-1]+"中奖");break;
		default:System.out.println("没有人中奖");break;
		}
		System.out.println("是否继续抽奖（y/n）：");
		String b =sc.next();
		if(b.equals("n") ) {
			break;
		}
		}
	}
}






