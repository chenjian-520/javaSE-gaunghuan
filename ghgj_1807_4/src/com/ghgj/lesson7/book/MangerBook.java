package com.ghgj.lesson7.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MangerBook {
	public static Book [] book = new Book[1000];
	
	public void menu() throws ParseException {
		System.out.println("**************************");
		System.out.println("***    图书管理系统 2.0    ***");
		System.out.println("**************************");
		System.out.println("----------------------------------------");
		System.out.println("1.添加	2.修改	3.删除	4.查询	5.退出");
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("--输入选择的编号：");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			add();
			menu();
			break;
		case 2:
			take();
			menu();
			break;
		case 3:
			delete();
			menu();
			break;
		case 4:
			query();
			menu();
			break;
		case 5:
			System.out.println("退出成功！");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误 请重新输入：");
			menu();
			break;
		}
	}
	//添加
	public void add() throws ParseException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入图书编号：");
		int number = sc.nextInt();
		System.out.println("请输入图书名：");
		String name = sc.next();
		System.out.println("请输入图书单价：");
		double price = sc.nextDouble();
		System.out.println("请输入图书作者：");
		String auther = sc.next();
		System.out.println("请输入图书出版日期：（yyyy-mm-dd）");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse(sc.next());	
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
				book[i] = new Book(number,name,price,auther,date); 
				System.out.println("添加成功！");
				break;
			}
		}
	}
	//修改
	public void take() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的图书编号：");
		int number = sc.nextInt();
		System.out.println("请输入新的图书名：");
		String name = sc.next();
		System.out.println("请输入新的图书单价：");
		double price = sc.nextDouble();
		System.out.println("请输入新的图书作者：");
		String auther = sc.next();
		System.out.println("请输入新的图书出版日期：（yyyy-mm-dd）");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse(sc.next());	
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i].getNumber()==number) {
				book[i] = new Book(number,name,price,auther,date); 
				System.out.println("修改成功！");
				break;
			}
		}	
	}
	//删除
	public void delete() {
		System.out.println("*输入要删除的图书编号：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(),b=0;
		boolean fl = false;
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
				break;
			}
			if(MangerBook.book[i].getNumber()==number) {
					b=i;
					fl = true;
					break;
				}
			}
		if(fl) {
		for(int i = b; i<MangerBook.book.length-1;i++) {
			MangerBook.book[i] = MangerBook.book[i+1];
			if(MangerBook.book[i]==null) {
				System.out.println("删除成功");
				break;
				}
			}
		}else {
			System.out.println("沒有图书");
		}
		if(MangerBook.book[MangerBook.book.length-1]!=null) {
			MangerBook.book[MangerBook.book.length-1]=null;
		}
		
	}
	//查询
	public void query() {
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
					break;
				}
			System.out.println("编号\t名称\t\t单价\t作者\t出版日期\t\t");
			System.out.println(MangerBook.book[i].toString());
		}

	}
	
	
	
}

