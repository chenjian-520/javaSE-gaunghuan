package com.ghgj.lesson4.work;

public class StringBufferApi {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer(100);//默认16个长度
		System.out.println(buff);
		System.out.println(buff.capacity());
		buff.append("sssssssssdvsdgsdggs");
		System.out.println(buff.capacity());
		buff.trimToSize();
		System.out.println(buff.capacity());
		System.out.println(buff);
		buff.append("chen");
		System.out.println(buff);
		buff.insert(2, "bbb");
		System.out.println(buff);
		buff.setCharAt(0, 'd');
		System.out.println(buff);
		buff.delete(0, 1);
		System.out.println(buff);
		int a =buff.indexOf("s");
		System.out.println(a);
		int b =buff.lastIndexOf("s");
		System.out.println(b);
	}
}
