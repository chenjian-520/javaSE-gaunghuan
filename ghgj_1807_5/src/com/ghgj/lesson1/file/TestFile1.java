package com.ghgj.lesson1.file;

import java.io.File;

/*
 * File��Ĺ��췽��
 * ����������ʽ
 */
public class TestFile1 {
	public static void main(String[] args) {
		funstion();
	}
	/*
	 * File(Stirng pathname)
	 * ����·������ ����д���ļ��У� ����д��һ���ļ�
	 * c��\\abc  c:\\abc\\Demo.java
	 * ��·����װFile�����
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
