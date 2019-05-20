package com.ghgj.lesson2.JavaPhasedOperation3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("F:/eclipse/hello.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
	//	InputStreamReader ir = new InputStreamReader(fis);
		byte[] b = new byte[2];
		int a;
		while((a=bis.read(b))!=-1) {
			System.out.print(new String(b));
		}
	}
}
