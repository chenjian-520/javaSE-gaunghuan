package com.ghgj.lesson4.demo;

import java.util.ArrayDeque;
import java.util.Deque;

class Book{
	private int number;
	private String name;
	private int price ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", number=" + number + ", price=" + price + "]";
	}
	public Book(int number ,String name, int price) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
	}
	
}

public class TestDeque {

	public static void main(String[] args) {
		Deque<Book> d = new ArrayDeque<>();
		Book b1 = new Book(1,"С����",100);
		Book b2 = new Book(2,"С����",90);
		Book b3 = new Book(3,"С����",80);
		Book b4 = new Book(4,"С����",70);
		d.push(b1);
		d.push(b2);
		d.push(b3);
		d.push(b4);
		while(d.size()>0) {
		System.out.println(d.pop());
		}
	}
}
