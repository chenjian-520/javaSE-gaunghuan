package com.ghgj.lesson2.JavaPhasedOperation3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


class Goods implements Serializable{
	private int no;
	private String name;
	private int price;
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Goods(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
}


public class Demo8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<Integer,Goods>  map =new HashMap<>();
		Goods a1= new Goods(1,"薯条",21);
		Goods a2= new Goods(2,"饼干",11);
		Goods a3= new Goods(3,"果冻",31);
		map.put(a1.getNo(), a1);
		map.put(a2.getNo(), a2);
		map.put(a3.getNo(), a3);
		System.out.println(map);
		File f1 = new File("F:\\eclipse\\object.txt");
		FileOutputStream four = new FileOutputStream(f1);
		ObjectOutputStream object = new ObjectOutputStream(four);
		//写
		object.writeObject(map);
		//关
		object.close();
		System.out.println("反序列化");
		//反序列化
		FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		HashMap stu=(HashMap)objin.readObject();
		System.out.println(stu);
		objin.close();
		
	}
}
