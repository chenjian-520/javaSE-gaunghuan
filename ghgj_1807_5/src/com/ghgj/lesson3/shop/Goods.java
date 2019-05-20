package com.ghgj.lesson3.shop;

public class Goods {
	private String name ;
	private int number;
	private int price;
	private int quantity;
	public Goods( int number,String name, int price, int quantity) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.quantity = quantity;
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "商品 [名称：" + name + ", 商品编号：" + number + ", 商品价格：" + price + ", 商品数量：" + quantity + "]";
	}
	
}
