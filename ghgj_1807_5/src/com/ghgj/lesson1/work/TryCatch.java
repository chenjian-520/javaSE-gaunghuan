package com.ghgj.lesson1.work;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.ArithmeticException 算数错误情形
//int x = 5/0;
//2.ArrayIndexOutOfBoundsException 数组下标越界
//int [] arr = {1,2,3};
//arr[5] = 67;
//3.NullPointerException 空指针
//String s = null;
//System.out.println(s.equals("abc"));
//Objects类
//System.out.println(Objects.equals(s, "abc"));
//System.out.println(Objects.hashCode(s));
//4.InputMismatchException 输入值类型不匹配
//Scanner input = new Scanner(System.in);
//int n = input.nextInt();
//5.ClassCastException 对象强制转换出错
//Object o = new String();
//Integer i = (Integer)o;
//6.NumberFormatException 数字格式转换异常
//String str = "12344a";
//int n = Integer.parseInt(str);
//System.out.println(n);
//7.ClassNotFoundException 不能加载所需类
//ClassLoader.getSystemClassLoader().loadClass("Myexam.Exception.TestException2");
//8.IllegalArgumentException 
//9.IllegalAccessException

public class TryCatch {

	public static void main(String[] args) {

/*		int [] arr = new int[5];
		try {
			System.out.println("shuru");
			Scanner sc = new Scanner(System.in);
			for(int i = 0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(InputMismatchException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("程序运行结束！");	
		}*/
	/*	try {
			funstion();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		funstion();
		
	}
	
	public static void funstion() throws RuntimeException{
		int [] arr = new int[] {1,5,3,4,3,5,3,4,8,7};
		System.out.println("shuru");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<arr.length;i++) {
			//arr[i]=sc.nextInt();
			System.out.println(arr[i]);
	}
}
	
}


















