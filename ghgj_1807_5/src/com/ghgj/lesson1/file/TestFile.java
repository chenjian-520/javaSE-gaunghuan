package com.ghgj.lesson1.file;

import java.io.File;

/*
 * java.io.File
 * 文件 file
 * 目录 directory
 * 路径 path
 */
public class TestFile {

	public static void main(String[] args) {
		// File静态成员变量
		//与系统有关的路径分隔符
		String separator = File.pathSeparator;
		System.out.println(separator);//是一个分号，目录的分割    Linux :
		
		//名称分隔符
		separator = File.separator;
		System.out.println(separator);//向右  \ 目录名称分割符   Linux /
	}

}
