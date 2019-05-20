package com.ghgj.lesson2.interface3;

public class Test {  //测试类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog("大兵","绿色","非哺乳类");
		Rabbit rabbit = new Rabbit("美人","黑色","哺乳类");
		rabbit.shout();
		rabbit.eat();
		System.out.println("------------------");
		frog.shout();
		frog.eat();
	}

}
