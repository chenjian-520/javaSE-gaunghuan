package com.ghgj.lesson2.day4;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop.luck();
	}
	
	
	public static void luck() {
		Scanner sc = new Scanner(System.in);
		boolean  flag=true;
		while(flag) {
		System.out.println("请输入4位会员卡号：");
		int care = sc.nextInt();
		if( (care/1000)+(care/100%10)+(care/10%10)+(care%10)>20 )
		{
			System.out.println("恭喜你成为幸运会员！");
		}
		else {System.out.println("欢迎下次光临！");}
		
		System.out.println();
		System.out.println("是否继续（y/n）");
		String st = sc.next();
		
		if(st.equals("y")) {

			}else {
				System.out.println("退出系统！");
				flag = false;
			}
		}
	}
	

	public static void query() {
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*************************************");
		boolean flag = true;
		double money = 0;
		double moneyAll = 0;
		while(flag) {
		System.out.println("请输入商品编号：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		if(a==1 ) {
			System.out.println("T恤\t￥"+245);
			System.out.println("请输入购买商品数量：");
			int p1= sc.nextInt();
			money = money+p1*245;
					
		}else if(a==2) {
			System.out.println("网球鞋\t￥"+570);
			System.out.println("请输入购买商品数量：");
			int p2= sc.nextInt();
			money = money+p2*570;	
		}else if(a==3) {
			System.out.println("网球拍\t￥"+320);
			System.out.println("请输入购买商品数量：");
			int p3= sc.nextInt();
			money = money+p3*320;
		}else {
			System.out.println("请正确输入！");
		}
		
		System.out.println("是否继续（y/n）");
		String st = sc.next();
		if(st.equals("n")) {
			System.out.println("请输入所交费用：");
			moneyAll = sc.nextDouble();
			if(moneyAll>money*0.8) {
			System.out.println("折扣：0.8");
			System.out.println("金额总计：\t￥"+(money*0.8));
			System.out.println("实际缴费：\t￥"+moneyAll);
			System.out.println("找钱："+(moneyAll-money*0.8));
			flag = false;
			}else {
				System.out.println("缴费不足退出系统！");
				flag = false;
			}
			
		}
		
	  }
			
	}
}
