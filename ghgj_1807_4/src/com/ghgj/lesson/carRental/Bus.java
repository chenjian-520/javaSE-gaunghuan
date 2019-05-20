package com.ghgj.lesson.carRental;

public class Bus extends Vehicle {
 int number;
	@Override
	public int Calrent(int a, int b) {
		// TODO Auto-generated method stub
		if(a==1&&b<=16) {
			return 800;
		}else if(a==2&&b>16) {
			return 1500;
		}
		else{
			return 0;
		}
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

}
