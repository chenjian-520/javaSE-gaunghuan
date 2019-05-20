package com.ghgj.lesson4.work;

import java.util.LinkedList;

/*
 * LinkedList  链表几个的特有功能
 *  自身特点： 链表底层实现，查询慢，增删块
 * 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		funtion();
		
	}
	
	public static void funtion() {
		LinkedList<String>  link = new LinkedList<String>();
		link.add("heima");
		link.addLast("sss");
		link.add("dgv");
		link.addFirst("dcg");
		System.out.println(link);
		System.out.println(link.isEmpty());
		System.out.println(link.removeFirst());
		System.out.println(link);
		
	}
}
