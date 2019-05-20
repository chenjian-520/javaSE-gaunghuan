package com.ghgj.lesson7.book;


import java.util.Date;


public class Book {
	private int number;
	private String name ;
	private double price;
	private String auther;
	private Date date =new Date();
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int number, String name, double price, String auther, Date date) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.auther = auther;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return  number + "\t" + name + "\t\t" + price + "\t" + auther + "\t"
				+ date ;
	}

//	public static void main(String[] args)throws Exception {
//		Book book = new Book();
//		
//		System.out.println(book.getDate());
//	}
	
}
