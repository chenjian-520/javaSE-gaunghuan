package com.ghgj.lesson6.work;

interface ITaste{
	public abstract void taste();
}

interface IDrive{
	public abstract void drive(String wheather);
}

interface IAdd{
	public abstract void add(int a , int b);
}

class Plan{
	public void plan(ITaste taste , IDrive drive ,IAdd add,String wheather,int a,int b) {
		taste.taste();
		drive.drive(wheather);
		add.add(a, b);
	}
}

public class TestWheather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plan plan = new Plan();
		String wheather = "晴空万里";
		int a = 3,b=5;
		//匿名内部类
		ITaste taste = new ITaste() {
			@Override
			public void taste() {
				// TODO Auto-generated method stub
				System.out.println("这苹果味道不错");
				System.out.println("---------------------------------");
			}
		};
		IDrive drive = new IDrive() {
			@Override
			public void drive(String wheather) {
				// TODO Auto-generated method stub
				System.out.println("今天天气是"+wheather);
				System.out.println("直升机飞行很稳");
				System.out.println("----------------------------------");
			}
		};
		IAdd add = new IAdd() {
			@Override
			public void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+"+"+b+"的和为："+(a+b));
			}
		};
		plan.plan(taste, drive, add, wheather, a, b);
		
		//lamdba 表达式
		ITaste taste1 = ()->{
			System.out.println("这苹果味道不错");
			System.out.println("---------------------------------");
		};
		IDrive drive1 = (whear)->{
			System.out.println("今天天气是"+wheather);
			System.out.println("直升机飞行很稳");
			System.out.println("---------------------------------");
		};
		IAdd add1 = (a1,b1) -> {
			System.out.println(a+"+"+b+"的和为："+(a+b));
		};
		plan.plan(taste1, drive1, add1, wheather, a, b);
	}

}
