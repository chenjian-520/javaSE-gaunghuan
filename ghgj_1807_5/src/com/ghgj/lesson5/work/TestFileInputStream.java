package com.ghgj.lesson5.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileInputStream {
	public static void main(String[] args) throws IOException {

		funstion1();
	}
	
	public static void funstion3() throws IOException {
		
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fin = new FileInputStream(f);
		
		//读
	/*	int temp;
		while((temp = fin.read()) != -1) {
			System.out.print((char)temp);
		}  */
	//	byte [] b = new byte[(int)f.length()];
		byte [] b = new byte[fin.available()];
	//	fin.read(b);
		//字节数组，字节数组的起始位置，存几个
		fin.read(b,1,2);
		String s = new String(b,"gbk");
		System.out.println(s);
		
		//关流
		fin.close();
		
	}
	
	
	
	public static void funstion2() throws IOException {
	
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fin = new FileInputStream(f);
		InputStreamReader ir = new InputStreamReader(fin);
		//读
		int temp;
		while((temp = ir.read()) != -1) {
			System.out.print((char)temp);
		}
		//关流
		ir.close();
		
	}
	
	public static void funstion1() throws IOException {
		//创建流对象
		//1
//		FileInputStream fis = new FileInputStream("f:/eclipse/a.txt");
		//2
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fis = new FileInputStream(f);
		//读
		int temp;
		while((temp = fis.read()) != -1) {
			System.out.print((char)temp);
		}
	
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println(fis.read());  //-1
		
		
		//关流
		fis.close();
	}
	
}
