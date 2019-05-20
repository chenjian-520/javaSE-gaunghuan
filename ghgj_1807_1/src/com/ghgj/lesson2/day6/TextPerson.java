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
		staff.address="东景花园";
		staff.age=23;
		staff.name="张三丰";
		staff.serial = "2534";
		staff.sex = "男";
		
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
		 //声明  对象名，  引用名，  实例名
		Person goujing;
	//创建了一个对象 ， 实例	
		goujing = new Person();
		/*
		 * 初始化 ：
		 * 整形 0
		 * 应用数据类型 null
		 * 
		 */
		goujing.name = "郭靖";
		goujing.sex = "男";
		goujing.age = 23;
		System.out.println(goujing);
	//	goujing = null;  //空类型
		
		System.out.println(goujing.age);
		System.out.println(goujing.name);	
		System.out.println(goujing.sex);
	
		
		Person yangkang = new Person();
		
		System.out.println(yangkang.age);
		System.out.println(yangkang.name);	
		System.out.println(yangkang.sex);
		
	}
}
