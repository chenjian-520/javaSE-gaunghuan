package com.ghgj.lesson1.shop;

import java.util.Scanner;

public class UserManager {
	User[] user = new User[1000];
	int number = 0;

	public UserManager() {
		User chen = new User(12, "����", "��", 6352);
		user[number] = chen;
		number++;

	}

	public void addUser(User chen) { // ���

		user[number] = chen;
		number++;

	}

	public void queryUser() {
		if (user[0] == null) {
			System.out.println("--û�пͻ���Ϣ--");
			return; // ��������
		}
		System.out.println("���\t����\t����\t����");
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else {
				System.out.println(user[i].show());
			}
		}
	}

	public void alterUser(int num) {
		boolean flag = true;// �޸Ŀͻ���Ϣ
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				flag = false;
				Scanner sc1 = new Scanner(System.in);
				/*
				 * System.out.println("�������µı�ţ�"); user[i].number = sc1.nextInt();
				 * System.out.println("�������µ��û�����"); user[i].name = sc1.next();
				 * System.out.println("�������µ����ͣ�"); user[i].type = sc1.next();
				 */
				System.out.println("�������µĻ��֣�");
				user[i].setIntegrals(sc1.nextInt());

			}

		}
		while (flag) {
			System.out.println("û���ҵ��ÿͻ���Ϣ��");
			break;
		}
		return;
	}

	public void deleteUser(int num1) {// ɾ���ͻ���Ϣ
		boolean flag1 = false;
		int a = 0;
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num1) {
				flag1 = true;
				a = i;
			}
		}
		if (flag1) {
			user[a].set(0, null, null, 0);
			System.out.println("ɾ���û��ɹ���");
			number--;
			for (int i = a; i < user.length - 1; i++) {
				user[i] = user[i + 1];
				if (user[i] == null) {
					break;
				}
			}
			if (user[user.length - 1] != null) {
				user[user.length - 1] = null;
			}
		} else {
			System.out.println("û���ҵ��ÿͻ���Ϣ��");
		}
	}

	public void luckUser(int num) { // ���˴����
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				if (user[i].getType().equals("��") && user[i].getIntegrals() >= 1000) {
					System.out.println("--�û���Ϣ--");
					System.out.println(user[i].show());
					System.out.println("--�ۼӺ�--");
					user[i].setIntegrals(user[i].getIntegrals() + 500);
					System.out.println(user[i].show());
				} else if (user[i].getType().equals("��ͨ") && user[i].getIntegrals() >= 5000) {
					System.out.println("--�û���Ϣ--");
					System.out.println(user[i].show());
					System.out.println("--�ۼӺ�--");
					user[i].setIntegrals(user[i].getIntegrals() + 500);
					System.out.println(user[i].show());
				} else {
					System.out.println("лл���룡");
				}
			}
		}
	}

	public void luckUser2(int num) { // ���˳齱
		for (int i = 0; i < user.length; i++) {
			if (user[i] == null) {
				break;
			} else if (user[i].getNumber() == num) {
				if (user[i].getType().equals("��") && user[i].getIntegrals() >= 15000) {
					System.out.println("--�û���Ϣ--");
					System.out.println(user[i].show());
					System.out.println("--��ȡ�ʼǱ�����һ̨--");
				} else if (user[i].getType().equals("��") && user[i].getIntegrals() >= 8000) {
					System.out.println("--�û���Ϣ--");
					System.out.println(user[i].show());
					System.out.println("--��ȡС��6�ֻ�--");
				} else {
					System.out.println("лл���룡");
				}
			}
		}
	}

}
