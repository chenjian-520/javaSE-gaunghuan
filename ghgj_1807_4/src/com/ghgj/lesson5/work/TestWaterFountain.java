package com.ghgj.lesson5.work;

class School{
	static class WaterFountain{
		int x = 11;
		static int y = 22;
		public void show() {
			System.out.println(x);
			System.out.println(y);
		}
		public static void show1() {
			System.out.println(y);
			System.out.println(new WaterFountain().x);
		}
	}
	
	public void manager() {
		WaterFountain.show1();
		new WaterFountain().show();
	}
	
}


public class TestWaterFountain {
	public static void main(String[] args) {
		//不需要外部类对象
		School.WaterFountain  sw = new School.WaterFountain();
		sw.show1();
		sw.show();
	}
}
