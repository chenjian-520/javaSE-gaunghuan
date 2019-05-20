package com.ghgj.lesson2.file;

import java.io.File;
import java.io.FileFilter;

class Accept implements FileFilter{
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		//   判断是不是文件夹
		if(pathname.isDirectory()) {
			return true;
		}
		   //      得到文件名                             转小写                                             判断最后是不是.exe
		return pathname.getName().toLowerCase().endsWith(".exe");
	}
}


public class FileTest {

	//遍历文件夹下面的.exe文件
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("f:\\dnf");
		System.out.println(file.getName());
		getAllDir(file);
	}
	public static void getAllDir(File dir) {
		 File[]  fileArr =dir.listFiles(new Accept());
		 for(File f: fileArr) {
			 //判断是不是文件夹
			 if(f.isDirectory()) {
				 getAllDir(f);
			 }else {
				 System.out.println(f);
			 }
		 }
	}

}
