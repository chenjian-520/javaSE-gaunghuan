package com.ghgj.lesson2.abstract1;

public class Main {  //������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director(001,1,"����","����",5555,2);
		NormalEmployee normal = new NormalEmployee(002,2,"����","boss",55555,10);
		director.display();
		System.out.println("���ڹ���"+normal.getSbsidy(director.holidays));
		normal.display();
		System.out.println("���ڹ���"+normal.getSbsidy(normal.holidays));
	}

}
