package com.ghgj.lesson2.dog;

import java.util.Scanner;

/*
 * ����
 */
public class AnimalManager {
	Dog[] dogs = new Dog[100];
	Penguin[] penguins = new Penguin[100];

	public void menu() {
		System.out.println("\t-------��ӭ���������̵�--------\t");
		System.out.println("\t 1.������2.�޸ģ�3.�˳���4.�鿴 ��5.�������");
		System.out.println("\t--------------------------\t");

	}

	public void starMenu() {
		menu();
		int menuNo;
		int type;
		String stype;
		int sex;
		String ssex;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("--����˵��");
		menuNo = sc.nextInt();
		switch (menuNo) {
		case 1: // ����
			System.out.println("--����Ҫ�����ĳ������ͣ�");
			System.out.println("\t1.������2.��죺");
			type = sc.nextInt();
			if (type == 1) {
				System.out.println("--���������������Ա�");
				System.out.println("\t(1.���֣�2.����)");
				sex = sc.nextInt();
				if (sex == 1) {
					ssex = "����";
				} else {
					ssex = "����";
				}
				System.out.println("--��������������Ʒ��");
				System.out.println("\t(1.�������������ࣺ2.�ɰ��ļ�����)");
				type = sc.nextInt();
				if (type == 1) {
					stype = "��������������";
				} else {
					stype = "�ɰ��ļ�����";
				}
				System.out.print("--������Ҫ�����������֣�");
				name = sc.next();
				System.out.println("�����԰ף�");
				Dog dog = new Dog(name, stype, ssex, 100, 45);
				this.addDog(dog);
				System.out.println(dog.show());
				starMenu();
			} else {
				System.out.println("--���������������Ա�");
				System.out.println("\t(1.Q�磺2.Q��)");
				sex = sc.nextInt();
				if (sex == 1) {
					ssex = "Q��";
				} else {
					ssex = "Q��";
				}
				System.out.println("--��������������Ʒ��");
				System.out.println("\t(1.�޵е���죺2.�ɰ�С����)");
				type = sc.nextInt();
				if (type == 1) {
					stype = "�޵е����";
				} else {
					stype = "�ɰ�С����";
				}
				System.out.print("--������Ҫ�����������֣�");
				name = sc.next();
				System.out.println("�����԰ף�");
				Penguin penguin = new Penguin(name, stype, ssex, 100, 35);
				this.addPenguin(penguin);
				System.out.println(penguin.show());
				starMenu();
				// ���
			}

			break;
		case 2: // �޸�
			System.out.println("��������Ҫ�޸ĵ�����");
			String a1 = sc.next();
			this.amend(a1);
			starMenu();
			break;
		case 4: // �鿴
			this.refer();
			starMenu();
			break;
		case 3: // �˳�
			System.out.println("�ɹ��˳������̵꣡");
			System.exit(0);
			break;
		case 5:// �Ƶ�����
			System.out.println("������Ҫ�����ĳ������ͣ�1.��  2.��죩");
			int fg = sc.nextInt();
			System.out.println("������Ҫ�����ĳ������֣�");
			String na = sc.next();
			deleteUser(fg, na);
			starMenu();
			break;
		default:
			starMenu();
			break;
		}
	}

	public void deleteUser(int fg, String name) {// ɾ���ͻ���Ϣ
		if (fg == 1) {
			boolean flag = true; // ���ַ���1.ͬ����ǰ���ɾ
			for (int i = 0; i < dogs.length; i++) {
				if (dogs[i] == null) {
					break;
				}
				if (dogs[i].getName().equals(name)) { // �ҵ���ͬ�ľ�ɾ��
					flag = false;
					for (int a = i; a < dogs.length - 1; a++) {
						if (dogs[a] == null) {
							break;
						}
						dogs[a] = dogs[a + 1];
						System.out.println("��������ɹ���");
					}
					if (dogs[dogs.length - 1] != null) {
						dogs[dogs.length - 1] = null;
					}

				}

				if (flag) {
					System.out.println("û���ҵ��ó��");
				}

			}

		} else {
			boolean flag1 = false; // 2.ͬ���Ӻ���ǰɾ
			int a = 0;
			for (int i = 0; i < penguins.length; i++) {
				if (penguins[i] == null) { // �ҵ�null���� �������������ͬ �ҵ���nullǰ���������ͬ�� Ȼ��ɾ��
					break;
				} else if (penguins[i].getName().equals(name)) { // �ؼ���ͬ��
					a = i;
					flag1 = true;

				}
			}
			if (flag1) {
				System.out.println("��������ɹ���");
				for (int i = a; i < penguins.length - 1; i++) {
					if (penguins[i] == null) {
						break;
					}
					penguins[i] = penguins[i + 1];

				}
				if (penguins[penguins.length - 1] != null) {
					penguins[penguins.length - 1] = null;
				}
			} else {
				System.out.println("û���ҵ��ó��");
			}
		}

	}

	public void addDog(Dog dog) {
		for (int i = 0; i < dogs.length; i++) {

			if (dogs[i] == null) {
				dogs[i] = dog;
				System.out.println("�����ɹ���");
				break;
			}
		}
	}

	public void addPenguin(Penguin penguin) {
		for (int i = 0; i < dogs.length; i++) {
			if (penguins[i] == null) {
				penguins[i] = penguin;
				System.out.println("�����ɹ���");
				break;
			}
		}
	}

	public void refer() { // ��ѯ
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				break;
			}
			System.out.println(dogs[i].show());
		}
		for (int i = 0; i < penguins.length; i++) {
			if (penguins[i] == null) {
				break;
			}
			System.out.println(penguins[i].show());
		}
		if (dogs[0] == null && penguins[0] == null) {
			System.out.println("û����������");
		}
		return;
	}

	public void amend(String name) { // �޸�
		Scanner sc = new Scanner(System.in);
		boolean falg = true;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				break;
			} else if (dogs[i].getName().equals(name)) {
				System.out.println("���ǹ�����" + dogs[i].getName());
				System.out.println("��������Ҫ�޸ĵĽ���ֵ");
				int a2 = sc.nextInt();
				System.out.println("��������Ҫ�޸ĵĺ��Ѷ�");
				int a3 = sc.nextInt();
				dogs[i].setHealth(a2);
				dogs[i].setFriendly(a3);
				falg = false;
				break;
			}
		}
		for (int i = 0; i < penguins.length; i++) {
			if (penguins[i] == null) {
				break;
			} else if (penguins[i].getName().equals(name)) {
				System.out.println("������죺" + penguins[i].getName());
				System.out.println("��������Ҫ�޸ĵĽ���ֵ");
				int a2 = sc.nextInt();
				System.out.println("��������Ҫ�޸ĵĺ��Ѷ�");
				int a3 = sc.nextInt();
				penguins[i].setHealth(a2);
				penguins[i].setFriendly(a3);
				falg = false;
				break;
			}
		}
		while (falg) {
			System.out.println("û���ҵ��ó��");
			break;
		}
		return;
	}

}
