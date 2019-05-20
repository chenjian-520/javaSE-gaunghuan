package com.ghgj.lesson2.work;
class Person{
	private String  string;
	public Person() {
		super();
	}
	public Person(String string) {
		super();
		this.string = string;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public void daying() {
		System.out.println("BlackPrinter   "+string);
	}
	
}

public class TestPerson extends Person {
	
	public TestPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestPerson(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void daying() {
		// TODO Auto-generated method stub
		System.out.println("ColorPrinter   "+super.getString());
		super.daying();
	}
	
	public static void main(String[] args) {
		TestPerson  tp = new TestPerson("ssss");
		tp.daying();
	
	}
}




















