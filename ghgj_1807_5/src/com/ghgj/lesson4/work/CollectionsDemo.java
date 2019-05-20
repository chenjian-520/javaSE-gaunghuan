package com.ghgj.lesson4.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "张三","李四","王五","王五","李四");
		System.out.println(list);
		Collections.sort(list);
	/*	String name="ss";
		
		for(String s : list) {
			int a =Collections.frequency(list, s);
			if(a>1&& (!(name.equals(s))) ) {
				System.out.println(s+"..."+a);
				name =s;
			}
		}
		*/
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		for(String d: set) {
			int a =Collections.frequency(list, d);
			if(Collections.frequency(list, d)>1) {
				System.out.println(d+"..."+a);
			}
		}
		
		
	
	}

}
