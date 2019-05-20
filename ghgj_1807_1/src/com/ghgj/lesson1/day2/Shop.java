package com.ghgj.lesson1.day2;

import java.util.Scanner;

public class Shop {
	//初始化菜单；
	static Res res[] = new Res[5];
	//初始化客户
	static Client cl[] = new Client[10];
	
	public static void main(String[] args) {
		//初始化物品对象
		res[0] = new Res("薯片",28);
		res[1] = new Res("大白兔糖",18);
		res[2] = new Res("乒乓球拍",48);
		res[3] = new Res("篮球",68);
		res[4] = new Res("电动赛车",578);
		
		Scanner sc = new Scanner(System.in);
		Scanner na = new Scanner(System.in);
		Scanner ag = new Scanner(System.in);
		Scanner se = new Scanner(System.in);
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;
		
		int i= 0;
		
		while(flag) {     //第一重循环
			
		Shop.print1();
		String dc = sc.nextLine();
		i++;
		if(dc.equals("1")) {
			System.out.println("请输入你的用户信息：姓名 年龄  性别 ");
			cl[i] = new Client(na.next(), ag.nextInt(), se.nextLine());
			
			if (i==10) { i = 0 ; }
			while(flag2) {   //第二重循环
			
			
			Shop.print2();
			String de = sc.nextLine();
			
			if(de.equals("1")) {
				flag1 = true;
				while(flag1) {    //第三重循环
				Shop.print3();
				String dd = sc.nextLine();
				
				if(dd.equals("1")) {
					System.out.println("显示所有客户信息  ");
					for(int a =0 ; a<10; a++) {
						if(cl[a]!=null) {
						System.out.println("用户姓名："+cl[a].name+"\t年龄："+cl[a].age+"\t性别："+cl[a].sex);
							}
						else {
							continue;
						}
						}
					}
				else if(dd.equals("2")) {
					System.out.println("增加客户信息   ");
					System.out.println("请输入你的用户信息：姓名 年龄  性别 ");
					i++;
					cl[i] = new Client(na.next(), ag.nextInt(), se.nextLine());
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("3")) {
					System.out.println("修改当前用户名称选择 ： 1  ");
					System.out.println("修改当前用户年龄选择 ： 2  ");
					System.out.println("修改当前用户性别选择 ： 3  ");
					System.out.println("退出修改请选择 ： 4  ");
					int fg = 1;
					while(fg == 1) {
					   		String change = na.next();
					   		if (change.equals("1")) {System.out.println("请输入新名称");cl[i].setName(na.next());System.out.println("修改成功");}
					   		else if (change.equals("2")) {System.out.println("请输入新年龄");cl[i].setAge(na.nextInt());System.out.println("修改成功");}
					   		else if (change.equals("3")) {System.out.println("请输入新性别");cl[i].setSex(na.next());System.out.println("修改成功");}
					   		else if (change.equals("4")) {fg = 0;}
					   		else {System.out.println("选择错误请重新选择");}
					}
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("4")) {
					System.out.println("当前客户购物信息如下：  ");
					for(int b=0; b<=4;b++) {
						System.out.println(res[b].resName+"\t\t"+res[b].resPrice);					
					}
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("5")) {
					System.out.println("返回上一界面  ");
					flag1=false;		}
				
				else {
					System.out.println("请正确输入选择选项：  ");
					Shop.print3();
					System.out.println("请按任意键返回主菜单：  ");
					 dd = sc.nextLine();}
				
				}
			}
			
			else if(de.equals("2")) {
				double sum = 0;
				System.out.println("购物结算");
				for(int b=0; b<=4;b++) {
					System.out.println(res[b].resName+"\t\t"+res[b].resPrice);			
					sum = res[b].resPrice+sum;		
				}
				System.out.println("你所需要付款："+sum);
						print2();
				     de = sc.nextLine();
				     
				
			}
			else if(de.equals("3")) {
				System.out.println("真情回馈 ");
				    print2();
			     de = sc.nextLine();
				
			}
			else if(de.equals("4")) {
				System.out.println("注销 ");
				break;
			}
			else {
				System.out.println("请正确操作：");
			}
			
			}
		}
		else if(dc.equals("2")) {
			System.out.println("成功退出我爱Shopping管理系统");
			flag = false;
			
		}
		else {
			System.out.println("请正确操作：");
		}
		
		
	}	
		
}
	
	public static void print1() {
		System.out.println("***********我爱Shopping管理系统*************");
		System.out.println("             1.登录系统                                                           ");
		System.out.println("             2.退出系统                                                           ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
	}
	
	public static void print2() {
		System.out.println("           我爱Shopping管理系统                                       ");
		System.out.println("****************************************");
		System.out.println("             1.客户信息管理                                                    ");
		System.out.println("             2.购物结算                                                           ");
		System.out.println("             3.真情回馈                                                           ");
		System.out.println("             4.注销                                                                   ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
	}
	
	public static void print3() {
		System.out.println("     我爱Shopping管理系统>>客户信息管理                           ");
		System.out.println("****************************************");
		System.out.println("             1.显示所有客户信息                                           ");
		System.out.println("             2.增加客户信息                                                   ");
		System.out.println("             3.修改                                                                   ");
		System.out.println("             4.查询客户信息                                                   ");
		System.out.println("             5.返回上一界面                                                   ");
		System.out.println("****************************************");
		System.out.println("***输入选择：");
	}

}
