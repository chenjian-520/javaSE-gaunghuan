package com.ghgj.lesson1.atm;

import java.util.Scanner;

public class Menu {
	
	UserManger  um = new UserManger();
	
	public void menu1() {
		System.out.println("-----------ATM管理系统---------");
		System.out.println("  1.登录        2.开户      3.退出     4.查询     ");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("--输入选择：");
		int a = sc.nextInt();
		switch(a) {
		case 1 :
			System.out.println("--输入卡号");
			String number = sc.next();
			System.out.println("--输入密码");
			String password = sc.next();
			boolean bl = um.login(number,password);
			if(bl) {
				System.out.println("密码正确！");
				menu3();
			}else {
				System.out.println("先开户！");
				menu1();
			}
			break;
		case 2 : menu2();
			break;
		case 3 : 
			System.out.println("成功退出");
			System.exit(0);
			break;
		case 4:
			um.xun();
			menu1();
			break;
		default: 
			System.out.println("请重新输入：");
			menu1();
			break;
		}	
	}
	
	public void menu2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--输入卡号");
		String number = sc.next();
		System.out.println("--输入密码");
		String password = sc.next();
		User chen = new User(number,password);
		um.addUser(chen);   //建立新用户对象   开户	
		menu1();
	}
	
	public void menu3() {
		System.out.println("----------------------主菜单--------------------");
		System.out.println("    1.存钱	2.取钱	3.转账	4.查余额	5.退出                ");
		System.out.println("----------------------------------------------");
		System.out.println("--输入选择");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("请输入存款金额：");
			um.addMoney(sc.nextInt());
			menu3();
			break;
		case 2: 
			System.out.println("请输入取款金额：");
			um.takeMoney(sc.nextInt());
			menu3();	
			break;
		case 3:
			System.out.println("请输入转账人账号： ");
			String number=sc.next();
			System.out.println("请输入转账金额 ：");
			int money = sc.nextInt();
			boolean bea=um.transfer(number,money);
			if(bea) {
				System.out.println("转账成功");
				menu3();
			}else{
				System.out.println("转账失败请核对转账人账号");
				menu3();
			}
			break;
		case 4: 
			um.query();
			menu3();
			break;
		case 5:
			System.out.println("成功退出");
			System.exit(0);
			break;
		default:
			System.out.println("请重新输入：");
			menu3();
			break;
		}
		
	}
}





















