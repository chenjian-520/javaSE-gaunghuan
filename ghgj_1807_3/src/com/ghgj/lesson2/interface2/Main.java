package com.ghgj.lesson2.interface2;

public class Main { //测试类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5.6);
		Triangle triangle = new Triangle(5,2);
		System.out.println("圆的面积为："+circle.area());
		System.out.println("三角形的面积为："+triangle.area());
	}

}
