package com.ghgj.lesson7.work;

public class Circle1 {
	double redius;  //°ë¾¶
	public double findArea(double i) {
		redius = i;
		return 3.14*redius*redius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1  c1 = new Circle1();
		PassObject po = new PassObject();
		int a =po.printAreas(c1, 5);
		System.out.println("now radius is:"+a);
	}

}
class PassObject{
	
	public int printAreas (Circle1 c,int time){
		System.out.println("Radius\tArea");
		int i;
		for(i =1;i<=time;i++) {
			System.out.println(i+"\t"+c.findArea(i));
		}
		return i;
	}
}