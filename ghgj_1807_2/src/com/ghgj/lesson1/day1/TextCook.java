package com.ghgj.lesson1.day1;

import java.util.Scanner;

public class TextCook {

	public static void main(String[] args) {
		Cook gj = new Cook();
		gj.cook();
		String s = gj.cook3("水电费水电费", "十炼精钢修理工具");
		System.out.println(s);
		}
	
	}


class Cook {
	public void cook() {
		System.out.println("做菜直接吃");
	}
	
	public String cook2() {
		String food1, food2;
		Scanner sc = new Scanner(System.in);
		food1 = sc.next();
		food2 = sc.next();
		
	return food1+"炒"+food2;
	}
	
	public String cook3(String food1,String food2) {
		
	return food1+"炒"+food2;
	
	}
}

