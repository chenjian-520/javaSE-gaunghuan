package com.ghgj.lesson2.day6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// �����
		String [] imgs = {"!","@","#","$","%","^","*"};
		//0~99
		String [] nums = new String [100];
		//�������100
		for(int i=0;i<nums.length;i++) {
			nums[i] = imgs[(int)(Math.random()*(6-0+1))];
			
		}
		//9�ı�����һ��
		int r = (int)(Math.random()*(6-0+1));
		for(int i = 0;i<nums.length;i++) {
			if(i%9==0) {
				nums[i]=imgs[r];
			}
		}
		
		//���
		for(int i = 0;i<nums.length;i++) {
			System.out.print(i+" "+nums[i]+"\t");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		
		System.out.println("����^��������������������������������");
		System.out.println("�Ƿ���ʾ���");
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		if(ss.equals("y")) {
			System.out.println(nums[9]);
			
		}else {
			System.out.println("лл����");
		}
	}

}
