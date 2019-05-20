package com.ghgj.lesson2.jbs2;

public class TestFor {
	public static int f1() {
		System.out.println("a");
		return 0;
	}
	public static boolean f2() {
		System.out.println("b");
		return true;
	}
	public static int f3(int i) {
		System.out.println("c");
		return ++i;
	}
	public static boolean b1() {
		System.out.println("b1");
		return true;
	}
	public static boolean b2() {
		System.out.println("b2");
		return false;
	}
	
	
	public static void main (String[] agrs) {
		
		/*for(int i=f1();i<4&&f2();i=f3(i)) {
			System.out.println("hello world");
		}
		*/
		System.out.println(b1()&&b2());
	}
}
