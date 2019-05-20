package com.ghgj.lesson4.work;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

 class Box<E>{
	 E width;
	 E height;
	 

	
	public E getWidth() {
		return width;
	}
	public void setWidth(E width) {
		this.width = width;
	}
	public E getHeight() {
		return height;
	}
	public void setHeight(E height) {
		this.height = height;
	}
	 
}

public class HashSetDemo {
	/*
	 * set �ӿ� �ص�û���� û���ظ�Ԫ��
	 * set �ӿ�ʵ���� HashSet  
	 * �ص㣺���򼯺� �� �洢 ��ȡ��˳��ͬ û������  û���ظ�Ԫ��
	 * �����д��ArrayListһ��
	 */
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("cn");
		set.add("gh");
		set.add("sd");
		set.add("b");
		set.add("vfd");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String s: set) {
			System.out.println(s);
		}
	}
}
