package com.ghgj.lesson2.day2;

public class Car1 {
	String engine;
	String wheel;
	
	public Car1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car1(String engine, String wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}
	public void run() {
		System.out.println("������ʻ");
	}
	public void brake() {
		System.out.println("����ɲ��");
	}
	
}

class Truck1 extends Car1{
	String wareHouse;
	String load ;
	public Truck1(String wareHouse, String load) {
		super();
		this.wareHouse = wareHouse;
		this.load = load;
	}
	@Override
	public void run() {
		System.out.println("��������");
	}
	@Override
	public void brake() {
		System.out.println("����ж��");
	}
}

class buy1 extends Car1{
	String passCom;
	String busload;
	public buy1(String passCom, String busload) {
		super();
		this.passCom = passCom;
		this.busload = busload;
	}

	@Override
	public void run() {
		System.out.println("��������վ");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("������ͣ��վ");
	}
}















