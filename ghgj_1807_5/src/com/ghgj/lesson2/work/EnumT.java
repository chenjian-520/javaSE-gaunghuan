package com.ghgj.lesson2.work;

import java.util.Scanner;

enum  Season{
	SPRING("��") ,SUMMER("��"),QUTUMN("��"),WINTER("��");
	private String name;
	
	public String getName() {
		return name;
	}

	private Season(String name) {
		this.name = name;
	}
	
}

public class EnumT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���뼾�ڣ�");
		Scanner sc = new Scanner(System.in);
		String season = sc.next();
		String season1=season.toUpperCase();
		Season sea = Season.valueOf(season1);
		switch(sea) {
		case SPRING:System.out.println("����ů������");
			break;
		case SUMMER:System.out.println("���������ס�");
			break;
		case QUTUMN:System.out.println("�������ˬ��");
			break;
		case WINTER:System.out.println("��������ѩƮ����");
			break;
		}
	}
}
