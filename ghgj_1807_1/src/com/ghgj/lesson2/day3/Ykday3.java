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
		
		System.out.println("�����·ݣ�");
		month = sc.nextInt();
		if(month>=4 && month<=10) {
			System.out.println("�������ͣ�");
			type = sc.next();
			if(type.equals("����")){
				money = 60;
			}else if(type.equals("ѧ��")) {
				money = 30;
			}
		}else {
			System.out.println("�������ͣ�");
			type = sc.next();
			if(type.equals("����")){
				money = 40;
			}else if(type.equals("ѧ��")) {
				money = 20;
			}
			
		}
		System.out.println("�ʹ���Ʊ�۸�Ϊ��"+money);
	}
	
	
	public static void demo4() {
		Scanner sc = new Scanner(System.in);
		int month;
		double money =0;
		String type;
		
		System.out.println("�����·ݣ�");
		month = sc.nextInt();
		if(month>=7 && month<=10) {
			System.out.println("�������ͣ�");
			type = sc.next();
			if(type.equals("ͷ�Ȳ�")){
				money = 5000 *0.9;
			}else if(type.equals("���ò�")) {
				money = 3000 *0.8;
			}
		}else {
			System.out.println("�������ͣ�");
			type = sc.next();
			if(type.equals("ͷ�Ȳ�")){
				money = 5000 *0.5;
			}else if(type.equals("���ò�")) {
				money = 3000 *0.2;
			}
			
		}
		System.out.println("�ɻ�Ʊ�۸�Ϊ��"+money);
	}
	
	
	public static void demo3() {
		int  money = 10000;
		System.out.println("�˻���179708064356�� �û����� ������ ��   ����"+money+"�����ɹ���");
		System.out.println("*****************��ӭʹ���Զ����з���****************");
		System.out.println("1:���   2:ȡ��   3:ת��   4:��ѯ���   5:�˳� ");
		System.out.println("**********************************************");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i) {
		case 1:System.out.println("���������");
		   int  a = sc.nextInt();
		   money = money+a;
		   System.out.println("���ɹ��� ��ǰ��"+money);
			break;
		case 2:System.out.println("������ȡ���");
		   int  b = sc.nextInt();
		   money = money-b;
		   System.out.println("ȡ��ɹ��� ��ǰ��"+money);
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
		System.out.println("�����Ա���֣�");
		Scanner sc = new Scanner(System.in);
		int card = sc.nextInt();
		if(card<2000) {
			System.out.println("�û�Ա���ܵ��ۿ�Ϊ��0.9");
		}else if(card<4000) {
			System.out.println("�û�Ա���ܵ��ۿ�Ϊ��0.8");
		}else if(card<8000) {
			System.out.println("�û�Ա���ܵ��ۿ�Ϊ��0.7");
		}else if(card>=8000) {
			System.out.println("�û�Ա���ܵ��ۿ�Ϊ��0.6");
		}
	}
	
	public static void demo1(){
		double r1 = Math.random();   //Math.random�������С��0~1��
   //int r = ��int��(Math.random()*(���ֵ-��Сֵ+1��+��Сֵ��	  �������[��Сֵ�����ֵ]	
		int  r = (int)(Math.random()*10);  //����0��9�������
		System.out.println(r);
		System.out.println("������4λ��Ա��");
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		if((i/100%10)==r) {
			System.out.println(i+"\t��ϲ���н�");
		}
		else {System.out.println(i+"\tлл����");}
	}
	
	
	
	
	public static void card() {
		System.out.println("�������Ա�ţ���4λ����������");
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		System.out.println("�������Ա���գ���/�ա�����λ����ʾ������");
		
		String cardBirt = sc.next();
		System.out.println("�������Ա���֣�");
		
		int cardFen = sc.nextInt();
		if(cardNum>999 && cardNum<=9999) {
		
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(cardNum+"\t"+cardBirt+"\t"+cardFen);
		}
		else {
			System.out.println("���벻�Ϸ�");
		}
	}
	
	public static void num() {
		System.out.println("������0~99999֮���������");
		Scanner sc = new Scanner(System.in);
		int bod = sc.nextInt();
		int i =0;
		if(bod>9999&&bod<=99999) {
		System.out.println(bod+"��5λ��");}
		if(bod>999&&bod<=9999) {
			System.out.println(bod+"��4λ��");}
		else if(bod>99&&bod<=999) {
			System.out.println(bod+"��3λ��");}
		else if(bod>9&&bod<=99) {
			System.out.println(bod+"��2λ��");}
		else if(bod>=0&&bod<=9) {
			System.out.println(bod+"��1λ��");}
	}
	
	public static void surpermen() {
		Scanner sc = new Scanner(System.in);
		//1
	/*	System.out.println("������һ��������");
		int i = sc.nextInt();
		if(i>=0) {System.out.println("�����Ϊ����");}
		else {System.out.println("�����Ϊ����");}
		*/
		//2
	/*	int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("������������");
		if(a>b) {System.out.println("a��");}
		else {System.out.println("b��");}
		*/
		//3
	/*	int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("������������");
		if((a%b==0)||(a+b>66)) {System.out.println(a);}
		else {System.out.println(b);}
		*/
		//4
	    int money = 10000;
		System.out.println("�˻���179708064356�� �û����� ������ ��   ����10000�����ɹ���");
		System.out.println("������ȡ���");
		int mo = sc.nextInt();
		if(money>0&&mo<money) {
			System.out.println("ȡ��ɹ�����ǰ���Ϊ��"+(money-mo));
		}
		else {System.out.println("ȡ��ʧ��");}
		
	}
	public static void car() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ĵ��");
		int i = sc.nextInt();
		if(i>500) {
			System.out.println("�򿭵�����");
			}else if(i>100&i<500) {
				System.out.println("��������");
			}else if(i<100&i>50) {
					System.out.println("��������");
			}else if(i<50&i>10) {
				System.out.println("�����");
			}
		else{System.out.println("��ݰ���");}
		
	}
}

















