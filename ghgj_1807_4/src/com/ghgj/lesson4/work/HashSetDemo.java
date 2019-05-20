package com.ghgj.lesson4.work;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

 class Box<E>{
	 E width;
	 E height;
	 

	
	public E getWidth() {
		return width;
	}
	public void setWidth(E width) {
		this.width = width;
	}
	public E getHeight() {
		return height;
	}
	public void setHeight(E height) {
		this.height = height;
	}
	 
}

public class HashSetDemo {
	/*
	 * set 接口 特点没索引 没有重复元素
	 * set 接口实现类 HashSet  
	 * 特点：无序集合 ， 存储 和取出顺序不同 没有索引  没有重复元素
	 * 代码编写和ArrayList一致
	 */
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("cn");
		set.add("gh");
		set.add("sd");
		set.add("b");
		set.add("vfd");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String s: set) {
			System.out.println(s);
		}
	}
}
