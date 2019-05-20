package com.ghgj.lesson2.JavaPhasedOperation3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("输入两个数：");
		String a=sc.next();
		String b=sc.next();
		Demo3 d=new Demo3();
		try {
			d.str1(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("输入错误");
		}
		try {
			d.str1(Double.valueOf(a), Double.valueOf(b));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			System.out.println("输入错误");
		}
		try {
			d.str1(Integer.valueOf(a), Integer.valueOf(b));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("输入错误");
		}
	}

	
	
	public void str1(String a ,String b) {
		System.out.println(a.concat(b));
	}
	public void str1(int a ,int b) {
		System.out.println(a+b);
	}
	public void str1(double a ,double b) {
		System.out.println(a+b);
	}
}
