package com.ghgj.lesson3.work;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

class Dog implements Comparable<Dog> {
	private String name;
	private String type;
	private int age;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}

	public Dog(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + type + ", " + age;
	}

	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.age - o.getAge();
	}
}

class Student {
	private String name;
	private int age;
	private int score;
	private String classNum;
	public Student(String name, int age, int score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getScore() {
		return score;
	}
	public String getClassNum() {
		return classNum;
	}

}


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funstion2();
	}
	
	
	public static void funstion2() {
		List<Student>  list =new ArrayList<>();
		Student s1 = new Student("c1",21,81,"class1");
		Student s2 = new Student("c2",18,92,"class1");
		Student s3 = new Student("c3",17,75,"class1");
		Student s4 = new Student("c4",24,68,"class2");
		Student s5 = new Student("c5",17,75,"class2");
		Student s6 = new Student("c6",24,68,"class2");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		int sum1 = 0,sum2 = 0,sumAge =0;
		int i =0,j=0;
		for(Student s :list) {
			if(s.getClassNum().equals("class1")) {
				sum1 += s.getScore();
				i++;
			}else {
				sum2 += s.getScore();
				j++;
			}
			sumAge+=s.getAge();
		}
		System.out.println("class1ƽ���ɼ�:"+sum1/i+"\nclass2ƽ���ɼ�:"+sum2/j+"\nȫУƽ������:"+sumAge/list.size());
	}
	
	
	public static void funstion1() {
		List<String> list = new ArrayList<>();
		
		list.add("���ص���");list.add("�鶼");
		list.add("����͢");list.add("�Ĵ�����");
		list.add("����");list.add("ά������");
		list.add("��������");list.add("�ձ�");
		list.add("�й�");list.add("����");
		list.add("������");list.add("����");
		list.add("�����");list.add("����ʱ");
		list.add("����");list.add("�¹�");
		System.out.println(list);
		String s;
		Random r = new Random();
		
		for(int i =0;i<4;i++) {
			System.out.println("��"+(i+1)+"�飺");
			for(int j=0;j<4;j++) {
				s=list.get(r.nextInt(list.size()));
				System.out.print(s+"   ");
				list.remove(s);
			}
			System.out.println();
		}	
	}
	
	public static void funstion() {
		List<Dog> list = new ArrayList<>();
		Dog dog = new Dog("����", "��������", 3);
		list.add(dog);
		list.add(new Dog("����", "��ë", 2));
		list.add(new Dog("����", "��ʨ", 5));
		System.out.println(list);
		list.sort(null);
		list.forEach(System.out::println);
		System.out.println("-----------------------");
		list.sort((o1, o2) -> o2.getAge() - o1.getAge());
		list.forEach(System.out::println);
		System.out.println("-----------------------");
		ListIterator<Dog> it = list.listIterator();
		int a = 0;
		while (it.hasNext()) {
			if (it.next().getName().equals("����")) {
				a = it.nextIndex() - 1;
			}
		}
		// list.remove(dog);
		list.remove(a);
		list.forEach(System.out::println);
	}
}
