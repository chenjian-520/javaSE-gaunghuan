package com.ghgj.lesson2.day2;

public class Car {
	public void run() {
		System.out.println("汽车行驶");
	}
	public void brake() {
		System.out.println("汽车刹车");
	}
}

class Truck extends Car{
	@Override
	public void run() {
		System.out.println("卡车拉货");
	}
	@Override
	public void brake() {
		System.out.println("卡车卸货");
	}
}

class buy extends Car{
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
