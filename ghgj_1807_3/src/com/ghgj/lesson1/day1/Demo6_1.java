package com.ghgj.lesson1.day1;

public class Demo6_1 {
	
	public int wege(int a ,int b,int c) {//项目经理
		return a+b+c;
	}
	public int wege(int a ,int b) {//程序员
		return a+b;
	}
	public int wege(int a ) {  //清洁员
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficTool buy = new TrafficTool(35,80);
		buy.run();
		buy.speedUp(20);
		buy.run();
		buy.speedDown(50);
		buy.run();
	}
}


class TrafficTool{
	Double speed;
	double size;
	public TrafficTool() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrafficTool(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	public void run() {
		System.out.println("体积"+size+"的交通工具以"+speed+"的速度行驶；");
	}
	public void speedUp(int a ) {
		this.speed+=a;
	}
	public void speedDown(int a) {
		this.speed-=a;
	}

}


















