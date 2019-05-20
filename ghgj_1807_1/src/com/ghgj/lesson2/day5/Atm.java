package com.ghgj.lesson2.day5;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Atm.ATM();
	}
	
	public static void ATM() {
		Scanner sc = new Scanner(System.in);
		Atm.print();
		boolean flag= true;
		int  money =10000;
		while(flag) {
		System.out.println("***请输入你的选择");
		String st = sc.next();
		switch(st) {
		case "1": System.out.println("请输入存入金额");
				int a1 = sc.nextInt();
				money += a1; 
				System.out.println("此次存入金额为："+a1);
			break;
		case "2": System.out.println("请输入取出金额");
				int a2 = sc.nextInt();
				if(a2>money) {
					System.out.println("余额不足，请重新选择");
					break;
				}
				money -= a2; 
				System.out.println("此次取出金额为："+a2);
			break;
		case "3": System.out.println("查询服务，您的余额为："+money);
			break;
		case "4": System.out.println("退出成功！");
				flag = false;
				System.exit(0);  //退出JVM
			break;
		default: System.out.println("输入错误请从新选择");
			break;
		  }
		}
	}
	
	public static void print() {
		System.out.println("********************************");
		System.out.println("\t ATM系统                                          ");
		System.out.println("********************************");
		System.out.println("------------菜单-----------------");
		System.out.println("\t 1.存钱");
		System.out.println("\t 2.取钱");
		System.out.println("\t 3.查询余额");
		System.out.println("\t 4.退出");
		System.out.println("--------------------------------");	
		
	}

}
