package com.ghgj.lesson1.JavaPhasedOperation2;

interface IFly{
	void fly();
}

abstract class Vehicle{
	int busload;
	public void run() {
		System.out.println("运输");
	};
}

class Car extends Vehicle{
	String wheel;
	public void brake() {
		System.out.println("刹车");
	}
}

class Truck extends Car{
	String huochang;
	public void pull() {
		System.out.println("拉货");
	}
}

class Bus1 extends Car{
	String kechang;
	public void stop() {
		System.out.println("报站");
	}
}

class plan extends Vehicle {
	String chibang;
	/*@Override
	public void fly() {
		System.out.println("飞翔划行");
	}*/
	IFly fly = () -> {System.out.println("飞翔划行");};
}



public class VehicleTest {
	public static void main(String[] args) {
		
	}
}
