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
	//�����෽��
	//La la1 = (s) -> {return Integer.parseInt(s);};
	La la1 = s -> Integer.parseInt(s);
	La la2 = Integer::parseInt;
	//�ض���������ʵ������
	La la3 = s->"hello".indexOf(s);
	La la4 = "hello"::indexOf;
	// ĳ������ʵ������
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
				System.out.println("С����");
			}
		});
		//lambda ���ʽ
		Run run = () -> {System.out.println("С����");};
		Object o = run;
		Object o1 =(Run) () -> {System.out.println("С����");};
		a.TestRun(() -> {System.out.println("С����");});
		
		Istr str = (s,a1,b) ->{return s.substring(a1,b);};
		String str1=str.str("lenggth",2,5);
		System.out.println(str1);
	}
}
