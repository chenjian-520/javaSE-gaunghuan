package com.ghgj.lesson2.day6;

public class TextPerson {
	public static void main(String[] agrs) {
		TextPerson.staff();
		Person zhangsan = new Person();
		zhangsan.run();
		
		int a = zhangsan.run1();
		
		System.out.println(a);
		
		zhangsan.say();
		
		
	}
	
	public static void staff() {
		Person staff = new Person();
		staff.address="������԰";
		staff.age=23;
		staff.name="������";
		staff.serial = "2534";
		staff.sex = "��";
		
		System.out.println(staff.serial+"  "+
				staff.name+"  "+
				staff.address+"  "+
				staff.age+"  "+
				staff.sex	);
		
		
		int y=staff.daka();
		System.out.println(y);
		staff.self();
		staff.work();
	}
	
	public static void goujin() {
		 //����  ��������  ��������  ʵ����
		Person goujing;
	//������һ������ �� ʵ��	
		goujing = new Person();
		/*
		 * ��ʼ�� ��
		 * ���� 0
		 * Ӧ���������� null
		 * 
		 */
		goujing.name = "����";
		goujing.sex = "��";
		goujing.age = 23;
		System.out.println(goujing);
	//	goujing = null;  //������
		
		System.out.println(goujing.age);
		System.out.println(goujing.name);	
		System.out.println(goujing.sex);
	
		
		Person yangkang = new Person();
		
		System.out.println(yangkang.age);
		System.out.println(yangkang.name);	
		System.out.println(yangkang.sex);
		
	}
}
