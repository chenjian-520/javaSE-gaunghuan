package com.ghgj.lesson4.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [] {20,34,56,42,98,76,23};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int n : a) {
			System.out.print(n+".");
		}
	}
}
