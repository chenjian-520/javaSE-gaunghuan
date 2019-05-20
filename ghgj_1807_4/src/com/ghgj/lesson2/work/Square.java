package com.ghgj.lesson2.work;

public class Square extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("画正方形");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("擦除正方形");				
	}
	public static void main(String[] args) {
		Shape ro = new Round();
		Shape sq = new Square();
		ro.draw();ro.erase();
		sq.draw();sq.erase();
	}
	
}
