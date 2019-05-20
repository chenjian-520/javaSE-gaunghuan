package com.ghgj.lesson4.mapShop;

public class Goods {
	private int number;
	private String name;
	private int price;
	private int many;
	public Goods(int number, String name, int price, int many) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.many = many;
	}
	public int getNumber() {
		return number;
	}
	public int getMany() {
		return many;
	}
	public void setMany(int many) {
		this.many = many;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Goods(int number, String name, int price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return  number + "\t" + name + "\t" + price + "\t"+ many ;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
