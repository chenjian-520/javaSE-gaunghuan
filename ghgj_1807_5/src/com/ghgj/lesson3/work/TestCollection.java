package com.ghgj.lesson3.work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


public class TestCollection {

	public static void main(String[] args) {
		//创建一个集合
		Collection<String> c = new ArrayList<>();
		//集合是否为空  元素个数为0 就是空
		System.out.println(c.isEmpty());
		//
		c.add("sdfs");
		c.add("sdvvv");
		c.add("sdfxc");
		System.out.println(c);
//		for(String a: c) {
//			System.out.println(a);
//		}
		//集合是否为空
		System.out.println(c.isEmpty());
		//集合中元素的个数
		System.out.println(c.size());
		//
		Collection<String> c1 = new ArrayList<>();
		c1.add("ee");
		c1.add("fff");
		System.out.println(c1);
		//把参数 集合中 的所有元素添加到当前集合c中  只要当前集合发生了改变 true
		boolean bl=c.addAll(c1);
		System.out.println(c+"   ，，"+bl);
		//删除指定 元素    改变返回 true
		c.remove("ee");
		System.out.println(c);
		//删除参数集合中  所有元素   只要当前集合发生了改变  返回true
		c.removeAll(c1);
		System.out.println(c);
		c.add("aaaaaa");
		c.add("dddddd");
		System.out.println(c);
		//按照  条件  删除 
	/*	c.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()>5;
			}
		});*/
		c.removeIf((s)->s.length()>5);
		System.out.println(c);
		//是否 存在参数指定元素  存在true
		System.out.println(c.contains("sdfs"));
		//是否 存在参数集合中全部元素   存在true
		System.out.println(c.containsAll(c1));
		//把数组转换成集合
		//不能添加元素  移除元素
		List<String> list = Arrays.asList(new String[] {"sxgg","asdzx","dfsdfc","eeee"});
		System.out.println(list);
		c.addAll(list);
		System.out.println(c);
		System.out.println(c.containsAll(list));
		//集合转数组
		//Object[] obj = c.toArray();
		Object[] obj = c.toArray(new Object [10]);
		for(Object o: obj) {
			System.out.println(o);
		}
		//清空集合中元素
		c.clear();
		System.out.println(c+"..."+c.isEmpty());
		
	}

}








