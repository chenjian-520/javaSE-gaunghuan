package com.ghgj.lesson1.JavaPhasedOperation2;

interface IVehicle{
	void start(String a);
	void stop(String a);
}

class Bike implements IVehicle{

	@Override
	public void start(String a) {
		System.out.println("..."+a);
	}
	@Override
	public void stop(String a) {
		System.out.println("..."+a);
	}
}

class Bus implements IVehicle{
	
	@Override
	public void start(String a) {
		System.out.println("..."+a);
	}
	@Override
	public void stop(String a) {
		System.out.println("..."+a);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		IVehicle bus = new Bus();
		IVehicle bike = new Bike();
		bus.start("开始");
		bus.stop("结束");
		bike.start("开始1");
		bike.stop("结束1");
	}

}
