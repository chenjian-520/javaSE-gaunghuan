package com.ghgj.lesson2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * 字节输出流
 *   java.io.OutputStream 所以字节流的超类
 *   作用： 从java中写出文件
 *   字节
 *   可以写任意文件
 *   
 * 	 write(int b)
 *   write(byte[] b)
 *   write(byte[] b ,int,int)  int 开始索引  int 长度  
 * 	 close()关闭流对象 释放流相关资源
 * 
 *   流对象使用步骤
 *   1.创建流子类对象绑定数据目的
 *   2.调用对象方法write写
 *   3.close释放资源
 *   
 */


public class OutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		output();
		fileinput();
	}
	//子类 FileOutputStream
	public static void fileOut() throws  IOException{
		FileOutputStream fos = new FileOutputStream("F:\\eclipse\\a.txt");
		//流对象方法write写数据  1个字节
		fos.write(49);//d
		fos.write(48);
		fos.write(48);
		//写字节数组
		byte [] bytes = {65,66,67,68};
		fos.write(bytes);
		fos.write(bytes, 1, 2);
		//写入字节数组的简便方式
		//写字符串
		fos.write("hello".getBytes());
		
		//关闭资源
		fos.close();
	}
	//子类 FileInputStream
	public static void fileinput() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\eclipse\\a.txt");
		byte[] b = new byte[1024];
		int len =0;
		while( (len=fis.read(b))!=-1 ) {
			System.out.print(new String(b,0,len));
		}
		fis.close();
		
	/*	int len =fis.read(b);
		System.out.println(new String(b));
		System.out.println(len);
		len =fis.read(b);
		System.out.println(new String(b));
		System.out.println(len);
		len =fis.read(b);
		System.out.println(new String(b));
		System.out.println(len);*/		
	}
	
	/*
	 *  FileOutputStream文件的续写和换行
	 *   FileOutputStream构造方法中 的第二个参数中加true
	 */
	public static void output() throws IOException {
		  File file =new File("F:\\eclipse\\a.txt");
		  FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file,true);
			  fos.write("hello".getBytes());
			  fos.write("\r\nworld".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("文件写入失败");
		}finally {
		  try {
			  if(fos!=null) {
			fos.close();
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			throw new RuntimeException("关闭资源失败");
		}
		  }
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

