package com.ghgj.lesson3.work;

import java.util.HashSet;
import java.util.Set;

class Employee{
	private String name ;
	private int no;
	public Employee( int no,String name) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emloyee [name=" + name + ", no=" + no + "]";
	}
	@Override
	public int hashCode() {
		return name.hashCode()+no*23;
	}
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		else {
			return this.name.equals(e.getName())&&this.no==e.getNo();
		}
	}
}

public class TestSet1 {

	public static void main(String[] args) {

		Set<Employee> emps = new HashSet<>();
		Employee  a1 = new Employee(2,"ss");
		Employee  a2 = new Employee(1,"aa");
		Employee  a3 = new Employee(3,"bb");
		Employee  a4 = new Employee(2,"ss");
		emps.add(a1);
		emps.add(a2);
		emps.add(a3);
		emps.add(a4);
		System.out.println(emps);
		
		
		Set<Integer> s1 = new HashSet<>();
		for(;s1.size()<7;) {
		s1.add((int)(Math.random()*(30-1+1)+1));
				}
		System.out.println(s1);
		
	/*	Set<String> set = new HashSet();
		set.add("aa");
		set.add("aac");
		set.add("aaa");
		set.add("aa");
		System.out.println(set);*/
		
	}

}
