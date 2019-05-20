package com.ghgj.lesson1.text;

public class Student {
	private static int apple = 6;
	
	public Student() {
		
	}
	public  void take() {
		apple --;
		System.out.println("拿一个苹果");
	} 
	
	public static int getApple() {
		return apple;
	}
	
	public static void main(String[] args) {
		Student  a1 = new  Student();
		Student  a2 = new  Student();
		Student  a3 = new  Student();
		a1.take();
		a2.take();
		a3.take();
		System.out.println("还 有苹果"+Student.getApple());
		
	}
}
