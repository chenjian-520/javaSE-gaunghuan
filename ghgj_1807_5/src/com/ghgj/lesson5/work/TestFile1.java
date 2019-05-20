package com.ghgj.lesson5.work;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\eclipse");
		System.out.println(f.exists());
		//是否是目录
		System.out.println(f.isDirectory());
		//获取目录下的子目录  和  文件字符串形式
//		String [] fs =f.list();
		String [] fs = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		});
		for(String s:fs) {
			System.out.println(s);
		}
		
		//获取目录下的子目录  和  文件 的File 形式
//		File [] fs1 =f.listFiles();
		File [] fs1 =f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".java");
			}
		});
			
		
		for(File ss: fs1) {
			if(ss.isDirectory()) {
				System.out.println(ss.getPath());
			}else {
				System.out.println("文件"+ss.getName());
			}
		}
		
		
	}

}
