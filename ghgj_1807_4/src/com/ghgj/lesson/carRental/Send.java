package com.ghgj.lesson.carRental;

import java.util.Scanner;

public class Send {
	public static void main(String[] args) {
		Send send = new Send();
		boolean flag = true;
		while(flag) {
			send.menu1();
			System.out.println("是否继续租车(y/n)");
			Scanner sc = new Scanner(System.in);
			String str= sc.next();
			if(str.equals("y")) {
				flag = true;
			}else {
				flag = false;
			}
		}
		
	}
	
	public void menu1() {
		System.out.println("--欢迎来到汽车租赁公司--");
		System.out.println("--(1.轿车    2.客车)--");
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("--请输入要租赁的汽车类型:");
		int c =sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("--要租赁的汽车品牌--");
			System.out.println("--(1.宝马    2.别克)--");
			System.out.print("请输入选择：");
			int a = sc.nextInt();
			if(a == 1) {
				Car car = new Car("宝马");
				System.out.println("要租赁的汽车型号：");
				System.out.println("1.宝马5系");
				System.out.print("--输入轿车型号：");
				int b = sc.nextInt();
				car.type = "宝马5系";
				System.out.print("--输入要租赁的天数：");
				int d = sc.nextInt();
				System.out.println("-----------------------------------------------------\n");
				System.out.println("租用的轿车品牌："+car.brand+"类型："+car.type+",每天租金："+car.Calrent(a, b));
				System.out.println("你需要支付的费用为："+car.Calrent(a, b)*d);
				System.out.println("-----------------------------------------------------\n");
			}else {
				a = 2;
				Car car = new Car("别克");
				System.out.println("要租赁的汽车型号：");
				System.out.println("2.别克GL6 3.别克GL8");
				System.out.print("--输入轿车型号：");
				int b = sc.nextInt();
				if(b==2) {
					car.type = "别克GL6";
				}else {
					car.type = "别克GL8";
				}
				System.out.print("--输入要租赁的天数：");
				int d = sc.nextInt();
				System.out.println("-----------------------------------------------------\n");
				System.out.println("租用的轿车品牌："+car.brand+"类型："+car.type+",每天租金："+car.Calrent(a, b));
				System.out.println("你需要支付的费用为："+car.Calrent(a, b)*d);
				System.out.println("-----------------------------------------------------\n");
			}
			break;
		case 2:
			System.out.println("--要租赁的客车品牌--");
			System.out.println("--(1.金杯    2.金龙)--");
			System.out.print("请输入品牌编号：");
			int b = sc.nextInt();
			Bus bus = new Bus();
			if(b==1) {
				bus.brand="金杯";
			}else {
				bus.brand="金龙";
			}
			System.out.print("--请输入客车的座位数：");
			bus.number = sc.nextInt();
			System.out.print("--输入要租赁的天数：");
			int d = sc.nextInt();
			System.out.println("-----------------------------------------------------\n");
			System.out.println("租用的客车品牌："+bus.brand+"座位数："+bus.number+",每天租金："+bus.Calrent(b, d));
			System.out.println("你需要支付的费用为："+bus.Calrent(b, d)*bus.number);
			System.out.println("-----------------------------------------------------\n");
			break;
		default:
			System.out.println("请重新输入");
			menu1();
			break;
		}
		
	}

	
}
