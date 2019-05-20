package com.ghgj.lesson7.work;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cc = new Circle();
		cc.r=3;
		System.out.println(cc.getArea());
		System.out.println(cc.getPerimeter());
	}

}

class Circle{
	int r;
	public double getArea(){
		return 2*3.14*r;
	}
	public double getPerimeter(){
		return 3.14*r*r; 
	}
}