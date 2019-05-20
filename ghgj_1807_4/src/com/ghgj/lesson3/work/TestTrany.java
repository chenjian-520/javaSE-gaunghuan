package com.ghgj.lesson3.work;

abstract class Vehicle{
	private String name;
	
	public String getName() {
		return name;
	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public abstract void run() ;		
}

class Subway extends Vehicle{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("地铁行驶中");
	}

	public Subway(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class Bus extends Vehicle{

	public Bus(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("汽车行驶中");
	}
	
}

class Employee {
	private String name ;
	
	public String getName() {
		return name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void goHome(Vehicle vehicle) {
		System.out.println("员工"+name+"回家了");
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.run();
		}else {
			Subway subway = (Subway)vehicle;
			subway.run();
		}
	}
}

public class TestTrany {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1 = new Employee("文编程");
		Employee a2 = new Employee("文学习");
		Bus bus = new Bus("公交车");
		Subway subway = new Subway("地铁");
		a1.goHome(bus);
		a2.goHome(subway);
	}

}
