package com.ghgj.lesson4.work;

import java.util.LinkedList;

/*
 * LinkedList  �����������й���
 *  �����ص㣺 ����ײ�ʵ�֣���ѯ������ɾ��
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
