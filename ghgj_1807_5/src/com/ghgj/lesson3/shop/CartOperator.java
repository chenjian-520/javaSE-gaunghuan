package com.ghgj.lesson3.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Predicate;

public class CartOperator {
	private ArrayList<Goods> list = new ArrayList<>();
	//���
	public void add(Goods a) {
		list.add(a);
		System.out.println("��ӳɹ�");
	}
	//�޸�
	public void take(int a, int b) {
		Iterator<Goods> it=list.iterator();
		boolean flag = true;
		while(it.hasNext()) {
			Goods  chen=it.next();
			if(chen.getNumber()==a) {
				chen.setQuantity(b);
				System.out.println("�޸ĳɹ�");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}
	//ɾ��
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
				System.out.println("ɾ���ɹ�");
				flag = false;
			}
		}
		list.remove(jian-1);
		if(flag) {
			System.out.println("ɾ��ʧ�ܣ�");
		}*/
	/*
		list.removeIf(new Predicate<Goods>() {

			@Override
			public boolean test(Goods t) {
				System.out.println("ɾ���ɹ�");
				return t.getNumber()==a;
			}
			
		});*/
		
//		list.removeIf((Goods s)->{
//		System.out.println("ɾ���ɹ�");
//		return s.getNumber()==a;
//		});
		
		
		
	}
	//��ѯ
	public void query() {
		ListIterator<Goods> it= list.listIterator();
		while(it.hasNext()) {		 
			System.out.println(it.next());
		}
	}
}
