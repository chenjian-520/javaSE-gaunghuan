package com.ghgj.lesson5.work;

import java.util.Scanner;

/**
 * 一个例子 陈健
 * @author ASUS
 * @version1 2018-12-12 
 */
public class Demo1 {
	public static void main(String[] args) {
		Demo1.demo3_4();
	}
	
	public static void demo3_4() {
		Scanner sc = new Scanner(System.in);
		int a = 1,b = 1;
		int sum =0, c=0;
		System.out.println("输入数字n：");
		a = sc.nextInt();
		System.out.println("输入个数：");
		b = sc.nextInt();
		c=a; 
		for(int i = 1 ; i<=b;i++) {
			System.out.println(a);
			sum +=a;
			a = a*10+c; 		
		}
		System.out.println(sum);
		sc.close();
	}
	
	public static void demo3_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数：");
		int a = sc.nextInt();
		boolean fa = true;
		for(int i = 2;i<a;i++) {
			if(a%i==0) {
				System.out.println("不是素数");
				fa = false;
				break;
			}
		}
		while (fa) {
			System.out.println("是素数");
			break;
		}
	}
	
	public static void demo3_2() {
		double  su=0,s=1;
		for(int i=1;i<=20;i++) {
		    s = s*i;
			su += 1/s;
		}
		System.out.println(su);
	}
	
	public static void demo3_1() {
		int sum=0;
		for(int i=0;i<100;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	// 1 1 2 3 5 8 13 21 
	public static void demo2_5() {
		int a=1 ,b=1 ,c=1 ;
		for(int i = 0 ;i<=50;i++) {
			System.out.print(a+" ");
			a = b + c;	
			c = b;
			b = a;	
		}	
	}
	
	public static void demo2_4() {
		int a=3105 ,b=52223 ,c=888 ,temp=0;
		if(a>b) {
			temp = a;
			a = b ;
			b = temp;
		} if(a>c) {
			temp = a;
			a = c ;
			c = temp;
		} if(b>c) {
			temp = c;
			c = b ;
			b = temp;
		}
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void demo2_3() {
		int a=31330 ,b=5443 ,c=888 ;
		if(a>b&&a>c) {
			System.out.println("最大值为"+a);
		}else if(b>a&&b>c) {
			System.out.println("最大值为"+b);
		}else if(c>a&&c>b) {
			System.out.println("最大值为"+c);
		}
	}
	
	public static void demo2_2() {
		int a=310 ,b=3 ,c=1 ,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个年份：");
		a = sc.nextInt();
		boolean year = true;
		year = a%400==0? true:a%4==0&&a%100!=0? true:false;
		System.out.println(a+"年 为闰年是"+year);
		
	}
	
	public static void demo2_1() {
		int a=310 ,b=3 ,c=1 ,sum=0;
		b = 310%60;
		c = 310/60;
		System.out.println("310分钟是"+c+"小时");
		System.out.println("310分钟是"+c+"小时"+"余钟"+b+"分钟。");
	}
	
	public static void demo1_2() {
		int a=2 ,b=3 ,c=1 ,sum=0;
		 sum = a>b?(a>c?a:c):(b>c?b:c);
		 System.out.println("最大的是"+sum);
	}
	
	public static void demo1_1() {
		System.out.println("      ,---.              < ___ )     ");
		System.out.println("      \\___|________________7        ");
		System.out.println("           | `               |\\         ");
		System.out.println("           |  ·              |·\\         ");
		System.out.println("      ··---|·  \\             | ·\\ ----        ");
		System.out.println("     /     j  \\  `·7 ________j___\\     \\      ");
		System.out.println("    |    o    |  ( o )__________O)     |  ");
		System.out.println("     \\       /    J             \\      / ");
		System.out.println("       `___  ‘                   `___,   ");
		System.out.println("                                        ");

	}
	public void  demo() throws Exception {
		System.out.println("     /\\o      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\o    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\o  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\o ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\o  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                "); 
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\o ");
		System.out.println("                ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("               o ");
		System.out.println("                ");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                   o");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                        o");
		Thread.sleep(1000);
		
		System.out.println("     /\\      ");
		System.out.println("    /  \\    ");
		System.out.println("   /    \\  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\  ");
		System.out.println("/          \\ ");
		System.out.println("                ");
		System.out.println("                                  o");
		Thread.sleep(1000);
	}
}
