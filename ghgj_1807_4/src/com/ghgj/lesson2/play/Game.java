package com.ghgj.lesson2.play;

import java.util.Scanner;

public class Game {
	String [] name= {"null","��Ѫ��","����","���ν��"};
	String [] quan= {"null","����","ʯͷ","��"};
	public static void main(String[] args) {
		Game  game = new Game();
		game.menu();
	}
	
	public void menu() {	
		System.out.println("--------------��ӭ������Ϸ����---------------\n\n");
		System.out.println("        *************************          ");
		System.out.println("        **       ��ȭ����ʼ                      **          ");
		System.out.println("        *************************          ");
		System.out.println("��ȭ����1.������2.ʯͷ��3.��");
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ϊֱ��ѡ���ɫ��(1.��Ѫ��,2.����,3.���ν��)");
		int a1 = sc.nextInt();
		FatherUser cu = new User(name[a1]);
		System.out.println("��ѡ��Ľ�ɫ��:"+cu.getName());
		FatherUser cp = new Computer();
		int b1 = cp.start(3);  // 3������������
		cp.setName(name[b1]);
		System.out.println("��������ѡ��Ľ�ɫ�ǣ�"+cp.getName());
		System.out.println("\n\nҪ��ʼ��Ϸ��\n");
		boolean flag = true;
		int i =0;
		while(flag) {
			System.out.println("���ȭ��1.������2.ʯͷ��3.��");
			int c = sc.nextInt();
			System.out.println("���ȭ��"+quan[c]);
			int c1 = cp.punches(3);
			System.out.println("���Գ�ȭ��"+quan[c1]);
			switch(c) {
			case 1:
				if(c1==1) {
				System.out.println("������;֣���˥����Ű�");
			}else if(c1==2) {
				System.out.println("����������ԣ�"+cp.getName()+"��Ӯ��");
				cp.addNumber();
			}else if (c1==3) {
				System.out.println("�����"+cp.getName()+"��Ӯ��");
				cu.addNumber();
			}
				break;
			case 2:
				if(c1==1) {
					System.out.println("�����"+cp.getName()+"��Ӯ��");
					cu.addNumber();
				}else if(c1==2) {
					System.out.println("������;֣���˥����Ű�");
				}else if (c1==3) {
					System.out.println("����������ԣ�"+cp.getName()+"��Ӯ��");
					cp.addNumber();
				}
				break;
			case 3:
				if(c1==1) {
					System.out.println("����������ԣ�"+cp.getName()+"��Ӯ��");
					cp.addNumber();
				}else if(c1==2) {
					System.out.println("�����"+cp.getName()+"��Ӯ��");
					cu.addNumber();
				}else if (c1==3) {
					System.out.println("������;֣���˥����Ű�");
				}
				break;
			}
			
			System.out.println("�Ƿ�ʼ��һ�֣�y/n��");
			i++;
			String st = sc.next();
			if(st.equals("y")) {
				flag = true;
			}else {
				System.out.println("��������"+cp.getName()+"  VS  "+"��"+cu.getName());
				System.out.println("��ս������"+i);
				System.out.println(cp.getNumber()+"   "+cu.getNumber());
				if(cu.getNumber()>cp.getNumber()) {
					System.out.println("�����(��)"+cu.getName()+"��ʤ");
				}else if(cu.getNumber()<cp.getNumber()) {
					System.out.println("�����(����)"+cp.getName()+"��ʤ");
				}else if(cu.getNumber()==cp.getNumber()) {
					System.out.println("ƽ��");
				}
				flag = false;
			}
				
		}
		

	
	
	}
}
