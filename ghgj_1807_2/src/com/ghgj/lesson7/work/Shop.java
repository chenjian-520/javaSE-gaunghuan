package com.ghgj.lesson7.work;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=5;i++) {
			sum+=menu(i,3);
		}
		System.out.println("5家商场共消费："+sum+"元！");
	}
	public static int menu(int i,int b) {
		int sum = 0;
		System.out.println("欢迎来到第"+i+"家商场！");
		Scanner sc = new Scanner(System.in);
		for(int j = 0 ;j<b;j++) {
			System.out.print("请输入购物金额：");
			sum += sc.nextInt();
		}
		System.out.println("离开第"+i+"家商场结账："+sum+"元!");
		return sum;
	}
}
