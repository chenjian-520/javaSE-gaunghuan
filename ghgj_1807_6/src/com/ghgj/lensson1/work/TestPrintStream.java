package com.ghgj.lensson1.work;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {
		//把一个文件内容读出来  在控制台上显示
		//读
		FileInputStream fin = new FileInputStream("F:\\eclipse\\a.txt");
		byte [] b=new byte[fin.available()];
		fin.read(b);
		fin.close();
		//写控制台
		PrintStream ps = new PrintStream(System.out);
		ps.println(new String(b,"gbk"));
		ps.close();

	}

}
