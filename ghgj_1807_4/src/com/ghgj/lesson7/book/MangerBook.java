package com.ghgj.lesson7.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MangerBook {
	public static Book [] book = new Book[1000];
	
	public void menu() throws ParseException {
		System.out.println("**************************");
		System.out.println("***    ͼ�����ϵͳ 2.0    ***");
		System.out.println("**************************");
		System.out.println("----------------------------------------");
		System.out.println("1.���	2.�޸�	3.ɾ��	4.��ѯ	5.�˳�");
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("--����ѡ��ı�ţ�");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			add();
			menu();
			break;
		case 2:
			take();
			menu();
			break;
		case 3:
			delete();
			menu();
			break;
		case 4:
			query();
			menu();
			break;
		case 5:
			System.out.println("�˳��ɹ���");
			System.exit(0);
			break;
		default:
			System.out.println("������� ���������룺");
			menu();
			break;
		}
	}
	//���
	public void add() throws ParseException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ͼ���ţ�");
		int number = sc.nextInt();
		System.out.println("������ͼ������");
		String name = sc.next();
		System.out.println("������ͼ�鵥�ۣ�");
		double price = sc.nextDouble();
		System.out.println("������ͼ�����ߣ�");
		String auther = sc.next();
		System.out.println("������ͼ��������ڣ���yyyy-mm-dd��");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse(sc.next());	
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
				book[i] = new Book(number,name,price,auther,date); 
				System.out.println("��ӳɹ���");
				break;
			}
		}
	}
	//�޸�
	public void take() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ͼ���ţ�");
		int number = sc.nextInt();
		System.out.println("�������µ�ͼ������");
		String name = sc.next();
		System.out.println("�������µ�ͼ�鵥�ۣ�");
		double price = sc.nextDouble();
		System.out.println("�������µ�ͼ�����ߣ�");
		String auther = sc.next();
		System.out.println("�������µ�ͼ��������ڣ���yyyy-mm-dd��");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse(sc.next());	
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i].getNumber()==number) {
				book[i] = new Book(number,name,price,auther,date); 
				System.out.println("�޸ĳɹ���");
				break;
			}
		}	
	}
	//ɾ��
	public void delete() {
		System.out.println("*����Ҫɾ����ͼ���ţ�");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(),b=0;
		boolean fl = false;
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
				break;
			}
			if(MangerBook.book[i].getNumber()==number) {
					b=i;
					fl = true;
					break;
				}
			}
		if(fl) {
		for(int i = b; i<MangerBook.book.length-1;i++) {
			MangerBook.book[i] = MangerBook.book[i+1];
			if(MangerBook.book[i]==null) {
				System.out.println("ɾ���ɹ�");
				break;
				}
			}
		}else {
			System.out.println("�]��ͼ��");
		}
		if(MangerBook.book[MangerBook.book.length-1]!=null) {
			MangerBook.book[MangerBook.book.length-1]=null;
		}
		
	}
	//��ѯ
	public void query() {
		for(int i = 0; i<MangerBook.book.length;i++) {
			if(MangerBook.book[i]==null) {
					break;
				}
			System.out.println("���\t����\t\t����\t����\t��������\t\t");
			System.out.println(MangerBook.book[i].toString());
		}

	}
	
	
	
}

