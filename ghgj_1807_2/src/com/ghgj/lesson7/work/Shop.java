package com.ghgj.lesson7.work;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=5;i++) {
			sum+=menu(i,3);
		}
		System.out.println("5���̳������ѣ�"+sum+"Ԫ��");
	}
	public static int menu(int i,int b) {
		int sum = 0;
		System.out.println("��ӭ������"+i+"���̳���");
		Scanner sc = new Scanner(System.in);
		for(int j = 0 ;j<b;j++) {
			System.out.print("�����빺���");
			sum += sc.nextInt();
		}
		System.out.println("�뿪��"+i+"���̳����ˣ�"+sum+"Ԫ!");
		return sum;
	}
}
