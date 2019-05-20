package com.ghgj.lesson3.work;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("ddd");
		list.add("fff");
		System.out.println(list);
		//向参数 索引 添加一个元素
		list.add(1,"ffxz");
		System.out.println(list);
		//获取索引 处元素
		System.out.println(list.get(2));
		//用第二个元素  替换第一个索引处元素
		list.set(1, "chen");
		System.out.println(list);
		list.add("sss");
		System.out.println(list);
		//查看  参数元素  在集合中第一次出现的索引
		System.out.println(list.indexOf("sss"));
		//查看  参数元素  在集合中最后一次出现的索引
		System.out.println(list.lastIndexOf("sss"));
		//子集合   不包括 终止位置
		System.out.println(list.subList(2, 4));
		//排序  按照自然升序排序
		list.sort(null);
		System.out.println(list);
		//降序
		list.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
		
	}

}










