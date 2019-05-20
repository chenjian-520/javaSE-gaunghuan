package com.ghgj.lesson3.shop;

import java.util.Scanner;

public class Menu {
	static CartOperator co= new CartOperator();
	public static void menu(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入选择：");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("请输入编号：");
			int number = sc.nextInt();
			System.out.print("请输入名称：");
			String name = sc.next();
			System.out.print("请输入价格：");
			int price = sc.nextInt();
			System.out.print("请输入数量：");
			int quantity = sc.nextInt();
			Goods goods = new Goods(number,name,price,quantity);
			co.add(goods);
			menu();
			break;
		case 2:
			System.out.print("请输入要修改的编号：");
			int c=sc.nextInt();
			System.out.print("请输入新的数量：");
			int b = sc.nextInt();
			co.take(c, b);
			menu();
			break;
		case 3:
			System.out.print("请输入要删除的编号：");
			int d=sc.nextInt();
			co.remove1(d);
			menu();
			break;
		case 4:
			co.query();
			menu();
			break;
		case 5:
			System.out.println("退出成功");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误");
			menu();
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println("****************菜单*****************");
		System.out.println("1.添加   2.修改   3.删除商品   4.查询全部   5.退出");
		System.out.println("************************************");
		menu();
	}
}
