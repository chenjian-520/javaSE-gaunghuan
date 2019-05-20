package com.ghgj.lesson2.day6;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] agrs) {
		Demo1.demo();
		
	}
	public static void demo() {
		boolean falg = true;
		Scanner sc =new Scanner(System.in);
		int [] num = new int[3];
		String [] name = new String[3];
		int [] sorce = new int[3];
		//菜单
		System.out.println("======================");
		System.out.println("=      学员成绩管理                   =");
		System.out.println("======================");
		System.out.println("--------------------------------------------------");
		System.out.println("1.添加   2.修改   3.删除   4.查询   5.不及格人数统计   6.退出");
		System.out.println("--------------------------------------------------");
		while(falg) {
		System.out.println("---输入选择");
		int a = sc.nextInt();
		switch(a) {
		case 1: 
			for(int i = 0;i<name.length;i++) {
			if(name[i]==null) {
				System.out.print("---录入学号");
				num[i]=sc.nextInt();
				System.out.print("---录入姓名");
				name[i]=sc.next();
				System.out.print("---录入成绩");
				sorce[i]=sc.nextInt();
				break;
			}
		}
			break;
		case 2:
			boolean t1 = true;
			int a2 = 0;
			System.out.println("---输入要修改的编号：");
			int  nm = sc.nextInt();
			for(int i = 0;i<num.length;i++) {
				if(nm==num[i]) {
					t1 = false;
					a=i;
					break;
				}
			}
			if(t1) {
				
			}else {
			System.out.println("---录入新的成绩：");
			sorce[a2] = sc.nextInt();
			
			}
			break;
		case 3:
			int a1 =0;
			boolean fg = false;
			System.out.println("---输入要删除的编号：");
			int nm2 = sc.nextInt();
			for(int i = 0;i<num.length;i++) {
				if(nm2==num[i]) {
					a1=i;
					fg=true;
					break;
				}
			}
			while(fg) {
			for(int i = a1;i<num.length-1;i++) {
				num[i]=num[i+1];
				name[i]=name[i+1];
				sorce[i]=sorce[i+1];
					
				}
			if(name[name.length-1]!=null) {
				num[num.length-1]=0;
				name[name.length-1]=null;
				sorce[sorce.length-1]=0;
				
				}
			   break;
			}
			break;
		case 4:
			for(int i = 0;i<name.length;i++) {
				if(name[i]!=null) {
				System.out.print("学号："+num[i]+"\t");
				System.out.print("姓名："+name[i]+"\t");
				System.out.println("成绩："+sorce[i]+"\t");
			}
				}
			break;
		case 5:
			int temp = 0;
			System.out.println("--------不及格学员名单--------");
			System.out.print("---学号\t"+"---姓名\t"+"---成绩\t");
			for(int i=0 ;i<sorce.length;i++) {
				if(sorce[i]<60) {
					if(name[i]!=null) {
					System.out.print(num[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.println(sorce[i]+"\t");
					temp++;
					}else {
						break;
					}
				}
			}
			System.out.println("------------------------------");
			System.out.println("不及格人数为："+temp+"人");
		
			break;
		case 6:   
			falg = false;
			System.out.println("成功退出系统！");
			break;
		default:
			break;	
			
		}
		
		}
	}
}
