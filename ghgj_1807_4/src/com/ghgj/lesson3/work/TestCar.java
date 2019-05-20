package com.ghgj.lesson3.work;

class Engine{
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}
}
class Wheel{
	int rout;
	public void inflate(int rout) {
		this.rout +=rout; 
		System.out.println("´òÆø"+this.rout);
	}
}
class Window {
	public void roolUp(){
		System.out.println("roolUp");
	}
	public void roolDown(){
		System.out.println("roolDowm");
	}
}
class Door{
	public void open() {
		System.out.println("openDoor");
	}
	public void close() {
		System.out.println("closeDoor");
	}
}
class Car{
	Engine engine;
	Wheel [] wheel;
	Door[] door ;
	public Car() {
		engine =new Engine();
		wheel = new Wheel[4];
		for(int i=0;i<wheel.length;i++) {
			wheel[i] = new Wheel();
		}
		door  = new Door[2];
		for(int i=0;i<door.length;i++) {
			door[i] = new Door();
		}
	}
	
	
	
}

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.door[1].close();
		car.engine.start();
		car.wheel[1].inflate(100);
	}

}
















