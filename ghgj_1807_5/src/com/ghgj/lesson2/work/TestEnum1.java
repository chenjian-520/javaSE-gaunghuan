package com.ghgj.lesson2.work;

import java.util.Scanner;
interface Info1{
	void af();
}
enum Person implements Info1{
	MANLE("nan"){
		@Override
		public void af() {
			// TODO Auto-generated method stub
			
		}
	} , FEMALE("nv"){
		@Override
		public void af() {
			// TODO Auto-generated method stub
			
		}
	};
	String sex;
	private Person(String sex) {
		this.sex = sex;
	}
	public void show(String person) {
		if(person.equals("nan")) {
			System.out.println("nan");
		}else {
			System.out.println("nv");
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sex+"xxx";
	}

}

enum Test implements Info1{
	Red{
		@Override
		public void af() {
			// TODO Auto-generated method stub
			System.out.println("��һ�����ǻƵ�");
		}
	} ,greed{
		@Override
		public void af() {
			// TODO Auto-generated method stub
			System.out.println("��һ�����Ǻ��");
		}
	},yellow{@Override
	public void af() {
		// TODO Auto-generated method stub
		System.out.println("��һ�������̵�");
	}};
	
}
public class TestEnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����Ա�");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Person.MANLE.show(str);
		System.out.println(Person.MANLE);
		
		Test.Red.af();
		Test.yellow.af();
		Test.greed.af();
	}

}
