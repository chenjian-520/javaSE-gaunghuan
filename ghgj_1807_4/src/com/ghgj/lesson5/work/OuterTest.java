package com.ghgj.lesson5.work;

class Cat{
	private int weight;
	public Cat(int weight) {
		super();
		this.weight = weight;
	}
	//ʵ����Ա�ڲ���
	class CatBody{
		private String color;
		public CatBody(String color) {
			super();
			this.color = color;
		}
		public void show() {
			//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա  ��Ϊ �ڲ��������������һ���ⲿ�����  Cat.this.weight
			System.out.println("��ɫ�ǣ�"+color+","+weight);
		}
	}
	
	public void display() {
		System.out.println(weight);
		//�ⲿ�� ���� �ڲ����ö���
		CatBody body =new CatBody("��ɫ");
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
		CowLeg leg = new CowLeg("��ɫ",25);
		leg.show();
	}
}


public class OuterTest {
	
	public static void main(String[] args) {
	/*	Cat cat = new Cat(22);
		cat.display();
		
		//�����ڲ������
		Cat.CatBody body = cat.new CatBody("��ɫ");
		Cat.CatBody body1 = new Cat(21).new CatBody("��ɫ");
		body.show();
		
		Cow.CowLeg leg = new Cow(12,25).new CowLeg("��",122);
		leg.show();
		Cow cow = new Cow(21,31);
		cow.show1();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}











