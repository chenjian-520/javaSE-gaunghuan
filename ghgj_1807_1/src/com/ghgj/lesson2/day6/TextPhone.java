package com.ghgj.lesson2.day6;

import java.util.Scanner;

public class TextPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone =new Phone();
		Cell cell =new Cell();
		phone.down();
		phone.charge();
		cell.csh("555", 2, 1);
		
		Administrator a1 = new Administrator();
		a1.setNumber("563732435", "3517827");
		Administrator a2 = new Administrator();
		a2.setNumber("53543883", "3514624");
		
		a1.getNumber();
		a2.getNumber();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------��Ա��¼---------");
		System.out.print("--����ɵ��û���");
		String a11 = sc.next();
		System.out.print("--����ɵ�����");
		String a12 = sc.next();
		if(a11.equals(a1.number)&&a12.equals(a1.code)) {
			System.out.println("��¼�ɹ�");
			System.out.print("--�����µ��û���");
			a1.number=sc.next();
			System.out.print("--�����µ�����");
			a1.code=sc.next();
			System.out.println("�޸ĳɹ���");
			
		}else {
			System.out.println("��¼ʧ�ܣ�");
			flag = false;
		}
		while(flag) {
		System.out.println("--------�µ��û���������-------------");
		a1.getNumber();
		break;
		}
		sc.close();
	}

}
