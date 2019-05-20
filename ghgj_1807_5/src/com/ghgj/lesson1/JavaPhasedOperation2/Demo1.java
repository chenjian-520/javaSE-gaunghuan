package com.ghgj.lesson1.JavaPhasedOperation2;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		funstion1();
	}
	
	
	public static void funstion1() {
		int [] arr = new int[7];
		int [] brr = new int[7];
		Scanner sc = new Scanner(System.in);
		 arr[0] = (int)(Math.random()*(30-1+1)+1);
		for(int i = 0;i<arr.length;i++) {
		 int a = (int)(Math.random()*(30-1+1)+1);
		 arr[i] =a;
		 for(int j = 0;j<i;j++) {
			 if(arr[j]==a) {
				 i--;
			 } } 
		} 
		for(int c:arr) {
			System.out.print(c+",");
		}
		System.out.println();
		for(int i = 0;i<brr.length;i++) {
			brr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<brr.length;j++) {
				if(arr[i]==brr[j]) {
					sum++;	
				}
			}
		}
		if(sum==7) {
			System.out.println("你中了一等奖");
		}else if(sum==6) {
			System.out.println("你中了二等奖");
		}else if(sum==5) {
			System.out.println("你中了三等奖");
		}else {
			System.out.println("没有中奖");
		}
	}
	
	public static void funstion() {
		Integer a = 2150;
		String str=a.toString();
		System.out.println("他是一个"+str.length()+"位数");
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		String str2=str1.toString();
		System.out.println(str2);
		 a = Integer.parseInt(str2);
		 System.out.println(a);	
	}
	
}
