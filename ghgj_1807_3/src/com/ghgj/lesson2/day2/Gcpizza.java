package com.ghgj.lesson2.day2;

import java.util.Scanner;

public class Gcpizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ����������������/���������");
		String pizza =sc.next();
		if(pizza.equals("��������")) {
			Hxpizza n1 = new Hxpizza("��������",25,10);
			System.out.println(n1.toString());
		}else {
			Pgpizza n2 = new Pgpizza("�������",25,10);
			System.out.println(n2.toString());
		}
	}
}
