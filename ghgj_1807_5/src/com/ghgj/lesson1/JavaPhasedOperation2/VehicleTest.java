package com.ghgj.lesson1.JavaPhasedOperation2;

interface IFly{
	void fly();
}

abstract class Vehicle{
	int busload;
	public void run() {
		System.out.println("����");
	};
}

class Car extends Vehicle{
	String wheel;
	public void brake() {
		System.out.println("ɲ��");
	}
}

class Truck extends Car{
	String huochang;
	public void pull() {
		System.out.println("����");
	}
}

class Bus1 extends Car{
	String kechang;
	public void stop() {
		System.out.println("��վ");
	}
}

class plan extends Vehicle {
	String chibang;
	/*@Override
	public void fly() {
		System.out.println("���軮��");
	}*/
	IFly fly = () -> {System.out.println("���軮��");};
}



public class VehicleTest {
	public static void main(String[] args) {
		
	}
}
