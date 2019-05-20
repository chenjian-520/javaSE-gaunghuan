package com.ghgj.lesson1.day1;

public class WaterStudent {
	int a =0;
	static int drak = 1000;
	public void jwater() {
		drak -=100;
		if(this.a == 0) {
			this.a = 100;
		}
	}
	public void hwater() {
		if(this.a>0) {
			this.a -=10; 
		}
	}
	public void show() {
		System.out.println(this.a+"  "+drak);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterStudent  a = new WaterStudent();
		WaterStudent  b = new WaterStudent();
		WaterStudent  c = new WaterStudent();
		System.out.println("a接水");
		a.jwater();
		System.out.println("a喝水2次");
		a.hwater();a.hwater();
		a.show();
		System.out.println("b接水");
		b.jwater();
		System.out.println("b喝水10次");
		for(int i =1;i<=10;i++) {
			b.hwater();
		}
		b.show();
		System.out.println("b接水");
		b.jwater();
		b.show();
		System.out.println("c接水");
		c.jwater();
		System.out.println("c喝水7次");
		for(int i =1;i<=7;i++) {
			c.hwater();
		}
		c.show();
	}
}
