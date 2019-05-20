package com.ghgj.lesson5.work;

import org.omg.Messaging.SyncScopeHelper;

class Library{
	private String name ;
	private String author;
	private int price;
	
	public Library(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	static class MangerLirary{
		public void show() {
			Library ly = new Library("计算机java","陈健",253);
			System.out.println("管理图书");
			System.out.println(ly.name +","+ly.author+","+ly.price);
		}
	}
}




public class TestLibrary {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library.MangerLirary lm =new  Library.MangerLirary();
			lm.show();
			int b =2;
			class Chen {
				private int a = 11;
				static final int c = 29;
			public void Chen() {
				System.out.println(b);//b 的值不能改
				System.out.println(a);
				}
			}
			
			class Child extends Library{

				public Child(String name, String author, int price) {
					super(name, author, price);
					// TODO Auto-generated constructor stub
				}
				
			}
			
			
	}

}
