package com.ghgj.lesson5.work;

class Cat{
	private int weight;
	public Cat(int weight) {
		super();
		this.weight = weight;
	}
	//实例成员内部类
	class CatBody{
		private String color;
		public CatBody(String color) {
			super();
			this.color = color;
		}
		public void show() {
			//内部类可以直接访问外部类的成员  因为 内部类对象中隐藏了一个外部类对象  Cat.this.weight
			System.out.println("颜色是："+color+","+weight);
		}
	}
	
	public void display() {
		System.out.println(weight);
		//外部类 访问 内部类用对象
		CatBody body =new CatBody("白色");
		body.show();
	}
}

class Cow{
	private int height;
	private int wight;
	public Cow(int height, int wight) {
		super();
		this.height = height;
		this.wight = wight;
	}
	
	public Cow() {
		super();
		// TODO Auto-generated constructor stub
	}

	class CowLeg{
		private String color;
		private int lon;
		public CowLeg(String color, int lon) {
			super();
			this.color = color;
			this.lon = lon;
		}
		

		public CowLeg() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getColor() {
			return color;
		}

		public int getLon() {
			return lon;
		}

		public void show() {
			System.out.println(height+","+wight+","+color+","+lon);
		}


		private Cow getOuterType() {
			return Cow.this;
		}
	}
	
	public void show1() {
		
		System.out.println(height+","+wight+",");
		CowLeg leg = new CowLeg("白色",25);
		leg.show();
	}
}


public class OuterTest {
	
	public static void main(String[] args) {
	/*	Cat cat = new Cat(22);
		cat.display();
		
		//创建内部类对象
		Cat.CatBody body = cat.new CatBody("黑色");
		Cat.CatBody body1 = new Cat(21).new CatBody("黑色");
		body.show();
		
		Cow.CowLeg leg = new Cow(12,25).new CowLeg("黄",122);
		leg.show();
		Cow cow = new Cow(21,31);
		cow.show1();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}











