package com.ghgj.lesson2.work;
//����ָ���������   ��������   Ҳ�����ǽӿ�
interface II{
	
}
class Point1<T>{
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public Point1(T name) {
		super();
		this.name = name;
	}
}

class Point<T>{
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public Point(T name) {
		super();
		this.name = name;
	}
}


public class TestPoint {
	
	public static void main(String[] args) {
		Point<String> p2 = new Point<String>("chen");
		//�����ƶ�    �����﷨
		Point<Integer> p1 = new Point<>(321);
		show1(p2);
	}
	public static void show2 (Point<Integer> p) {
		System.out.println(p.getName()+"...");
	}
	
	public static void show1 (Point<? extends Object> p) {
		System.out.println(p.getName()+"...");
	}
	
	public static void show (Point<Integer> p) {
		System.out.println(p.getName()+"...");
	}
	
}










