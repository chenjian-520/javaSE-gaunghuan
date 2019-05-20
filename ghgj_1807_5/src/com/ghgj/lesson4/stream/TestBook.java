package com.ghgj.lesson4.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Book{
	private String name;
	private int price;
	private String auther;
	public Book(String name, int price, String auther) {
		super();
		this.name = name;
		this.price = price;
		this.auther = auther;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", auther=" + auther + "]";
	}
	
}

public class TestBook {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book("cehn.exe",20,"chen");
		Book b2 = new Book("cehn.java",40,"chesdfn1");
		Book b3 = new Book("a.txt",12,"chendsf2");
		Book b4 = new Book("cehn.java",50,"chen3");
		Collections.addAll(list, b1,b2,b3,b4);
		list.forEach(System.out::println);
		System.out.println("------------------------------");
		book2(list, v->v.getName().endsWith(".java") );
		int a=book1(list, v->v.getName().length()>5 );
		System.out.println("------------------------------");
		System.out.println(a);
		System.out.println("------------------------------");
		book2(list,v ->v.getPrice()>20&&v.getAuther().length()<6 );
	}
	
	public static int book1(List<Book> list,Predicate<Book> p) {
		int count = 0;

		for(Book b: list) {
			if(p.test(b)) {
				
				count++;
			}
		}
		return count;
	}
	
	public static void book2(List<Book> list,Predicate<Book> p) {

		list.forEach(e->{
		if(p.test(e)) {
			System.out.println(e);
		}
		});
	}


}
