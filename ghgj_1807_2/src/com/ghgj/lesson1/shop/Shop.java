package com.ghgj.lesson1.shop;

import java.util.Scanner;

public class Shop {
	UserManager users = new UserManager();


	public void loginMeru() {
		System.out.println("***********�Ұ�Shopping����ϵͳ*************");
		System.out.println("             1.��¼ϵͳ                                                           ");
		System.out.println("             2.�˳�ϵͳ                                                           ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			AdmiUser u1 = new AdmiUser("admin", "000000");
			System.out.println("��¼ϵͳ :");
			System.out.print("�������û�����");
			String nu = sc.next();
			System.out.print("�������û������� ��");
			String cd = sc.next();
			boolean bl = u1.login(nu, cd);
			if (bl) {
				mainMeru();
			} else {
				System.out.println("û��Ȩ��");
			}
			break;
		case 2:
			System.out.println("�˳�ϵͳ :");
			System.exit(0);
			break;
		default:
			System.out.println("�����������������:");
			loginMeru();
			break;
		}
		sc.close();
	}

	public void mainMeru() {
		System.out.println("           �Ұ�Shopping����ϵͳ                                       ");
		System.out.println("****************************************");
		System.out.println("             1.�ͻ���Ϣ����                                                    ");
		System.out.println("             2.�������                                                           ");
		System.out.println("             0.����                                                                  ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("�ͻ���Ϣ���� :");
			userMenu();
			break;
		case 2:
			System.out.println("�������:");
			sendMenu();
			break;
		case 0:
			System.out.println("������һ���� :");
			loginMeru();
			break;
		default:
			System.out.println("�����������������:");
			mainMeru();
			break;
		}
		sc.close();
	}

	public void userMenu() {
		System.out.println("     �Ұ�Shopping����ϵͳ>>�ͻ���Ϣ����                           ");
		System.out.println("****************************************");
		System.out.println("             1.��ʾ���пͻ���Ϣ                                           ");
		System.out.println("             2.���ӿͻ���Ϣ                                                   ");
		System.out.println("             3.�޸�                                                                   ");
		System.out.println("             4.ɾ���ͻ���Ϣ                                                   ");
		System.out.println("             5.������һ����                                                   ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("�ͻ���Ϣ :");
			users.queryUser(); // ��ѯ�û�����
			userMenu();
			break;
		case 2:
			System.out.println("���ӿͻ���Ϣ :");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("�������ţ�");
			int a1 = sc1.nextInt();
			System.out.println("�������û�����");
			String a2 = sc1.next();
			System.out.println("���������ͣ�");
			String a3 = sc1.next();
			System.out.println("��������֣�");
			int a4 = sc1.nextInt();
			User chen = new User(a1, a2, a3, a4);
			users.addUser(chen); // ����û�����
			userMenu();
			break;
		case 3:
			System.out.println("�޸Ŀͻ���Ϣ :");
			System.out.println("�����û���ţ�");
			int num = sc.nextInt(); // ��Ҫ�޸ĵ��û����
			users.alterUser(num); // �޸��û���Ϣ����
			userMenu();
			break;
		case 4:
			System.out.println("ɾ���ͻ���Ϣ :");
			System.out.println("������Ҫɾ�����û���ţ�");
			int num1 = sc.nextInt(); // ��Ҫ�޸ĵ��û����
			users.deleteUser(num1);
			userMenu();
			break;
		case 5:
			System.out.println("������һ���� :");
			mainMeru();
			break;
		default:
			System.out.println("�����������������:");
			userMenu();
			break;
		}
		sc.close();
	}

	public void sendMenu() {
		System.out.println("           �Ұ�Shopping����ϵͳ �������                        ");
		System.out.println("****************************************");
		System.out.println("             1.���˴����                                                    ");
		System.out.println("             2.���˳齱                                                          ");
		System.out.println("             0.����                                                                  ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("���˴����  :");
			System.out.print("�������Ա��ţ�");
			int nu = sc.nextInt();
			users.luckUser(nu);
			sendMenu();
			break;
		case 2:
			System.out.println("���˳齱  :");
			System.out.print("�������Ա��ţ�");
			int nb = sc.nextInt();
			users.luckUser2(nb);
			sendMenu();
			break;
		case 0:
			System.out.println("������һ���� :");
			mainMeru();
			break;
		default:
			System.out.println("�����������������:");
			sendMenu();
			break;
		}
		sc.close();
	}

}
