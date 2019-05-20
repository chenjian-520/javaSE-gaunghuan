package com.ghgj.lesson2.day6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// 存符号
		String [] imgs = {"!","@","#","$","%","^","*"};
		//0~99
		String [] nums = new String [100];
		//随机符号100
		for(int i=0;i<nums.length;i++) {
			nums[i] = imgs[(int)(Math.random()*(6-0+1))];
			
		}
		//9的倍数都一样
		int r = (int)(Math.random()*(6-0+1));
		for(int i = 0;i<nums.length;i++) {
			if(i%9==0) {
				nums[i]=imgs[r];
			}
		}
		
		//输出
		for(int i = 0;i<nums.length;i++) {
			System.out.print(i+" "+nums[i]+"\t");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		
		System.out.println("规则：^…………………………………………");
		System.out.println("是否显示结果");
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		if(ss.equals("y")) {
			System.out.println(nums[9]);
			
		}else {
			System.out.println("谢谢参与");
		}
	}

}
