package com.ghgj.lensson1.work;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {
		//��һ���ļ����ݶ�����  �ڿ���̨����ʾ
		//��
		FileInputStream fin = new FileInputStream("F:\\eclipse\\a.txt");
		byte [] b=new byte[fin.available()];
		fin.read(b);
		fin.close();
		//д����̨
		PrintStream ps = new PrintStream(System.out);
		ps.println(new String(b,"gbk"));
		ps.close();

	}

}
