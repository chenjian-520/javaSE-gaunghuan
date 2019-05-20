package com.ghgj.lesson1.day1;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo();
		int a1= td.demo1(2500);
		System.out.println(a1+"位数");
		
		int a2= td.demo2(3698, 500);
		System.out.println("工资为："+a2);
		
		double a3= td.demo3(5888, 500);
		System.out.println("工资为："+a3);
		
		double a4= td.demo4(5888, 500,0.8);
		System.out.println("工资为："+a4);
		
		boolean a5 = td.demo5("admin", "000000");
		System.out.println("输入为："+a5);
		
	}
	
	public boolean demo5(String name,String pwd) {
		if(name.equals("admin")&&pwd.equals("000000")) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	public double demo4(int n1 , int n2 , double n3) {
		double sum=0;
		if(n1>3000) {
			sum = 3000+n2+(n1-3000)*n3;
			}else {
				sum = n1+n2;
			}
			return sum;
	}
	 
	public  double demo3(int i,int j) {
		double sum=0;
		if(i>3000) {
		sum = 3000+j+(i-3000)*0.95;
		}else {
			sum = i+j;
		}
		return sum;
	}
	
	public  int demo2(int i ,int j) {
		return i+j;	
	}
	
	
	public  int demo1(int i) {
		int a=1;
		
		while(i/10!=0) {
			a++;
			i = i/10;
		}
		return a;
	}
	
	
}
