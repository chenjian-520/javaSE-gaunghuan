package com.ghgj.lesson7.work;

import java.util.Scanner;

public class Menu {
	int [] number = new int [100];
	String [] name = new String [100];
	double [] price = new double [100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu  chen = new Menu();
		chen.menu();
		boolean  falg = true;
		while(falg) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--������ѡ��");
			switch(sc.nextInt()) {
			case 1:     //���
				chen.add();
				break;
			case 2:		//�޸�
				chen.revise();
				break;
			case 3: 	//ɾ��
				chen.remove();
				break;
			case 4: 	//��ѯ
				chen.equire();
				break;
			case 5: 	//�˳�
				System.out.println("�˳��ɹ���");
				System.exit(0);
				break;
			default:System.out.println("�������");
				break;
			}
			
		}
	}
	 
	public void remove() {   //�Ӻ���ǰɾ��
		Scanner sc =new Scanner(System.in);
		System.out.print("����Ҫɾ����ͼ���ţ�");
		int number = sc.nextInt();
		int a = 0;boolean fa = true;
		for(int i=0;i<this.number.length;i++) {
			if(name[i]==null) {
				break;
			}
			if(this.number[i] == number) {
				a= i;
				fa = false;
			}
		}
		while(fa) {
			System.out.println("û����Ҫɾ������");
			return;
		}
		for(int i=a;i<this.number.length-1;i++) {
			this.number[i] = this.number[i+1];
			this.name[i] = this.name[i+1];
			this.price[i] = this.price[i+1];	
		}
		System.out.println("ɾ���ɹ���");
		if(this.name[name.length-1]!=null) {
			this.number[this.number.length-1] = 0;
			this.name[name.length-1]= null;
			this.price[price.length-1]=0;
		}
	}
	
	public void revise() {
		Scanner sc =new Scanner(System.in);
		System.out.print("����ͼ���ţ�");
		int number = sc.nextInt();
		for(int i = 0; i<this.number.length;i++) {
			if(this.name[i] == null) {
				break;
			}
			if(this.number[i] == number) {
				System.out.print("������ͼ�����ƣ�");
				String name = sc.next();
				System.out.print("������ͼ��۸�");
				double price = sc.nextDouble();	
				this.name[i] = name;
				this.price[i] =price;
				System.out.println("�޸ĳɹ���");
			}
		}	
	}
	
	public void equire() {
		System.out.println("���\t\t����\t\t����");
		for(int i = 0; i<name.length;i++) {
			if(name[i] == null) {
				break;
			}
			System.out.println(number[i]+"\t\t"+name[i]+"\t\t"+price[i]);
		}
	}
	
	public void add() {
		Scanner sc =new Scanner(System.in);
		System.out.print("����ͼ���ţ�");
		int number = sc.nextInt();
		System.out.print("����ͼ�����ƣ�");
		String name = sc.next();
		System.out.print("����ͼ��۸�");
		double price = sc.nextDouble();
		for(int i = 0; i<this.name.length;i++){
			if(this.name[i]==null) {
				this.number[i] = number;
				this.name[i] = name;
				this.price[i] = price;
				System.out.println("��ӳɹ���");
				break;
			}
		}	
	}
	
	public void menu() {
		System.out.println("******************************");
		System.out.println(" 1.���   2.�޸�   3.ɾ��   4.��ѯ   5.�˳�     ");
		System.out.println("******************************");
	}

}
















