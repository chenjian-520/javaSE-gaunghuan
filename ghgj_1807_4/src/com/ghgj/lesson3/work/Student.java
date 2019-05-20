package com.ghgj.lesson3.work;

public class Student {
	
	private String name;
	private int age ;
	
	@Override
	public int hashCode() {
		return name.hashCode()+age*8;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}if(obj == null) {
			return false;
		}
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return name.equals(st.name)&&age==st.age;
		}
		return false;
		
	}
	public Student(String name , int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" , "+age;
	}


/*
	@Override
	public boolean equals(Object obj) {
		// 
		Student stu = (Student) obj;
		
		return this.name.equals(stu.name)&&this.age == stu.age;
	}
*/


	public static void main(String[] args) {
		Student str = new Student("chen",52);
		System.out.println(str);
		
	}
}
