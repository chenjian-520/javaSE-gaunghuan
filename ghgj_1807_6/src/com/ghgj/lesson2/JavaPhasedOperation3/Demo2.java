package com.ghgj.lesson2.JavaPhasedOperation3;

class Circle{
	private double radius;
	public Circle() {
		super();
		this.radius = 0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*3.14*this.radius;
	} 
	public double getPerimeter() {
		return 2*this.radius*3.14;
	}
	public void show() {
		System.out.println("半径："+this.radius+".面积："+
	this.getArea()+".周长："+this.getPerimeter());
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr = new Circle();
		cr.setRadius(12);
		cr.show();
	}
}
