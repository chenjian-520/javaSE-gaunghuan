package com.ghgj.lesson1.shop;

import java.util.Scanner;

public class UserManager {
	User[] user = new User[1000];
	int number = 0;

	public UserManager() {
		User chen = new User(12, "郭靖", "金卡", 6352);
		user[number] = chen;
		number++;

	}

	public void addUser(User chen) { // 添加

		user[number] = chen;
		number++;

	}

	public void queryUser() {
		if (user[0] == null) {
			System.out.println("--没有客户信息--");
			return; // 结束方法
		}
		System.out.println("编号\t名字\t类型\t积分");
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else {
				System.out.println(user[i].show());
			}
		}
	}

	public void alterUser(int num) {
		boolean flag = true;// 修改客户信息
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				flag = false;
				Scanner sc1 = new Scanner(System.in);
				/*
				 * System.out.println("请输入新的编号："); user[i].number = sc1.nextInt();
				 * System.out.println("请输入新的用户名："); user[i].name = sc1.next();
				 * System.out.println("请输入新的类型："); user[i].type = sc1.next();
				 */
				System.out.println("请输入新的积分：");
				user[i].setIntegrals(sc1.nextInt());

			}

		}
		while (flag) {
			System.out.println("没有找到该客户信息！");
			break;
		}
		return;
	}

	public void deleteUser(int num1) {// 删除客户信息
		boolean flag1 = false;
		int a = 0;
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num1) {
				flag1 = true;
				a = i;
			}
		}
		if (flag1) {
			user[a].set(0, null, null, 0);
			System.out.println("删除用户成功！");
			number--;
			for (int i = a; i < user.length - 1; i++) {
				user[i] = user[i + 1];
				if (user[i] == null) {
					break;
				}
			}
			if (user[user.length - 1] != null) {
				user[user.length - 1] = null;
			}
		} else {
			System.out.println("没有找到该客户信息！");
		}
	}

	public void luckUser(int num) { // 幸运大放送
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				if (user[i].getType().equals("金卡") && user[i].getIntegrals() >= 1000) {
					System.out.println("--用户信息--");
					System.out.println(user[i].show());
					System.out.println("--累加后--");
					user[i].setIntegrals(user[i].getIntegrals() + 500);
					System.out.println(user[i].show());
				} else if (user[i].getType().equals("普通") && user[i].getIntegrals() >= 5000) {
					System.out.println("--用户信息--");
					System.out.println(user[i].show());
					System.out.println("--累加后--");
					user[i].setIntegrals(user[i].getIntegrals() + 500);
					System.out.println(user[i].show());
				} else {
					System.out.println("谢谢参与！");
				}
			}
		}
	}

	public void luckUser2(int num) { // 幸运抽奖
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				if (user[i].getType().equals("金卡") && user[i].getIntegrals() >= 15000) {
					System.out.println("--用户信息--");
					System.out.println(user[i].show());
					System.out.println("--领取笔记本电脑一台--");
				} else if (user[i].getType().equals("金卡") && user[i].getIntegrals() >= 8000) {
					System.out.println("--用户信息--");
					System.out.println(user[i].show());
					System.out.println("--领取小米6手机--");
				} else {
					System.out.println("谢谢参与！");
				}
			}
		}
	}

}
