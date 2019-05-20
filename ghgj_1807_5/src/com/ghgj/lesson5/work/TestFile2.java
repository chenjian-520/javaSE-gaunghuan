package com.ghgj.lesson5.work;

import java.io.File;

public class TestFile2 {

	public static void main(String[] args) {
		File f = new File("f:/eclipse/chen");
		System.out.println(f.exists());
		//不会创建父路径
		f.mkdir();
		
		File f1 = new File("f:/eclipse/jian");
		System.out.println(f1.exists());
		//可以创建不存在的路径
		f1.mkdirs();
		File f2 = new File("f:/dnf");
		bianli(f2);
	}
	
	
	public static void bianli(File f ) {
		File [] fs = f.listFiles();
		for(File aa: fs) {
			if(aa.isDirectory()) {
				bianli(aa);
			}else {
				System.out.println(aa);
			}
		}
	}

}
