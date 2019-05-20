package com.ghgj.lesson2.day2;

import java.util.Scanner;

public class Gcpizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你需要的披萨（海鲜披萨/培根披萨）");
		String pizza =sc.next();
		if(pizza.equals("海鲜披萨")) {
			Hxpizza n1 = new Hxpizza("海鲜披萨",25,10);
			System.out.println(n1.toString());
		}else {
			Pgpizza n2 = new Pgpizza("培根披萨",25,10);
			System.out.println(n2.toString());
		}
	}
}
