package com.ghgj.lesson1.day1;

import java.util.Scanner;

public class TextCook {

	public static void main(String[] args) {
		Cook gj = new Cook();
		gj.cook();
		String s = gj.cook3("ˮ���ˮ���", "ʮ������������");
		System.out.println(s);
		}
	
	}


class Cook {
	public void cook() {
		System.out.println("����ֱ�ӳ�");
	}
	
	public String cook2() {
		String food1, food2;
		Scanner sc = new Scanner(System.in);
		food1 = sc.next();
		food2 = sc.next();
		
	return food1+"��"+food2;
	}
	
	public String cook3(String food1,String food2) {
		
	return food1+"��"+food2;
	
	}
}

