package com.ghgj.lesson5.work;

class Car{
	private int number;
	public Car(int number) {
		super();
		this.number = number;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	class Carlun{
		private String color;
		private int num;
		
		public String getColor() {
			return color;
		}
		public int getNum() {
			return num;
		}
		public Carlun(String color, int num) {
			super();
			this.color = color;
			this.num = num;
		}
		public void show() {
			System.out.println(color+","+num);
		}
	}
	public void show(Carlun carlun) {
		
		System.out.println(number+","+carlun.getColor()+","+carlun.getNum());
		
	}
}


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.Carlun carl = new Car(4).new Carlun("»Æ",4);
		carl.show();
		Car car = new Car(8);
		car.show(carl);	
	}

}
