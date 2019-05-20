package com.ghgj.lesson2.work;

import java.util.Scanner;

public class ApiMath {

	public static void main(String[] args) {
	/*  // TODO Auto-generated method stub
		//大于等于指定参数的最大整数  double
		System.out.println(Math.ceil(22.52));//23
		//小于等于指定参数的最大整数  double
		System.out.println(Math.floor(25.25));//25
		//四舍五入  返回为  long 
		System.out.println(Math.round(25.53));//26
		// 求 几次方  结果  8.0 double
		System.out.println(Math.pow(2, 3));//8.0
		// 产生随机小数[0.0,1.0)
		System.out.println(Math.random());
		// 随机整数           Math.random()*( 最大数   最小数  +1）)+最小数
		System.out.println((int)(Math.random()*(10-1+1)+1));
			
		Random  r1 = new Random(5);
		System.out.println(r1.nextDouble());
		Random  r2 = new Random(45);
		System.out.println(r2.nextDouble());
		Random  r3 = new Random(455);
		System.out.println(r3.nextDouble());
		
		Random  r4 = new Random();
		System.out.println(r4.nextDouble());
		//int范围
		System.out.println(r4.nextInt());
		//[0,上限)
		System.out.println(r4.nextInt(5));
		*/
		ApiMath.mathrandom();
		
		
	
	}
	
	public static void mathrandom() {
		int  a = (int)(Math.random()*(10-1+1)+1);
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=7;i++) {
			System.out.println("输入一个数：");
			int b = sc.nextInt();
			if(a<b) {
				System.out.println("猜大了");
			}else if(a>b) {
				System.out.println("猜小了");
			}else if(a==b) {
				if(i<=3) {
					System.out.println("你太聪明了");
					return ;
				}else if(i<=5) {
					System.out.println("还可以");
					return ;
				}else if(i<=10) {
					System.out.println("你太笨了");
					return ;
				}
			}
		
		}
		System.out.println("挑战失败！");
	}

}






























