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
		System.out.println("������4λ��Ա���ţ�");
		int care = sc.nextInt();
		if( (care/1000)+(care/100%10)+(care/10%10)+(care%10)>20 )
		{
			System.out.println("��ϲ���Ϊ���˻�Ա��");
		}
		else {System.out.println("��ӭ�´ι��٣�");}
		
		System.out.println();
		System.out.println("�Ƿ������y/n��");
		String st = sc.next();
		
		if(st.equals("y")) {

			}else {
				System.out.println("�˳�ϵͳ��");
				flag = false;
			}
		}
	}
	

	public static void query() {
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*************************************");
		boolean flag = true;
		double money = 0;
		double moneyAll = 0;
		while(flag) {
		System.out.println("��������Ʒ��ţ�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		if(a==1 ) {
			System.out.println("T��\t��"+245);
			System.out.println("�����빺����Ʒ������");
			int p1= sc.nextInt();
			money = money+p1*245;
					
		}else if(a==2) {
			System.out.println("����Ь\t��"+570);
			System.out.println("�����빺����Ʒ������");
			int p2= sc.nextInt();
			money = money+p2*570;	
		}else if(a==3) {
			System.out.println("������\t��"+320);
			System.out.println("�����빺����Ʒ������");
			int p3= sc.nextInt();
			money = money+p3*320;
		}else {
			System.out.println("����ȷ���룡");
		}
		
		System.out.println("�Ƿ������y/n��");
		String st = sc.next();
		if(st.equals("n")) {
			System.out.println("�������������ã�");
			moneyAll = sc.nextDouble();
			if(moneyAll>money*0.8) {
			System.out.println("�ۿۣ�0.8");
			System.out.println("����ܼƣ�\t��"+(money*0.8));
			System.out.println("ʵ�ʽɷѣ�\t��"+moneyAll);
			System.out.println("��Ǯ��"+(moneyAll-money*0.8));
			flag = false;
			}else {
				System.out.println("�ɷѲ����˳�ϵͳ��");
				flag = false;
			}
			
		}
		
	  }
			
	}
}