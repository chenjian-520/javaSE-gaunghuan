package com.ghgj.lesson2.play;

import java.util.Scanner;

public class Game {
	String [] name= {"null","吸血鬼","狼人","变形金刚"};
	String [] quan= {"null","剪刀","石头","布"};
	public static void main(String[] args) {
		Game  game = new Game();
		game.menu();
	}
	
	public void menu() {	
		System.out.println("--------------欢迎进入游戏世界---------------\n\n");
		System.out.println("        *************************          ");
		System.out.println("        **       猜拳，开始                      **          ");
		System.out.println("        *************************          ");
		System.out.println("出拳规则：1.剪刀，2.石头，3.布");
		Scanner sc = new Scanner(System.in);
		System.out.println("请为直接选择角色：(1.吸血鬼,2.狼人,3.变形金刚)");
		int a1 = sc.nextInt();
		FatherUser cu = new User(name[a1]);
		System.out.println("我选择的角色是:"+cu.getName());
		FatherUser cp = new Computer();
		int b1 = cp.start(3);  // 3随机出的最大数
		cp.setName(name[b1]);
		System.out.println("计算机随机选择的角色是："+cp.getName());
		System.out.println("\n\n要开始游戏吗？\n");
		boolean flag = true;
		int i =0;
		while(flag) {
			System.out.println("清出拳：1.剪刀，2.石头，3.布");
			int c = sc.nextInt();
			System.out.println("你出拳："+quan[c]);
			int c1 = cp.punches(3);
			System.out.println("电脑出拳："+quan[c1]);
			switch(c) {
			case 1:
				if(c1==1) {
				System.out.println("结果：和局，真衰你等着把");
			}else if(c1==2) {
				System.out.println("结果：（电脑）"+cp.getName()+"你赢了");
				cp.addNumber();
			}else if (c1==3) {
				System.out.println("结果："+cp.getName()+"你赢了");
				cu.addNumber();
			}
				break;
			case 2:
				if(c1==1) {
					System.out.println("结果："+cp.getName()+"你赢了");
					cu.addNumber();
				}else if(c1==2) {
					System.out.println("结果：和局，真衰你等着把");
				}else if (c1==3) {
					System.out.println("结果：（电脑）"+cp.getName()+"你赢了");
					cp.addNumber();
				}
				break;
			case 3:
				if(c1==1) {
					System.out.println("结果：（电脑）"+cp.getName()+"你赢了");
					cp.addNumber();
				}else if(c1==2) {
					System.out.println("结果："+cp.getName()+"你赢了");
					cu.addNumber();
				}else if (c1==3) {
					System.out.println("结果：和局，真衰你等着把");
				}
				break;
			}
			
			System.out.println("是否开始下一轮（y/n）");
			i++;
			String st = sc.next();
			if(st.equals("y")) {
				flag = true;
			}else {
				System.out.println("（机器）"+cp.getName()+"  VS  "+"人"+cu.getName());
				System.out.println("对战次数："+i);
				System.out.println(cp.getNumber()+"   "+cu.getNumber());
				if(cu.getNumber()>cp.getNumber()) {
					System.out.println("结果：(人)"+cu.getName()+"获胜");
				}else if(cu.getNumber()<cp.getNumber()) {
					System.out.println("结果：(机器)"+cp.getName()+"获胜");
				}else if(cu.getNumber()==cp.getNumber()) {
					System.out.println("平局");
				}
				flag = false;
			}
				
		}
		

	
	
	}
}
