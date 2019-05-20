package com.ghgj.lesson5.work;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

	public static void main(String[] args) {
		funtion3();
	}
	
	public static void funtion3() {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9]{3,15}");
		System.out.println("输入：");
		Scanner sc = new Scanner(System.in);
		Matcher mat = p.matcher(sc.next());
		System.out.println(mat.matches());
	}
	
	public static void funtion2() {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[a-zA-Z0-9]{4,10}");
		System.out.println("输入：");
		Scanner sc = new Scanner(System.in);
		Matcher mat = p.matcher(sc.next());
		System.out.println(mat.matches());
	}

	public static void funtion1() {
		//指定正则表达式
		Pattern p = Pattern.compile("[0-9]{6}");
		//设置验证的字符串
		System.out.println("输入：");
		Scanner sc = new Scanner(System.in);
		Matcher m = p.matcher(sc.next());
		m.matches();
		System.out.println(m.matches());
	}
	
	public static void funtion() {
		Pattern p = Pattern.compile("1[0-9]{10}");
		System.out.println("输入：");
		Scanner sc = new Scanner(System.in);
		Matcher mat = p.matcher(sc.next());
		System.out.println(mat.matches());
		
	}
	
	

}














