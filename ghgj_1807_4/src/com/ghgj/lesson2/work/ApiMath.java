package com.ghgj.lesson2.work;

import java.util.Scanner;

public class ApiMath {

	public static void main(String[] args) {
	/*  // TODO Auto-generated method stub
		//���ڵ���ָ���������������  double
		System.out.println(Math.ceil(22.52));//23
		//С�ڵ���ָ���������������  double
		System.out.println(Math.floor(25.25));//25
		//��������  ����Ϊ  long 
		System.out.println(Math.round(25.53));//26
		// �� ���η�  ���  8.0 double
		System.out.println(Math.pow(2, 3));//8.0
		// �������С��[0.0,1.0)
		System.out.println(Math.random());
		// �������           Math.random()*( �����   ��С��  +1��)+��С��
		System.out.println((int)(Math.random()*(10-1+1)+1));
			
		Random  r1 = new Random(5);
		System.out.println(r1.nextDouble());
		Random  r2 = new Random(45);
		System.out.println(r2.nextDouble());
		Random  r3 = new Random(455);
		System.out.println(r3.nextDouble());
		
		Random  r4 = new Random();
		System.out.println(r4.nextDouble());
		//int��Χ
		System.out.println(r4.nextInt());
		//[0,����)
		System.out.println(r4.nextInt(5));
		*/
		ApiMath.mathrandom();
		
		
	
	}
	
	public static void mathrandom() {
		int  a = (int)(Math.random()*(10-1+1)+1);
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=7;i++) {
			System.out.println("����һ������");
			int b = sc.nextInt();
			if(a<b) {
				System.out.println("�´���");
			}else if(a>b) {
				System.out.println("��С��");
			}else if(a==b) {
				if(i<=3) {
					System.out.println("��̫������");
					return ;
				}else if(i<=5) {
					System.out.println("������");
					return ;
				}else if(i<=10) {
					System.out.println("��̫����");
					return ;
				}
			}
		
		}
		System.out.println("��սʧ�ܣ�");
	}

}






























