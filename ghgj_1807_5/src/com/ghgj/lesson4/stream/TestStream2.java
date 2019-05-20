package com.ghgj.lesson4.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

public class TestStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stu = new ArrayList<>();
		stu.add(new Student("caslkasjg",35));
		stu.add(new Student("ccc",22));
		stu.add(new Student("ccg",55));
		show(stu,new Predicate<Student>() {
			
			@Override
			public boolean test(Student t) {
				// TODO Auto-generated method stub
				return t.getAge()>30&&t.getName().contains("g");
			}
		});
		
		
	}
	
	public static void show(List<Student> stus,Predicate<Student> p) {
		for(Student stu:stus) {
			if(p.test(stu)) {
				System.out.println(stu);
			}
		}
	}
	
	
	public static void funstionStream() {
	List<Integer> list = new ArrayList<>();
	Collections.addAll(list, 11,23,485,3,15,34,3215);
	list.stream().filter(v->v>20).forEach(System.out::println);
	System.out.println(list.stream().filter(v ->v<55).count());
	list.stream().forEach(System.out::println);
	}
	
	
}
