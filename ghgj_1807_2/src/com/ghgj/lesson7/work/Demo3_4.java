package com.ghgj.lesson7.work;

public class Demo3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_4.demo3_2(9);
	}

	public static void demo3_2(int size) {
		if (size % 2 == 0) {
			size++;
		}
		for (int i = 0; i < size / 2 + 1; i++) {
			for (int j = i; j < size / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if(j==0||j==(2*i+1)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < size / 2 ; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(size/2-i)-1;j++) {
				if(j==0||(j==(2*(size/2-i)-2))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void demo3_1(int size) { // Êä³öÁâÐÎ
		if (size % 2 == 0) {
			size++;
		}
		for (int i = 0; i < size / 2 + 1; i++) {
			for (int j = i; j <= size / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < size / 2; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (size / 2 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
