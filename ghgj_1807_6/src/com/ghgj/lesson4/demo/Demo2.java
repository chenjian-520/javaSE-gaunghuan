package com.ghgj.lesson4.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;


public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("F:\\DNF");
		System.out.println(f.exists());
		Demo2 d = new Demo2();
		d.getAll(f);
		
	}
	
	@SuppressWarnings("unused")
	public void getAll(File file) throws IOException{
		File [] ff = file.listFiles();
		FileWriter fw = new FileWriter("F:/eclipse/a.txt");
		if(fw == null) {
			return;
		}
		for(File f:ff) {
			if(f.isDirectory()) {
				getAll(f);
			}else {
				if(f.getName().endsWith(".npk")) {
				System.out.println(f);
				fw.write(f.toString()+"\r\n");
			  }
			}
		}
		fw.close();
		ff.clone();
	}
}
