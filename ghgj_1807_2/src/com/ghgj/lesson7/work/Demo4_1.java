package com.ghgj.lesson7.work;

import java.util.Scanner;

public class Demo4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo4_7();
	}
	
	public static void demo4_7() {
		Scanner sc = new Scanner(System.in);
		int [] num =new int [98];
		int flag = 0;
		num[0]=1;
		
		while(flag<98) {
		boolean fa = true;
		int a = (int)(Math.random()*100+1);
		for(int i = 0;i<num.length;i++) {
			if(num[i]==0) {
				break;
			}
			 if(num[i]==a) {
				fa = false;
				break;
			}
		}
		while(fa){
			num[flag]=a;
			flag++;
			break;
		}	
	}
		for(int a:num) {
			System.out.print(a+" ");
		}
		System.out.println();
		boolean fl = true;
		int nu = 0;
		for (int i=1;i<=100;i++) {
			fl = true;
			for(int j =0;j<num.length;j++) {
				if(i==num[j]) {
					fl = false;
					nu = i;
				}
			}
			
			while(fl) {
				System.out.print(+i+"  ");
				break;
			}
		}	
}
	
	public static void demo4_6() {
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int newArr [] = new int [20]; int b = 0;
		for (int i = 0 ; i<oldArr.length;i++) {
			if(oldArr[i]!=0) {
				newArr[b]=oldArr[i];
				b++;
			}	
		}
		for (int i = 0 ; i<newArr.length;i++) {
			if (newArr[i] == 0) {
				break;
			}
			System.out.print(newArr[i]+" ");		
		}
	}
	
	public static void demo4_5() {
		String [] a = new String[] {"chen","jian","ni","hao","hello","world"};
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		for(int i = 0;i<a.length;i++) {
		if(sc.next().equals(a[i])) {
			System.out.println("YSE");
		}else {
			System.out.println("NO");	
		}
	}
}
	
	public static void demo4_4(){
		int [][] a = new int [][] {{1,1,0},{21,22},{31,32,33}};
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				a[0][2]+=a[i][j];
				
			}
		}
		System.out.println("\n求和为"+a[0][2]);
	}
	
	public static void demo4_3() {
		int [] a = new int [] {1,2,3,4,5,6};
		int [] b = new int [3];
		int [] c = new int [3];
		int b1=0 , c1=0;
		for(int i=0;i<a.length ; i++) {
			if(a[i]%2==0) {
				b[b1]=a[i];
				b1++;
			}else {
				c[c1]=a[i];
				c1++;
			}
		}
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+"  ");
		}
		System.out.println();
		for(int i=0; i<c.length;i++) {
			System.out.print(c[i]+"  ");
		}
	}
	
	public static void demo4_2() {
		int [] a1 =new int [] {1,2,3,4,5}; 
		int [] a2 =new int [] {2,3,4,5,6}; 
		for(int i=0;i<a1.length;i++) {
			a1[i]=a1[i]+a2[i];
			System.out.print(a1[i]+"  ");
		}
	}
	
	public static void demo4_1() {
		int [] a = new int [] {33,1,4,67,8};
		int temp = 0;
		for(int i = 0 ; i<a.length-1;i++) {
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		for(int c: a) {
			System.out.print(c+"  ");
		}
	}
}
