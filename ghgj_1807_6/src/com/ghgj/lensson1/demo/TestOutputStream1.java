package com.ghgj.lensson1.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo2();
	}
	
	public static void demo2(){
		try(			
			FileInputStream fis = new FileInputStream("F:\\eclipse\\aaa.mp3");
			FileOutputStream fos = new FileOutputStream("F:\\eclipse\\new.mp3");
			BufferedInputStream bin = new BufferedInputStream(fis);
			BufferedOutputStream bout = new BufferedOutputStream(fos);)
		{
			int temp =0;
			while( (temp=bin.read()) != -1 ){
				bout.write(temp);
			}
			bout.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void demo1()throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\eclipse\\word.txt");
		fos.write("helloword".getBytes(), 5, 4);
		fos.close();
	}
}
