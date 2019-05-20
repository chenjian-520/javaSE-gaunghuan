package com.ghgj.lesson7.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		funtion3();
	}
	/*
	 * 1.调用map集合方法entrySet（）将集合中的映射关系对象存到set集合中
	 *    set<entry<k，v>>
	 * 2.迭代set集合
	 * 3.获取出set集合的元素 是映射的对象
	 * 4.通过映射关系对象方法 getKey()  getValue()获取键值对
	 */
	public static void funtion3() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		map.put("d", 5);
		map.put("e", 8);
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
			
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
		
		
		
		
	}
	/*
	 * Map集合遍历 
	 * 1.调用map集合的方法keySet，所有的键存到set集合中
	 * 2.遍历set集合 获取出set集合中所有元素
	 * 3.调用map中的get 获取值
	 */
	public static void funtion2() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		map.put("d", 5);
		map.put("e", 8);
		System.out.println(map);
		
		Set<String> set =map.keySet();
		System.out.println(set.getClass());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key= it.next();
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
			
		}
		System.out.println("---------------------------");
		for(String key:map.keySet()) {
			int value = map.get(key);
			System.out.println(key+"..."+value);
		}
		
		
	}
	/*
	 * 通过键对象，获取值对象
	 * v get（k）
	 */
	public static void funtion1() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		System.out.println(map);
		
		int value = map.get("b");
		System.out.println(value);
		// remove 移除键值对  返回被移除之前的值
		int  c=map.remove("b");
		System.out.println(map);
		System.out.println(c);
	}
	
	/*
	 * 将键值对存储到集合中
	 * V put（K,V）K 作为键  V 作为值
	 * 存储的事重复键时，将原有的值覆盖
	 * 返回值一般是空
	 * 存储重复键时，返回被覆盖之前的值
	 */
	public static void funtion() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		Integer i = map.put("a", 1);
		System.out.println(i);
		Integer a = map.put("a", 3);
		System.out.println(a);
		map.put("c", 2);
		System.out.println(map);
	}
}
