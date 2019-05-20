package com.ghgj.lesson1.day1;

import java.util.Scanner;

public class Blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blank.paixu();
		
	}
	
public static void water() {

	for(int i=100;i<1000;i++) {
		int a = i/100;
		int b = (i/10)%10;
		int c = i%10;	
		if(((a*a*a)+(b*b*b)+(c*c*c))==i) {
			System.out.println("水仙花数为："+i);
		}
	}
	
}	


public static void pape() {
	double db = 0.08;
	boolean bl = true;
	int i= 0;
	while(bl) {
		db = db*2;
		i++;
		
		if(db>8848130) {
			System.out.println("需要对折："+i+"次");
			i = 0;
			bl = false;
		}	
	}
}
	
	
	
public static void num() {
	int sum = 1;
	for(int i = 1;i<=5;i++)
	{	
		sum=sum*i;
		
	}
	System.out.println(sum);
	
}
	


public static void good() {
	Scanner sc= new Scanner(System.in);
	while(true){
		
		System.out.println("请输入成绩：");
		int num = sc.nextInt();
		switch(num/10) {
		case 10:System.out.println(num+"成绩优");break;
		case 9:System.out.println(num+"成绩优");break;
		case 8:System.out.println(num+"成绩良");break;
		case 7:System.out.println(num+"成绩中");break;
		case 6:System.out.println(num+"成绩及格");break;
		case 5:System.out.println(num+"成绩不及格");break;
		case 4:System.out.println(num+"成绩不及格");break;
		case 3:System.out.println(num+"成绩不及格");break;
		case 2:System.out.println(num+"成绩不及格");break;
		case 1:System.out.println(num+"成绩不及格");break;
		case 0:System.out.println(num+"成绩不及格");break;
		default:System.out.println(num+"成绩无效");break;
		
		}
	}		
}


public static void int5() {
	for(int i=-10; i<=100 ;i++) {
		if (i%3==0&&i%5==0) {
			System.out.println("你能被整除的为："+i);
		}
		
	}
}


public static void blank1() {
	Scanner input = new Scanner(System.in);
	System.out.println("请设置第一个密码：");
	int ma1 =input.nextInt();
	System.out.println("请设置第二个密码：");
	int ma2 =input.nextInt();
	System.out.println("密码设置完毕：");
	
	System.out.println("请输入第一个密码：");
	int code = input.nextInt();
	
	if(ma1==code) {
		System.out.println("请输入第二个密码：");
		int code2 = input.nextInt();
		if(ma2==code2) {
			System.out.println("恭喜你验证成功");
		}
		
	}
	else {
		System.out.println("请验证失败");
	}	
}



public static void shop() {
	// TODO Auto-generated method stub
	int sum = 0;
	System.out.println("请输入电视机价格：");
	Scanner sc = new Scanner(System.in);
	int numd = sc.nextInt();
	System.out.println("请输入冰箱价格：");
	int numb =sc.nextInt();
	sum = numd + numb;
	if(sum<100) {
		System.out.println("你好你的最终消费为："+sum);
		
	}
	else if(100<=sum&&sum<=1000) {
		System.out.println("你好你的最终消费打九折为："+0.9*sum);
	}
	else if(1000<sum&&sum<=5000) {
		System.out.println("你好你的最终消费打八折为："+0.8*sum);
	}
	else if(sum>5000) {
		System.out.println("你好你的最终消费打七折为："+0.7*sum);
	}
}



public static void paixu() {
	// TODO 自动生成的方法存根
	Scanner in=new Scanner(System.in);
	System.out.println("请输入学生成绩（0-100的阿拉伯数字）");
	String score=in.nextLine();
	double num;
	try
	{
	num=Integer.parseInt(score);
	if(num>=0&&num<60)
	{
	System.out.println("不及格");
	}
	else if(num>=60&&num<70)
	{
	System.out.println("及格");
	}
	else if(num>=70&&num<80)
	{
	System.out.println("中");
	}
	else if(num>=80&&num<90)
	{
	System.out.println("良");
	}
	else if(num>=90&&num<=100)
	{
	System.out.println("优");
	}
	else
	{
	System.out.println("输入有误");
	}
	}
	catch(Exception e)
	{
	System.out.println("输入有误");
	}
	
	
	}



}