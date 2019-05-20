package com.ghgj.lesson3.work;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class ArratListDemo {
	
	
	/*
	 * 迭代器的并发修改异常 java.util.ConcurrentModificationException
	 * 就是在遍历的过程中使用了add方法改变了集合的长度 而造成的异常
	 */
	public static void funtion3() {
		List <String> list = new ArrayList<String>();
		list.add("abc0");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		//对集合使用迭代器进行获取 ，获取时候判断集合中是否存在“abc3”对象
		//如果有，添加一个“ABC3”
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			//对获取的元素str 进行判断 是不是有abc3
			if(str.equals("abc3")) {
				list.add("ABC3");
			}
			System.out.println(str);
		}
	}

	//list 集合特点
	public static void funtion2() {
		List <String> list = new ArrayList<String>();
		list.add("abc0");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// list.add(index, element); 不能越界
		// list.get() 传索引   反对象
		list.add(0, "ssg0");
		System.out.println(list);
		/*
		 * E remove(int index)
		 * 移除指定索引上的元素
		 * 返回被删除之前的元素
		 */
		
		String a=list.remove(0);
		System.out.println(a);
		System.out.println(list);
		/*
		 * E set(int index,E)
		 * 修改指定索引上的元素
		 * 返回被删除之前的元素
		 */
		String b=list.set(0,"sdg");
		System.out.println(b);
		System.out.println(list);
	}
	
	
	//泛型
	public static void funtion1() {
		 Collection<String> coll = new ArrayList<String>();
		 coll.add("skuv");
		 coll.add("yyuv");
		 coll.add("hjuu");
		 
		 
		 Iterator<String> it = coll.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 ArrayList<Integer> array = new ArrayList<Integer>();
		 HashSet<String> set = new HashSet<String>();
		 set.add("sss");
		 set.add("sgdh");
		 set.add("sinm");
		 array.add(153);
		 array.add(554);
		 array.add(855);
		 
		iterator(set);
		iterator(array);
		 
	}
	                              //泛型通配符   ？
	public static void iterator(Collection<?> args) {
		Iterator<?>  it = args.iterator();
		while(it.hasNext()) {
	    // 不能强转   错误
		//	Iterator<?> a=(Iterator<?>) it.next();
			System.out.println(it.next());
		}
	}
	
	// 集合ArrayList  和迭代器
	public static void funtion() {
		ArrayList<String> array = new ArrayList<String>();
		array.add("ssss");
		array.add("sdtg");
		array.add("sdtg");
		array.add("sdtg");
		System.out.println(array);
		array.clear();
		System.out.println(array);
		array.add("sdtg");
		array.add("sdtg");
		array.add("sdtg");
		//contains   判断集合是否包含什么对象 
		 boolean a = array.contains("sdtg");
		 System.out.println(a);
		 //toarray()  集合转数组 object类型
		 Object[] s1=array.toArray();
		   for(int i = 0;i<s1.length;i++) {
			   System.out.println(s1[i]);
		   }
		 //remove()    移除指定元素 删除成功返回true
		 
		 //迭代器
		 Iterator<String> it = array.iterator();
		 while (it.hasNext()) {
			 String st=it.next();
			 System.out.println(st);
		 }
		 //for 好处节约内存
		 for(Iterator<String> it2 = array.iterator();it2.hasNext();) {
			 System.out.println(it2.next());
		 }
		 
		 //for遍历
		 for(int i=0;i<array.size();i++) {
			 String h = array.get(i);
			 System.out.print(h);
		 }
		 //增强for遍历好 快
		 for(String y: array) {
			 System.out.print(y);
		 }
		 
	}
}
