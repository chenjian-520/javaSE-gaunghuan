package com.ghgj.lesson2.day3;

import java.util.Scanner;

public class Ykday3 {
	
	public static void main(String[] agrs) {
		Ykday3.demo5();
		
	} 
	
	public static void demo5() {
		Scanner sc =new Scanner(System.in);
		int month;
		double money =0;
		String type;
		
		System.out.println("输入月份：");
		month = sc.nextInt();
		if(month>=4 && month<=10) {
			System.out.println("输入类型：");
			type = sc.next();
			if(type.equals("成人")){
				money = 60;
			}else if(type.equals("学生")) {
				money = 30;
			}
		}else {
			System.out.println("输入类型：");
			type = sc.next();
			if(type.equals("成人")){
				money = 40;
			}else if(type.equals("学生")) {
				money = 20;
			}
			
		}
		System.out.println("故宫门票价格为："+money);
	}
	
	
	public static void demo4() {
		Scanner sc = new Scanner(System.in);
		int month;
		double money =0;
		String type;
		
		System.out.println("输入月份：");
		month = sc.nextInt();
		if(month>=7 && month<=10) {
			System.out.println("输入类型：");
			type = sc.next();
			if(type.equals("头等舱")){
				money = 5000 *0.9;
			}else if(type.equals("经济舱")) {
				money = 3000 *0.8;
			}
		}else {
			System.out.println("输入类型：");
			type = sc.next();
			if(type.equals("头等舱")){
				money = 5000 *0.5;
			}else if(type.equals("经济舱")) {
				money = 3000 *0.2;
			}
			
		}
		System.out.println("飞机票价格为："+money);
	}
	
	
	public static void demo3() {
		int  money = 10000;
		System.out.println("账户：179708064356， 用户名： 王丽丽 ，   存款金额："+money+"创建成功！");
		System.out.println("*****************欢迎使用自动银行服务****************");
		System.out.println("1:存款   2:取款   3:转账   4:查询余额   5:退出 ");
		System.out.println("**********************************************");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i) {
		case 1:System.out.println("请输入存款金额：");
		   int  a = sc.nextInt();
		   money = money+a;
		   System.out.println("存款成功！ 当前余额："+money);
			break;
		case 2:System.out.println("请输入取款金额：");
		   int  b = sc.nextInt();
		   money = money-b;
		   System.out.println("取款成功！ 当前余额："+money);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
		break;
		}
	}
	
	public static void demo2() {
		System.out.println("输入会员积分：");
		Scanner sc = new Scanner(System.in);
		int card = sc.nextInt();
		if(card<2000) {
			System.out.println("该会员享受的折扣为：0.9");
		}else if(card<4000) {
			System.out.println("该会员享受的折扣为：0.8");
		}else if(card<8000) {
			System.out.println("该会员享受的折扣为：0.7");
		}else if(card>=8000) {
			System.out.println("该会员享受的折扣为：0.6");
		}
	}
	
	public static void demo1(){
		double r1 = Math.random();   //Math.random产生随机小数0~1；
   //int r = （int）(Math.random()*(最大值-最小值+1）+最小值）	  随机产生[最小值，最大值]	
		int  r = (int)(Math.random()*10);  //产生0到9随机整数
		System.out.println(r);
		System.out.println("请输入4位会员号");
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		if((i/100%10)==r) {
			System.out.println(i+"\t恭喜你中奖");
		}
		else {System.out.println(i+"\t谢谢参与");}
	}
	
	
	
	
	public static void card() {
		System.out.println("请输入会员号（《4位整数》）：");
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		System.out.println("请输入会员生日（月/日《用两位数表示》）：");
		
		String cardBirt = sc.next();
		System.out.println("请输入会员积分：");
		
		int cardFen = sc.nextInt();
		if(cardNum>999 && cardNum<=9999) {
		
		System.out.println("已录入的会员信息是：");
		System.out.println(cardNum+"\t"+cardBirt+"\t"+cardFen);
		}
		else {
			System.out.println("输入不合法");
		}
	}
	
	public static void num() {
		System.out.println("请输入0~99999之间的任意数");
		Scanner sc = new Scanner(System.in);
		int bod = sc.nextInt();
		int i =0;
		if(bod>9999&&bod<=99999) {
		System.out.println(bod+"是5位数");}
		if(bod>999&&bod<=9999) {
			System.out.println(bod+"是4位数");}
		else if(bod>99&&bod<=999) {
			System.out.println(bod+"是3位数");}
		else if(bod>9&&bod<=99) {
			System.out.println(bod+"是2位数");}
		else if(bod>=0&&bod<=9) {
			System.out.println(bod+"是1位数");}
	}
	
	public static void surpermen() {
		Scanner sc = new Scanner(System.in);
		//1
	/*	System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		if(i>=0) {System.out.println("这个数为正数");}
		else {System.out.println("这个数为负数");}
		*/
		//2
	/*	int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("请输入两个数");
		if(a>b) {System.out.println("a大");}
		else {System.out.println("b大");}
		*/
		//3
	/*	int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("请输入两个数");
		if((a%b==0)||(a+b>66)) {System.out.println(a);}
		else {System.out.println(b);}
		*/
		//4
	    int money = 10000;
		System.out.println("账户：179708064356， 用户名： 王丽丽 ，   存款金额：10000创建成功！");
		System.out.println("请输入取款金额：");
		int mo = sc.nextInt();
		if(money>0&&mo<money) {
			System.out.println("取款成功，当前余额为："+(money-mo));
		}
		else {System.out.println("取款失败");}
		
	}
	public static void car() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入郭靖的存款");
		int i = sc.nextInt();
		if(i>500) {
			System.out.println("买凯迪拉克");
			}else if(i>100&i<500) {
				System.out.println("买帕萨特");
			}else if(i<100&i>50) {
					System.out.println("买伊兰特");
			}else if(i<50&i>10) {
				System.out.println("买奥拓");
			}
		else{System.out.println("买捷安特");}
		
	}
}


















