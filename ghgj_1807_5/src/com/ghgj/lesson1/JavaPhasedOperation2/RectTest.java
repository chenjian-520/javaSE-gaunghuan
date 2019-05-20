package com.ghgj.lesson1.JavaPhasedOperation2;

class Rest{
	protected int wigth;
	protected int height;
	public int getWigth() {
		return wigth;
	}
	public void setWigth(int wigth) {
		this.wigth = wigth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Rest(int wigth, int height) {
		super();
		this.wigth = wigth;
		this.height = height;
	}
	public Rest() {
		super();
		wigth = 10;
		height = 10;
	}
	
	public int area() {
		return wigth*height;
	}
	public int perimeter() {
		return (wigth+height)*2;
	}
	
}

public class RectTest {
	public static void main(String[] args) {
		
	}
}
