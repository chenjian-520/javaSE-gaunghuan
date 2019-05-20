package com.ghgj.lesson3.work;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("F:/eclipse/a.txt");
		for(int i = 1;i<=100;i++) {
			String s=Integer.toString(i);
			fw.write(s);
		}
		fw.close();
	}	

}
