package com.ghgj.lesson2.JavaPhasedOperation3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("F:/eclipse/a.txt");
		String []  a =new String[] {"100","101","102","103","104","105"};
		for(int i =0;i<a.length;i++) {
			fw.write(a[i]);
		}
		fw.flush();
		FileReader fr = new FileReader("F:/eclipse/a.txt");
		char [] c = new char[3];
		int a1 =0;
		StringBuffer str = new StringBuffer();
		while( (a1=fr.read(c)) !=-1) {
			System.out.print(new String(c)+ ".");
			str.insert(0, new String(c)+".");
		}
		System.out.println();
		System.out.print("·´×ªºó£º");
		System.out.println(str);
	}

}
