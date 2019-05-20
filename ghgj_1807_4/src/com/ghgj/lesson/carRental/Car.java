package com.ghgj.lesson.carRental;

public class Car extends Vehicle {
	String type;
	
	@Override
	public int Calrent(int a,int b) {
		// TODO Auto-generated method stub
		if(a==1&&b==1) {
			return 500;
		}else if(a==2&&b==2) {
			return 600;
		}else if(a==2&&b==3) {
			return 700;
		}else{
			return 0;
		}
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	

}
