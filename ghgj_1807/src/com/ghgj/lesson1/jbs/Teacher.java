package com.ghgj.lesson1.jbs;

public class Teacher {
	String name ="��ʦ";
	int age = 32;
	
	public void chage1(Teacher tea1){
		
		tea1.name = "����";
	}
	public void chage2(Teacher tea1){
		tea1 = new Teacher();
		tea1.name = "����";
	}
	public void chage3(Teacher tea1,Teacher tea2){
		tea1 = tea2;
		tea2.name="����";
	}
	public void chage4(int i){
		i = 30;
	}
	public static void main(String[] args) {
		Teacher test =new Teacher();
		int i = 21;
		Teacher tea1 = new Teacher();
		tea1.name = "����";
		tea1.age = 19;
		Teacher tea2 = new Teacher();
		tea2.name = "����";
		tea2.age = 23;
		test.chage1(tea1);
		test.chage2(tea1);
		test.chage3(tea1,tea2);
		test.chage4(i);
		System.out.println(i);
		System.out.println(tea1.name);
		System.out.println(tea1.age);
		System.out.println(tea2.name);
		System.out.println(tea2.age);
		
	}
}
