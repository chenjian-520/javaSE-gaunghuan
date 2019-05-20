package com.ghgj.lesson5.work;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File file1 = new File("f:\\eclipse");
		File file = new File("f:/eclipse","a.txt");
		File file2 = new File (file1,"b.txt");
		//文件  路径  是否  存在 true
		System.out.println(file.exists());
		//新建一个文件
		file.createNewFile();
		System.out.println(file.exists());
		//获得文件名称
		System.out.println(file2.getName());
		//获得路径
		//如果是绝对路径显示绝对，如果是相对路径显示相对路径
		System.out.println(file.getPath());
		//只显示绝对路径
		System.out.println(file.getAbsolutePath());
		//父路径
		System.out.println(file2.getParent());
		//文件是否可读   可写
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//是否是文件
		System.out.println(file.isFile());
		//文件最后一次修改的时间
		System.out.println(file.lastModified());
		long ms =file.lastModified();
		Date date = new Date(ms);
		//文件大小
		System.out.println(file.length());
		//删除
	//	file.delete();
		System.out.println(file.exists());
		
		
		
	}

}
