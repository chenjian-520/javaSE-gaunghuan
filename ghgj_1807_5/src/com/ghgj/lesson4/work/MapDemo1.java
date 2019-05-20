package com.ghgj.lesson4.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

class Dog {
	private String name;
	private int age ;
	private String type;
	public Dog(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

public class MapDemo1 {

	public static void main(String[] args) {
		funstionMap1();
		
	}
	
	public static void funstionMap1() {
		Map<String,Dog> m = new HashMap<>();
		Dog d1=new Dog("chen",18,"dagou");
		Dog d2=new Dog("chen1",19,"dagou1");
		Dog d3=new Dog("chen2",20,"dagou2");	
		m.put(d1.getName(),d1);
		m.put(d2.getName(),d2);
		m.put(d3.getName(),d3);
		System.out.println(m);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = sc.next();
		if(m.containsKey(name)) {
			System.out.println(m.get(name));
		}else {
			System.out.println("没有这个宠物");
		}
		
		System.out.println("--宠物信息：");
		
		
		
		
		
	}
	
	public static void funstionMap() {
		//Map
		Map<String,String> map = new HashMap<>();
		map.put("PBC", "农业银行");
		map.put("ICBC", "公商银行");
		map.put("BC", "中国银行");
		map.put("CBC", "建设银行");

		//遍历
		map.keySet().iterator().forEachRemaining((a)->System.out.print(" key:"+a));
		System.out.println("\n--------------------------");
		map.values().iterator().forEachRemaining((a)->System.out.print(" values:"+a));
		System.out.println("\n--------------------------");
		
		Set<Entry<String,String>> set= map.entrySet();
		
		set.forEach(new Consumer<Entry<String,String>>() {
			public void accept(Map.Entry<String,String> t) {
			System.out.print(t+"...");
		};
		});
	}

}
