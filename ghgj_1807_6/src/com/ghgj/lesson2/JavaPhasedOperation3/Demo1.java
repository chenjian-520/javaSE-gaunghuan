package com.ghgj.lesson2.JavaPhasedOperation3;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个数:");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		double sum = 0 ;
		if(a%2==0) {
			for(double i =2;i<=a;i+=2) {
				sum +=1/i;
			}
		}else {
			for(double i =1;i<=a;i+=2) {
				sum +=1/i;
			}
		}
		System.out.println("和为："+sum);
	}
}
