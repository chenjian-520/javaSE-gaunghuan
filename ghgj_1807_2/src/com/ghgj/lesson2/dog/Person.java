package com.ghgj.lesson2.dog;

public class Person {
	private String name;
	private String sex;
	private int age;

	public String getSex() {
		return sex;
	}

	public void setSex(int age) {
		if (sex.equals("��") || sex.equals("Ů")) {

			this.sex = sex;
		} else {
			System.out.println("��ֵ����");
			this.sex = "��";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 60 && age >= 18) {
			this.age = age;
		} else {
			System.out.println("���ܹ���");
			this.age = 24;
		}
	}

	public static void main(String[] args) {
		// ���÷���
		Person per = new Person();
		per.setAge(19);
		System.out.println(per.getAge());
	}

}
