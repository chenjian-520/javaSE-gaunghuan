package com.ghgj.lesson1.shop;

import java.util.Scanner;

public class Shop {
	UserManager users = new UserManager();


	public void loginMeru() {
		System.out.println("***********我爱Shopping管理系统*************");
		System.out.println("             1.登录系统                                                           ");
		System.out.println("             2.退出系统                                                           ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			AdmiUser u1 = new AdmiUser("admin", "000000");
			System.out.println("登录系统 :");
			System.out.print("请输入用户名：");
			String nu = sc.next();
			System.out.print("请输入用户名密码 ：");
			String cd = sc.next();
			boolean bl = u1.login(nu, cd);
			if (bl) {
				mainMeru();
			} else {
				System.out.println("没有权限");
			}
			break;
		case 2:
			System.out.println("退出系统 :");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误请重新输入:");
			loginMeru();
			break;
		}
		sc.close();
	}

	public void mainMeru() {
		System.out.println("           我爱Shopping管理系统                                       ");
		System.out.println("****************************************");
		System.out.println("             1.客户信息管理                                                    ");
		System.out.println("             2.真情回馈                                                           ");
		System.out.println("             0.返回                                                                  ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("客户信息管理 :");
			userMenu();
			break;
		case 2:
			System.out.println("真情回馈:");
			sendMenu();
			break;
		case 0:
			System.out.println("返回上一界面 :");
			loginMeru();
			break;
		default:
			System.out.println("输入错误请重新输入:");
			mainMeru();
			break;
		}
		sc.close();
	}

	public void userMenu() {
		System.out.println("     我爱Shopping管理系统>>客户信息管理                           ");
		System.out.println("****************************************");
		System.out.println("             1.显示所有客户信息                                           ");
		System.out.println("             2.增加客户信息                                                   ");
		System.out.println("             3.修改                                                                   ");
		System.out.println("             4.删除客户信息                                                   ");
		System.out.println("             5.返回上一界面                                                   ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("客户信息 :");
			users.queryUser(); // 查询用户方法
			userMenu();
			break;
		case 2:
			System.out.println("增加客户信息 :");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入编号：");
			int a1 = sc1.nextInt();
			System.out.println("请输入用户名：");
			String a2 = sc1.next();
			System.out.println("请输入类型：");
			String a3 = sc1.next();
			System.out.println("请输入积分：");
			int a4 = sc1.nextInt();
			User chen = new User(a1, a2, a3, a4);
			users.addUser(chen); // 添加用户方法
			userMenu();
			break;
		case 3:
			System.out.println("修改客户信息 :");
			System.out.println("输入用户编号：");
			int num = sc.nextInt(); // 需要修改的用户编号
			users.alterUser(num); // 修改用户信息方法
			userMenu();
			break;
		case 4:
			System.out.println("删除客户信息 :");
			System.out.println("输入需要删除的用户编号：");
			int num1 = sc.nextInt(); // 需要修改的用户编号
			users.deleteUser(num1);
			userMenu();
			break;
		case 5:
			System.out.println("返回上一界面 :");
			mainMeru();
			break;
		default:
			System.out.println("输入错误请重新输入:");
			userMenu();
			break;
		}
		sc.close();
	}

	public void sendMenu() {
		System.out.println("           我爱Shopping管理系统 真情回馈                        ");
		System.out.println("****************************************");
		System.out.println("             1.幸运大放送                                                    ");
		System.out.println("             2.幸运抽奖                                                          ");
		System.out.println("             0.返回                                                                  ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("幸运大放送  :");
			System.out.print("请输入会员编号：");
			int nu = sc.nextInt();
			users.luckUser(nu);
			sendMenu();
			break;
		case 2:
			System.out.println("幸运抽奖  :");
			System.out.print("请输入会员编号：");
			int nb = sc.nextInt();
			users.luckUser2(nb);
			sendMenu();
			break;
		case 0:
			System.out.println("返回上一界面 :");
			mainMeru();
			break;
		default:
			System.out.println("输入错误请重新输入:");
			sendMenu();
			break;
		}
		sc.close();
	}

}
