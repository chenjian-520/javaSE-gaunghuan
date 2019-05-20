package com.ghgj.lesson6.work;

interface IRent {
	public abstract void rent();
}

class Landlord implements IRent{

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("张三房东正在找中介进行租房>>>>>>");
		System.out.println("中介代理结束>>>>>>");
		System.out.println("---------------------");	
	}
}

class Intermediary implements IRent{
	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("实现类的方式>>>>>");
		System.out.println("中介开始代理租房>>>>>");
	}
}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRent ren = new Landlord();
		IRent ren1 = new Intermediary();
		ren1.rent();
		ren.rent();
		//匿名内部类
		new Intermediary() {
			@Override
			public void rent() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类的方式>>>>>");
				System.out.println("中介开始代理租房>>>>>");
			}	
		}.rent();
		new Landlord() {
			@Override
			public void rent() {
				// TODO Auto-generated method stub
				System.out.println("张三房东正在找中介进行租房>>>>>>");
				System.out.println("中介代理结束>>>>>>");
				System.out.println("---------------------");
			}
		}.rent();
		//lamdba 表达式
		IRent  lan =	()->{
			System.out.println("张三房东正在找中介进行租房>>>>>>");
			System.out.println("中介代理结束>>>>>>");
			System.out.println("---------------------");
		};
		IRent  lan1 = ()->{
			System.out.println("lamdba 表达式的方式>>>>>");
			System.out.println("中介开始代理租房>>>>>");
		};
		
		lan1.rent();
		lan.rent();
		
	}

}
