package com.ghgj.lesson1.work;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.ArithmeticException ������������
//int x = 5/0;
//2.ArrayIndexOutOfBoundsException �����±�Խ��
//int [] arr = {1,2,3};
//arr[5] = 67;
//3.NullPointerException ��ָ��
//String s = null;
//System.out.println(s.equals("abc"));
//Objects��
//System.out.println(Objects.equals(s, "abc"));
//System.out.println(Objects.hashCode(s));
//4.InputMismatchException ����ֵ���Ͳ�ƥ��
//Scanner input = new Scanner(System.in);
//int n = input.nextInt();
//5.ClassCastException ����ǿ��ת������
//Object o = new String();
//Integer i = (Integer)o;
//6.NumberFormatException ���ָ�ʽת���쳣
//String str = "12344a";
//int n = Integer.parseInt(str);
//System.out.println(n);
//7.ClassNotFoundException ���ܼ���������
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
			System.out.println("�������н�����");	
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


















