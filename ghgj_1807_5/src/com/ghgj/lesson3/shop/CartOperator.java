package com.ghgj.lesson3.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Predicate;

public class CartOperator {
	private ArrayList<Goods> list = new ArrayList<>();
	//添加
	public void add(Goods a) {
		list.add(a);
		System.out.println("添加成功");
	}
	//修改
	public void take(int a, int b) {
		Iterator<Goods> it=list.iterator();
		boolean flag = true;
		while(it.hasNext()) {
			Goods  chen=it.next();
			if(chen.getNumber()==a) {
				chen.setQuantity(b);
				System.out.println("修改成功");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("修改失败！");
		}
	}
	//删除
	public void remove1(int a) {
		
		for(Goods good:list) {
			if(good.getNumber()==a) {
				list.remove(good);
				break;
			}
		}
		
		
/*		ListIterator<Goods> it=list.listIterator();
		boolean flag = true;
		int  jian =0;
		while(it.hasNext()) {
			Goods chen1=it.next();
			if(chen1.getNumber()==a) {		
			  jian=it.nextIndex();
				System.out.println("删除成功");
				flag = false;
			}
		}
		list.remove(jian-1);
		if(flag) {
			System.out.println("删除失败！");
		}*/
	/*
		list.removeIf(new Predicate<Goods>() {

			@Override
			public boolean test(Goods t) {
				System.out.println("删除成功");
				return t.getNumber()==a;
			}
			
		});*/
		
//		list.removeIf((Goods s)->{
//		System.out.println("删除成功");
//		return s.getNumber()==a;
//		});
		
		
		
	}
	//查询
	public void query() {
		ListIterator<Goods> it= list.listIterator();
		while(it.hasNext()) {		 
			System.out.println(it.next());
		}
	}
}
