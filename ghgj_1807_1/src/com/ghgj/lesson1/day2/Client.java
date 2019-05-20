package com.ghgj.lesson1.day2;

public class Client {
	String name;
	int age;
	String sex;
	String shopList;
	
	public  Client(String name, int age ,String sex ){
		this.name=name;
		this.age = age;
		this.sex = sex;		
		
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	public void setName(String name ) {
		this.name = name;
		
	}
	public  void setAge(int age ) {
		this.age = age;
		
	}
	public  void setSex(String sex ) {
		this.sex = sex;
		
	}
	

}
