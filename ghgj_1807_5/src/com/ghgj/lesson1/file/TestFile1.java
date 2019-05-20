package com.ghgj.lesson1.file;

import java.io.File;

/*
 * File类的构造方法
 * 三种重载形式
 */
public class TestFile1 {
	public static void main(String[] args) {
		funstion();
	}
	/*
	 * File(Stirng pathname)
	 * 传递路径名： 可以写到文件夹， 可以写到一个文件
	 * c：\\abc  c:\\abc\\Demo.java
	 * 将路径封装File类对象
	 */
	public static void funstion() {
		//1
		File file = new File("d:\\eclipse");
		System.out.println(file);
		//2
		File file1 = new File("d","eclipse");
		System.out.println(file);
		//3 File (File parent ,String child)
		File file2 = new File("d");
		File file3 = new File(file2,"eclipse");
		
	}
}
