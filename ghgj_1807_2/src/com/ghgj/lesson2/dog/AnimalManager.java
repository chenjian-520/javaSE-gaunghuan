package com.ghgj.lesson2.dog;

import java.util.Scanner;

/*
 * 管理
 */
public class AnimalManager {
	Dog[] dogs = new Dog[100];
	Penguin[] penguins = new Penguin[100];

	public void menu() {
		System.out.println("\t-------欢迎来到宠物商店--------\t");
		System.out.println("\t 1.领养：2.修改：3.退出：4.查看 ：5.丢掉宠物：");
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
		System.out.println("--输入菜单项：");
		menuNo = sc.nextInt();
		switch (menuNo) {
		case 1: // 领养
			System.out.println("--输入要领养的宠物类型：");
			System.out.println("\t1.狗狗：2.企鹅：");
			type = sc.nextInt();
			if (type == 1) {
				System.out.println("--请输入领养宠物性别");
				System.out.println("\t(1.狗爸：2.狗妈)");
				sex = sc.nextInt();
				if (sex == 1) {
					ssex = "狗爸";
				} else {
					ssex = "狗妈";
				}
				System.out.println("--请输入领养宠物品种");
				System.out.println("\t(1.聪明的拉布拉多：2.可爱的吉娃娃)");
				type = sc.nextInt();
				if (type == 1) {
					stype = "聪明的拉布拉多";
				} else {
					stype = "可爱的吉娃娃";
				}
				System.out.print("--请输入要领养宠物名字：");
				name = sc.next();
				System.out.println("宠物自白：");
				Dog dog = new Dog(name, stype, ssex, 100, 45);
				this.addDog(dog);
				System.out.println(dog.show());
				starMenu();
			} else {
				System.out.println("--请输入领养宠物性别");
				System.out.println("\t(1.Q哥：2.Q妹)");
				sex = sc.nextInt();
				if (sex == 1) {
					ssex = "Q哥";
				} else {
					ssex = "Q妹";
				}
				System.out.println("--请输入领养宠物品种");
				System.out.println("\t(1.无敌帝企鹅：2.可爱小蛋蛋)");
				type = sc.nextInt();
				if (type == 1) {
					stype = "无敌帝企鹅";
				} else {
					stype = "可爱小蛋蛋";
				}
				System.out.print("--请输入要领养宠物名字：");
				name = sc.next();
				System.out.println("宠物自白：");
				Penguin penguin = new Penguin(name, stype, ssex, 100, 35);
				this.addPenguin(penguin);
				System.out.println(penguin.show());
				starMenu();
				// 企鹅
			}

			break;
		case 2: // 修改
			System.out.println("请输入需要修改的名字");
			String a1 = sc.next();
			this.amend(a1);
			starMenu();
			break;
		case 4: // 查看
			this.refer();
			starMenu();
			break;
		case 3: // 退出
			System.out.println("成功退出宠物商店！");
			System.exit(0);
			break;
		case 5:// 推掉宠物
			System.out.println("请输入要丢掉的宠物类型（1.狗  2.企鹅）");
			int fg = sc.nextInt();
			System.out.println("请输入要丢掉的宠物名字：");
			String na = sc.next();
			deleteUser(fg, na);
			starMenu();
			break;
		default:
			starMenu();
			break;
		}
	}

	public void deleteUser(int fg, String name) {// 删除客户信息
		if (fg == 1) {
			boolean flag = true; // 两种方法1.同名从前向后删
			for (int i = 0; i < dogs.length; i++) {
				if (dogs[i] == null) {
					break;
				}
				if (dogs[i].getName().equals(name)) { // 找到相同的就删除
					flag = false;
					for (int a = i; a < dogs.length - 1; a++) {
						if (dogs[a] == null) {
							break;
						}
						dogs[a] = dogs[a + 1];
						System.out.println("丢掉宠物成功！");
					}
					if (dogs[dogs.length - 1] != null) {
						dogs[dogs.length - 1] = null;
					}

				}

				if (flag) {
					System.out.println("没有找到该宠物！");
				}

			}

		} else {
			boolean flag1 = false; // 2.同名从后向前删
			int a = 0;
			for (int i = 0; i < penguins.length; i++) {
				if (penguins[i] == null) { // 找到null结束 所以如果连续相同 找到离null前面最近的相同的 然后删除
					break;
				} else if (penguins[i].getName().equals(name)) { // 关键不同点
					a = i;
					flag1 = true;

				}
			}
			if (flag1) {
				System.out.println("丢掉宠物成功！");
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
				System.out.println("没有找到该宠物！");
			}
		}

	}

	public void addDog(Dog dog) {
		for (int i = 0; i < dogs.length; i++) {

			if (dogs[i] == null) {
				dogs[i] = dog;
				System.out.println("领养成功！");
				break;
			}
		}
	}

	public void addPenguin(Penguin penguin) {
		for (int i = 0; i < dogs.length; i++) {
			if (penguins[i] == null) {
				penguins[i] = penguin;
				System.out.println("领养成功！");
				break;
			}
		}
	}

	public void refer() { // 查询
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
			System.out.println("没有领养宠物");
		}
		return;
	}

	public void amend(String name) { // 修改
		Scanner sc = new Scanner(System.in);
		boolean falg = true;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				break;
			} else if (dogs[i].getName().equals(name)) {
				System.out.println("我是狗狗：" + dogs[i].getName());
				System.out.println("请输入需要修改的健康值");
				int a2 = sc.nextInt();
				System.out.println("请输入需要修改的好友度");
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
				System.out.println("我是企鹅：" + penguins[i].getName());
				System.out.println("请输入需要修改的健康值");
				int a2 = sc.nextInt();
				System.out.println("请输入需要修改的好友度");
				int a3 = sc.nextInt();
				penguins[i].setHealth(a2);
				penguins[i].setFriendly(a3);
				falg = false;
				break;
			}
		}
		while (falg) {
			System.out.println("没有找到该宠物！");
			break;
		}
		return;
	}

}
