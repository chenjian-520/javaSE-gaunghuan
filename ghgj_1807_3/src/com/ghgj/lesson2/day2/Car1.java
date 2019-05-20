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
		System.out.println("汽车行驶");
	}
	public void brake() {
		System.out.println("汽车刹车");
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
		System.out.println("卡车拉货");
	}
	@Override
	public void brake() {
		System.out.println("卡车卸货");
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
		System.out.println("公交车报站");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("公交车停靠站");
	}
}















