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
			System.out.println("ˮ�ɻ���Ϊ��"+i);
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
			System.out.println("��Ҫ���ۣ�"+i+"��");
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
		
		System.out.println("������ɼ���");
		int num = sc.nextInt();
		switch(num/10) {
		case 10:System.out.println(num+"�ɼ���");break;
		case 9:System.out.println(num+"�ɼ���");break;
		case 8:System.out.println(num+"�ɼ���");break;
		case 7:System.out.println(num+"�ɼ���");break;
		case 6:System.out.println(num+"�ɼ�����");break;
		case 5:System.out.println(num+"�ɼ�������");break;
		case 4:System.out.println(num+"�ɼ�������");break;
		case 3:System.out.println(num+"�ɼ�������");break;
		case 2:System.out.println(num+"�ɼ�������");break;
		case 1:System.out.println(num+"�ɼ�������");break;
		case 0:System.out.println(num+"�ɼ�������");break;
		default:System.out.println(num+"�ɼ���Ч");break;
		
		}
	}		
}


public static void int5() {
	for(int i=-10; i<=100 ;i++) {
		if (i%3==0&&i%5==0) {
			System.out.println("���ܱ�������Ϊ��"+i);
		}
		
	}
}


public static void blank1() {
	Scanner input = new Scanner(System.in);
	System.out.println("�����õ�һ�����룺");
	int ma1 =input.nextInt();
	System.out.println("�����õڶ������룺");
	int ma2 =input.nextInt();
	System.out.println("����������ϣ�");
	
	System.out.println("�������һ�����룺");
	int code = input.nextInt();
	
	if(ma1==code) {
		System.out.println("������ڶ������룺");
		int code2 = input.nextInt();
		if(ma2==code2) {
			System.out.println("��ϲ����֤�ɹ�");
		}
		
	}
	else {
		System.out.println("����֤ʧ��");
	}	
}



public static void shop() {
	// TODO Auto-generated method stub
	int sum = 0;
	System.out.println("��������ӻ��۸�");
	Scanner sc = new Scanner(System.in);
	int numd = sc.nextInt();
	System.out.println("���������۸�");
	int numb =sc.nextInt();
	sum = numd + numb;
	if(sum<100) {
		System.out.println("��������������Ϊ��"+sum);
		
	}
	else if(100<=sum&&sum<=1000) {
		System.out.println("�������������Ѵ����Ϊ��"+0.9*sum);
	}
	else if(1000<sum&&sum<=5000) {
		System.out.println("�������������Ѵ����Ϊ��"+0.8*sum);
	}
	else if(sum>5000) {
		System.out.println("�������������Ѵ�����Ϊ��"+0.7*sum);
	}
}



public static void paixu() {
	// TODO �Զ����ɵķ������
	Scanner in=new Scanner(System.in);
	System.out.println("������ѧ���ɼ���0-100�İ��������֣�");
	String score=in.nextLine();
	double num;
	try
	{
	num=Integer.parseInt(score);
	if(num>=0&&num<60)
	{
	System.out.println("������");
	}
	else if(num>=60&&num<70)
	{
	System.out.println("����");
	}
	else if(num>=70&&num<80)
	{
	System.out.println("��");
	}
	else if(num>=80&&num<90)
	{
	System.out.println("��");
	}
	else if(num>=90&&num<=100)
	{
	System.out.println("��");
	}
	else
	{
	System.out.println("��������");
	}
	}
	catch(Exception e)
	{
	System.out.println("��������");
	}
	
	
	}



}