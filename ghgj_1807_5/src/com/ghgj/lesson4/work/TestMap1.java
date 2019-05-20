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
		//存  键  值 对
		map.put(1, "chen");
		map.put(2, "chen2");
		map.put(3, "chen1");
		map.put(4, "jian");
		System.out.println(map);
		//获取键值对的数量
		System.out.println(map.size());
		//键值对的数量   为0  返回true
		System.out.println(map.isEmpty());
		//查看指定 键 在集合中是否 存在
		System.out.println(map.containsKey(1));
		//查看指定 值 在集合中是否 存在
		System.out.println(map.containsValue("chen2"));
		//根据键  指定删除
		map.remove(2);
		System.out.println(map);
		//获取键的集合
		Set<Integer> set=map.keySet();
		System.out.println(set);
		//获取值的集合
		Collection<String> c=map.values();
		System.out.println(c);
		//清除
	//	map.clear();
	//	System.out.println(map.isEmpty());
		map.put(null, null);
		System.out.println(map);
		//键是唯一  值可以重复
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
		//分开迭代
		map.keySet().iterator().forEachRemaining(System.out::println);
		map.values().iterator().forEachRemaining(System.out::println);;
		System.out.println("-------------------------");
		//3.获得键值对集合
		Set<Entry<Integer,String>> set2 =map.entrySet();
		//输出键  值  对
		set2.forEach(e->System.out.println(e));
		//set2.forEach(e->System.out.println(e.getKey()+".."+e.getValue()));
		System.out.println("-------------------------");
		// 迭代 器  
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
