package com.ghgj.lesson7.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollevtionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funstion3();
		
	}
	//集合嵌套
	/*
	 * 传智播客
	 *  java 基础班
	 *    001 张三
	 *    002 李四
	 *  java 就业办
	 *    001 王五
	 *    002 赵六
	 */
	public static void funstion3() {
		HashMap<String,String> javase = new HashMap<String,String>();
		HashMap<String,String> javaee = new HashMap<String,String>();
		javase.put("001", "张三");
		javase.put("002", "李四");
		
		javase.put("001", "王五");
		javase.put("002", "赵六");
		HashMap<String , HashMap<String,String>> ghgj =new HashMap<String , HashMap<String,String>>();
		ghgj.put("java 基础班", javase);
		ghgj.put("java 就业办", javase);
		keySet(ghgj);
		entryset(ghgj);
		
	}
	//嵌套Map集合遍历
	public static void keySet(HashMap<String , HashMap<String,String>> ghgj) {
		Set<String> set =ghgj.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			HashMap<String,String> hmap=ghgj.get(key);
			
			Set<String> set1 =hmap.keySet();
			Iterator<String> it1 = set1.iterator();
			while(it1.hasNext()) {
				String key1 = it1.next();
				String hmap1=hmap.get(key1);
				System.out.println(key+"..."+key1+"..."+hmap1);
			}
		}
	}
	//嵌套Map集合遍历
	public static void entryset(HashMap<String , HashMap<String,String>> ghgj) {
		Set<Map.Entry<String,HashMap<String,String>>> 
					classNameSet=ghgj.entrySet();
		Iterator<Map.Entry<String,HashMap<String,String>>> 
						it = classNameSet.iterator();
		while(it.hasNext()) {
			Map.Entry<String,HashMap<String,String>>  
						classNameEntry = it.next();
			String key = classNameEntry.getKey();
			HashMap<String , String> classMap = classNameEntry.getValue();
			Set<Map.Entry<String, String>> set = classMap.entrySet();
			Iterator<Map.Entry<String, String>> it1 = set.iterator();
			while(it1.hasNext()) {
				Map.Entry<String, String> Entry=it1.next();
				String numkey = Entry.getKey();
				String numvalue = Entry.getValue();
				System.out.println(key+"..."+ numkey+"..."+numvalue);
			}
		}
	}
	
	//Collections 工具类 shuffle 随机排列
	public static void funstion2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	//Collections 工具类 binarySearch 二分搜索 方法参数 传递list集合 传递被查找的元素
	//返回查找元素下标      传入集合要顺序排列的    没有找到的元素 返回插入位置    负的下标减一
	public static void funstion1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println(list);
		int a = Collections.binarySearch(list, 5);
		System.out.println(a);
	}
	
	//Collections 工具类 sort 顺序排列
	public static void funstion() {
		List<String> list = new ArrayList<String>();
		list.add("asasd");
		list.add("sasd");
		list.add("5sd");
		list.add("4sd");
		list.add("8asd");
		list.add("9sasd");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
