package com.ghgj.lesson2.day6;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] agrs) {
		Demo1.demo();
		
	}
	public static void demo() {
		boolean falg = true;
		Scanner sc =new Scanner(System.in);
		int [] num = new int[3];
		String [] name = new String[3];
		int [] sorce = new int[3];
		//�˵�
		System.out.println("======================");
		System.out.println("=      ѧԱ�ɼ�����                   =");
		System.out.println("======================");
		System.out.println("--------------------------------------------------");
		System.out.println("1.���   2.�޸�   3.ɾ��   4.��ѯ   5.����������ͳ��   6.�˳�");
		System.out.println("--------------------------------------------------");
		while(falg) {
		System.out.println("---����ѡ��");
		int a = sc.nextInt();
		switch(a) {
		case 1: 
			for(int i = 0;i<name.length;i++) {
			if(name[i]==null) {
				System.out.print("---¼��ѧ��");
				num[i]=sc.nextInt();
				System.out.print("---¼������");
				name[i]=sc.next();
				System.out.print("---¼��ɼ�");
				sorce[i]=sc.nextInt();
				break;
			}
		}
			break;
		case 2:
			boolean t1 = true;
			int a2 = 0;
			System.out.println("---����Ҫ�޸ĵı�ţ�");
			int  nm = sc.nextInt();
			for(int i = 0;i<num.length;i++) {
				if(nm==num[i]) {
					t1 = false;
					a=i;
					break;
				}
			}
			if(t1) {
				
			}else {
			System.out.println("---¼���µĳɼ���");
			sorce[a2] = sc.nextInt();
			
			}
			break;
		case 3:
			int a1 =0;
			boolean fg = false;
			System.out.println("---����Ҫɾ���ı�ţ�");
			int nm2 = sc.nextInt();
			for(int i = 0;i<num.length;i++) {
				if(nm2==num[i]) {
					a1=i;
					fg=true;
					break;
				}
			}
			while(fg) {
			for(int i = a1;i<num.length-1;i++) {
				num[i]=num[i+1];
				name[i]=name[i+1];
				sorce[i]=sorce[i+1];
					
				}
			if(name[name.length-1]!=null) {
				num[num.length-1]=0;
				name[name.length-1]=null;
				sorce[sorce.length-1]=0;
				
				}
			   break;
			}
			break;
		case 4:
			for(int i = 0;i<name.length;i++) {
				if(name[i]!=null) {
				System.out.print("ѧ�ţ�"+num[i]+"\t");
				System.out.print("������"+name[i]+"\t");
				System.out.println("�ɼ���"+sorce[i]+"\t");
			}
				}
			break;
		case 5:
			int temp = 0;
			System.out.println("--------������ѧԱ����--------");
			System.out.print("---ѧ��\t"+"---����\t"+"---�ɼ�\t");
			for(int i=0 ;i<sorce.length;i++) {
				if(sorce[i]<60) {
					if(name[i]!=null) {
					System.out.print(num[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.println(sorce[i]+"\t");
					temp++;
					}else {
						break;
					}
				}
			}
			System.out.println("------------------------------");
			System.out.println("����������Ϊ��"+temp+"��");
		
			break;
		case 6:   
			falg = false;
			System.out.println("�ɹ��˳�ϵͳ��");
			break;
		default:
			break;	
			
		}
		
		}
	}
}
