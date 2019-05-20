package com.ghgj.lesson3.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 集合遍历
 */
public class TestListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("ddd");
		list.add("fff");
		list.add("ascz");
		list.add("dgzsdf");
		//1.仅限 list 集合
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------");
		//2.增强for
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		//3.集合方法
	/*	list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});*/
	//	list.forEach(t->System.out.println(t));
		//方法引用
		list.forEach(System.out::println);
		System.out.println("-------------------------");
		//4.迭代器
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------");
		//5.Iteration  迭代方法
		Iterator it1=list.iterator();
		it1.forEachRemaining(System.out::println);
		System.out.println("-------------------------");
		//6.ListIterator  List 集合专用
		ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			li.add("hello");
		}
		System.out.println("-------------------------");
		//向上迭代
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("-------------------------");
		//7.stream()流
		list.stream().forEach(System.out::println);
		
		
	}
}








