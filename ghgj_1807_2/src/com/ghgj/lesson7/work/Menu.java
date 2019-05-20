package com.ghgj.lesson7.work;

import java.util.Scanner;

public class Menu {
	int [] number = new int [100];
	String [] name = new String [100];
	double [] price = new double [100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu  chen = new Menu();
		chen.menu();
		boolean  falg = true;
		while(falg) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--请输入选择：");
			switch(sc.nextInt()) {
			case 1:     //添加
				chen.add();
				break;
			case 2:		//修改
				chen.revise();
				break;
			case 3: 	//删除
				chen.remove();
				break;
			case 4: 	//查询
				chen.equire();
				break;
			case 5: 	//退出
				System.out.println("退出成功！");
				System.exit(0);
				break;
			default:System.out.println("输入错误！");
				break;
			}
			
		}
	}
	 
	public void remove() {   //从后向前删除
		Scanner sc =new Scanner(System.in);
		System.out.print("输入要删除的图书编号：");
		int number = sc.nextInt();
		int a = 0;boolean fa = true;
		for(int i=0;i<this.number.length;i++) {
			if(name[i]==null) {
				break;
			}
			if(this.number[i] == number) {
				a= i;
				fa = false;
			}
		}
		while(fa) {
			System.out.println("没有你要删除的书");
			return;
		}
		for(int i=a;i<this.number.length-1;i++) {
			this.number[i] = this.number[i+1];
			this.name[i] = this.name[i+1];
			this.price[i] = this.price[i+1];	
		}
		System.out.println("删除成功！");
		if(this.name[name.length-1]!=null) {
			this.number[this.number.length-1] = 0;
			this.name[name.length-1]= null;
			this.price[price.length-1]=0;
		}
	}
	
	public void revise() {
		Scanner sc =new Scanner(System.in);
		System.out.print("输入图书编号：");
		int number = sc.nextInt();
		for(int i = 0; i<this.number.length;i++) {
			if(this.name[i] == null) {
				break;
			}
			if(this.number[i] == number) {
				System.out.print("输入新图书名称：");
				String name = sc.next();
				System.out.print("输入新图书价格：");
				double price = sc.nextDouble();	
				this.name[i] = name;
				this.price[i] =price;
				System.out.println("修改成功！");
			}
		}	
	}
	
	public void equire() {
		System.out.println("编号\t\t名称\t\t单价");
		for(int i = 0; i<name.length;i++) {
			if(name[i] == null) {
				break;
			}
			System.out.println(number[i]+"\t\t"+name[i]+"\t\t"+price[i]);
		}
	}
	
	public void add() {
		Scanner sc =new Scanner(System.in);
		System.out.print("输入图书编号：");
		int number = sc.nextInt();
		System.out.print("输入图书名称：");
		String name = sc.next();
		System.out.print("输入图书价格：");
		double price = sc.nextDouble();
		for(int i = 0; i<this.name.length;i++){
			if(this.name[i]==null) {
				this.number[i] = number;
				this.name[i] = name;
				this.price[i] = price;
				System.out.println("添加成功！");
				break;
			}
		}	
	}
	
	public void menu() {
		System.out.println("******************************");
		System.out.println(" 1.添加   2.修改   3.删除   4.查询   5.退出     ");
		System.out.println("******************************");
	}

}
















