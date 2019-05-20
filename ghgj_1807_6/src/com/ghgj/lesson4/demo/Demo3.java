package com.ghgj.lesson4.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("f:/eclipse/a.txt");
		Map<String,String> map = new HashMap<>();
		FileReader fr =new FileReader(f);
		BufferedReader in = new BufferedReader(fr);
		String s ;
		File f1 ; 
		while( (s=in.readLine()) !=null ){
			f1 =new File(s);
			map.put( f1.getName(),f1.getParent());
		}
		System.out.println(map);
	}
}
