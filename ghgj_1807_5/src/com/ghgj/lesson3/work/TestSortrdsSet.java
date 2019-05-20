package com.ghgj.lesson3.work;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortrdsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set = new TreeSet<>((n1,n2)->n2-n1);
		set.add(21);
		set.add(15414);
		set.add(312);
		set.add(231);
		System.out.println(set);
		set.forEach(System.out::println);
		System.out.println(set.first());
		System.out.println(set.last());
		//�Ӽ�
		//��ʼ   ��ֹ
		System.out.println(set.subSet(321, 21));
		
		navigableSet();
	}
	
	public static void navigableSet() {
		NavigableSet<Double>  set = new TreeSet();
		set.add(3254.3);
		set.add(541.43);
		set.add(32.85);
		set.add(84.15);
		System.out.println(set);
		//С�ڵ��� ָ�����������Ԫ��
		System.out.println(set.floor(600.0));
		//���ڵ��� ָ����������СԪ��
		System.out.println(set.ceiling(70.0));
		//����ĵ���
		set.descendingIterator().forEachRemaining(System.out::println);
		//���򼯺�
		System.out.println("--------------------");
	    set.descendingSet().forEach(System.out::println);
		System.out.println(set);
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
	}

}
