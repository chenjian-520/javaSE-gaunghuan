package com.ghgj.lesson1.work;

import java.io.PrintStream;
import java.util.Scanner;

class AgeException extends Exception{
/*	public AgeException (String str){
		super(str);
	}*/
	
	private String mesage;
	public AgeException(String mesage) {
		this.mesage = mesage;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "message :"+mesage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "String :"+mesage;
	}
	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		System.out.println("printStackTrace:"+mesage);
	}
	
}

class GenderException extends RuntimeException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "�Ա�ֻ�����к�Ů";
	}
	
}

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)  {
		if(age>=0&&age<=150) {
		this.age = age;
		}else {
			throw new RuntimeException("���������0��150֮��");
		}
	}
	
}

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person pe = new Person();
		try {
			pe.setAge(10);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pe.getAge());*/
		
		Scanner sc = new Scanner(System.in);
		String sex = sc.next();
		if(sex.equals("��")||sex.equals("Ů")) {
			System.out.println("�ɹ���ֵ");
		}else {
			throw new GenderException();
		}
	}

}
