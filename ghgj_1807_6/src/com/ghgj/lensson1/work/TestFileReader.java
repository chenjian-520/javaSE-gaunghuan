package com.ghgj.lensson1.work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	//×Ö·ûÁ÷
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\eclipse\\a.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		
		String s;
		while( (s= bfr.readLine() )!= null) {
			System.out.println(s);
		}
	
	/*	int temp;
		while( (temp = fr.read())!= -1 ) {
			System.out.println((char)temp);
		}*/
		
		fr.close();
	}

}
