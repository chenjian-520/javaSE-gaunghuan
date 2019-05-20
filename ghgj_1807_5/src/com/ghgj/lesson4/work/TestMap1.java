package com.ghgj.lesson4.work;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>  map = new HashMap<>();
		//��  ��  ֵ ��
		map.put(1, "chen");
		map.put(2, "chen2");
		map.put(3, "chen1");
		map.put(4, "jian");
		System.out.println(map);
		//��ȡ��ֵ�Ե�����
		System.out.println(map.size());
		//��ֵ�Ե�����   Ϊ0  ����true
		System.out.println(map.isEmpty());
		//�鿴ָ�� �� �ڼ������Ƿ� ����
		System.out.println(map.containsKey(1));
		//�鿴ָ�� ֵ �ڼ������Ƿ� ����
		System.out.println(map.containsValue("chen2"));
		//���ݼ�  ָ��ɾ��
		map.remove(2);
		System.out.println(map);
		//��ȡ���ļ���
		Set<Integer> set=map.keySet();
		System.out.println(set);
		//��ȡֵ�ļ���
		Collection<String> c=map.values();
		System.out.println(c);
		//���
	//	map.clear();
	//	System.out.println(map.isEmpty());
		map.put(null, null);
		System.out.println(map);
		//����Ψһ  ֵ�����ظ�
		map.put(1, "cdsd");
		map.put(8, "chen");
		System.out.println(map);
		System.out.println("-------------------------");
		
//		map.forEach(new BiConsumer<Integer, String>() {
//			public void accept(Integer t, String u) {
//				System.out.println(t+".."+u);
//			};
//		});
		map.forEach((a,b)->System.out.println(a+".."+b));
		System.out.println("-------------------------");
		//�ֿ�����
		map.keySet().iterator().forEachRemaining(System.out::println);
		map.values().iterator().forEachRemaining(System.out::println);;
		System.out.println("-------------------------");
		//3.��ü�ֵ�Լ���
		Set<Entry<Integer,String>> set2 =map.entrySet();
		//�����  ֵ  ��
		set2.forEach(e->System.out.println(e));
		//set2.forEach(e->System.out.println(e.getKey()+".."+e.getValue()));
		System.out.println("-------------------------");
		// ���� ��  
		Set<Entry<Integer,String>> set1 =map.entrySet();
		Iterator<Entry<Integer,String>> it = set1.iterator();
		it.forEachRemaining(new Consumer<Entry<Integer,String>>() {
			@Override
			public void accept(Entry<Integer, String> t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		//it.forEachRemaining(System.out::println);
		System.out.println("-------------------------");
	}

}
