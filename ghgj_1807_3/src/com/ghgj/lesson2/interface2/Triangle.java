package com.ghgj.lesson2.interface2;

public class Triangle implements IShape {  //Èý½ÇÐÎÀà
	double  height;
	double  length ;
	
	public Triangle(double height, double length) {
		super();
		this.height = height;
		this.length = length;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height*length/2;
	}

}
