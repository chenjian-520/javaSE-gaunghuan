package com.ghgj.lesson1.work;

interface Run{
	void run();
}

class Animal{
	public void TestRun(Run run) {
		run.run();
	}
}

interface La{
	Integer f(String s);
}

interface Istr{
	String str(String s,int a ,int b);
}

class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
}

interface La1{
	Student str(String name);
}
public class Testlambda {
	//引用类方法
	//La la1 = (s) -> {return Integer.parseInt(s);};
	La la1 = s -> Integer.parseInt(s);
	La la2 = Integer::parseInt;
	//特定对象引用实例方法
	La la3 = s->"hello".indexOf(s);
	La la4 = "hello"::indexOf;
	// 某类对象的实例方法
	La la5 = s -> s.length(); 
	La la6 = String::length;
	//
	La1 la7 = s -> new Student(s);
	La1 la8 = Student::new;
	
	public static void main(String[] args) {
		Integer i = new Testlambda().la2.f("35418");
		System.out.println(i);
		
		Testlambda tl = new Testlambda();
		System.out.println(tl.la8.str("chen").name);
		
		System.out.println(tl.la4.f("h"));
		
		Animal a = new Animal();
		a.TestRun(new Run() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("小猪跑");
			}
		});
		//lambda 表达式
		Run run = () -> {System.out.println("小跑跑");};
		Object o = run;
		Object o1 =(Run) () -> {System.out.println("小跑跑");};
		a.TestRun(() -> {System.out.println("小跑跑");});
		
		Istr str = (s,a1,b) ->{return s.substring(a1,b);};
		String str1=str.str("lenggth",2,5);
		System.out.println(str1);
	}
}
