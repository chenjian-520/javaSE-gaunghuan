package com.ghgj.lesson2.day4;

import java.util.Scanner;

public class Day4 {
	public static void main(String[] agrs) {
	/*	int i =0;
		while(i<5) {
			System.out.println("* * * *");
			i++;
		}
		for(int i=1 ;i<=5;i++) {
			System.out.println("*********");
		}
		*/
		Day4.demo15();
	}
	public static void demo15() {
		for(int i =1 ;i<=4;i++) {
		
			for(int j = 1 ;j<=5-i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void demo14() {
		for(int i =1 ;i<=5;i++) {
		
			for(int j = 1 ;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void demo13() {
		for(int i =1 ;i<=5;i++) {
			for(int k =1 ;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j = 1 ;j<=2*i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void demo12() {
		for(int i =1 ;i<=5;i++) {
			for(int j = 1 ;j<=2*i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void demo11() {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("请输入会员号");
			int num = sc.nextInt();
			System.out.println("请输入会员生日");
			String num1 = sc.next();
			System.out.println("请输入积分");
			int num2 = sc.nextInt();
			if((num>9999)||(num<1000)) {
				System.out.println("输入不合法录入失败");
				continue;
			}
			System.out.println("已录入会员信息：");
			System.out.println(num+"\t"+num1+"\t"+num2);
		}
		
	}
	public static void demo10() {
		Scanner sc = new Scanner(System.in);
		double sum=0;
		for(int i =1;i<=5;i++) {
			System.out.print("请录入第"+i+"个商品的价格：");
			double db = sc.nextDouble();
			
			if (db<0) {
				System.out.println("录入失败");
				break;
			}
			
			sum = db+sum;
		}
		System.out.println("总价格是："+sum);
	}
	
	//斐波拉契序列2
	public static void demo9() {
		int a =1,b=1;
		
		for(int i=0;i<5;i++) {
			System.out.print(a+" "+" "+b+" "+" ");
			a=b+a;
			b=a+b;
			
		}
	}
	
	//斐波拉契序列1
	public static void demo8() {
		int a =1,b=1,c=0;
		
		for(int i=1;i<10;i++) {
			a=b+c;
			c = b;
			b = a;
			System.out.println(a);
		}
	}
	
	public static void demo7() {

		for(int i=100;i<1000;i++) {
			int a = i/100;
			int b = (i/10)%10;
			int c = i%10;	
			if(((a*a*a)+(b*b*b)+(c*c*c))==i) {
				System.out.println("水仙花数为："+i);
			}
		}
		
	}
	
	public static void demo6() {
		int i= 0;
		double db=0,da=0;
		Scanner sc= new Scanner(System.in);
		do{System.out.println("摄氏温度\t华氏温度");
			db=sc.nextDouble();
			da=db*9/5+32;
		System.out.println(db+"\t"+da);
			i++;
		}while(i<10);
	}
	
	public static void demo5() {
		Scanner sc = new Scanner(System.in);
	  
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		int count = 0 ;	
		int  n=0;
		int sum = 0;
		while(a!=0) {
			
			n=a%10;
			sum=sum*10+n;	  
			a=a/10;
			count++;
			
		}
		System.out.println(count);
		System.out.println(sum);
	}
	
	public static void demo4() {
		Scanner sc = new Scanner(System.in);
	  
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		int count = 0 ;	
		while(a!=0) {
			  a=a/10;
			count++;
			
		}
		System.out.println(count);
	}
	
	public static void demo3() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("请输入一个数");
			String a = sc.next();
			System.out.println(a+"是"+a.length()+"位数");
		}
		
	}
	
	public static void demo2() {
		int i =0,sum=0;
		Scanner sc = new Scanner(System.in);
		while(i<3) {
			System.out.print("请输入会员号：");
			int a = sc.nextInt();
			System.out.print("请输入生日：");
			String st = sc.next();
			System.out.print("请输入积分：");
			int b = sc.nextInt();
			if(a>9999||a<1000) {
				System.out.println("输入错误");
				
			}else {
				System.out.println(a+"\t"+st+"\t"+b);
			}
			i++;
			sum+=i;
		}
		System.out.println("程序结束");
	}
	
	
	public static void demo1() {
		int i =0,sum=0;
		
		while(i<5) {
			i++;
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
	}
}
