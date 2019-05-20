package com.ghgj.lesson2.interface2;

public class Circle implements IShape {  //‘≤¿‡
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}
