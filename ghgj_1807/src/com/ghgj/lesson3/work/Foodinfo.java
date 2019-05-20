package com.ghgj.lesson3.work;
/**
 * 菜单类
 * @author Administrator
 *
 */
public class Foodinfo {
	
	String name;
	float price;
	int num;
	
	public Foodinfo(String name, float price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		num = 0;
	}
	public void menu() {
		System.out.println("本店菜单：1：鱼香肉丝");
		System.out.println("本店菜单：2：红烧肉");
		System.out.println("本店菜单：3：清炒土豆");
		System.out.println("本店菜单：4：清炒白菜");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
