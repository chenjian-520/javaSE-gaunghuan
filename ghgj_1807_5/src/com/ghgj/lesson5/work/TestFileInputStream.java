package com.ghgj.lesson5.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileInputStream {
	public static void main(String[] args) throws IOException {

		funstion1();
	}
	
	public static void funstion3() throws IOException {
		
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fin = new FileInputStream(f);
		
		//��
	/*	int temp;
		while((temp = fin.read()) != -1) {
			System.out.print((char)temp);
		}  */
	//	byte [] b = new byte[(int)f.length()];
		byte [] b = new byte[fin.available()];
	//	fin.read(b);
		//�ֽ����飬�ֽ��������ʼλ�ã��漸��
		fin.read(b,1,2);
		String s = new String(b,"gbk");
		System.out.println(s);
		
		//����
		fin.close();
		
	}
	
	
	
	public static void funstion2() throws IOException {
	
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fin = new FileInputStream(f);
		InputStreamReader ir = new InputStreamReader(fin);
		//��
		int temp;
		while((temp = ir.read()) != -1) {
			System.out.print((char)temp);
		}
		//����
		ir.close();
		
	}
	
	public static void funstion1() throws IOException {
		//����������
		//1
//		FileInputStream fis = new FileInputStream("f:/eclipse/a.txt");
		//2
		File f = new File("f:/eclipse/a.txt");
		FileInputStream fis = new FileInputStream(f);
		//��
		int temp;
		while((temp = fis.read()) != -1) {
			System.out.print((char)temp);
		}
	
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println(fis.read());  //-1
		
		
		//����
		fis.close();
	}
	
}
