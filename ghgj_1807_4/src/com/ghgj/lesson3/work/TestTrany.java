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
		System.out.println("������ʻ��");
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
		System.out.println("������ʻ��");
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
		System.out.println("Ա��"+name+"�ؼ���");
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
		Employee a1 = new Employee("�ı��");
		Employee a2 = new Employee("��ѧϰ");
		Bus bus = new Bus("������");
		Subway subway = new Subway("����");
		a1.goHome(bus);
		a2.goHome(subway);
	}

}
