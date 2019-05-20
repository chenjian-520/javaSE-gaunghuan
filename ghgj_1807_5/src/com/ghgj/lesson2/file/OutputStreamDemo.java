package com.ghgj.lesson2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * �ֽ������
 *   java.io.OutputStream �����ֽ����ĳ���
 *   ���ã� ��java��д���ļ�
 *   �ֽ�
 *   ����д�����ļ�
 *   
 * 	 write(int b)
 *   write(byte[] b)
 *   write(byte[] b ,int,int)  int ��ʼ����  int ����  
 * 	 close()�ر������� �ͷ��������Դ
 * 
 *   ������ʹ�ò���
 *   1.������������������Ŀ��
 *   2.���ö��󷽷�writeд
 *   3.close�ͷ���Դ
 *   
 */


public class OutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		output();
		fileinput();
	}
	//���� FileOutputStream
	public static void fileOut() throws  IOException{
		FileOutputStream fos = new FileOutputStream("F:\\eclipse\\a.txt");
		//�����󷽷�writeд����  1���ֽ�
		fos.write(49);//d
		fos.write(48);
		fos.write(48);
		//д�ֽ�����
		byte [] bytes = {65,66,67,68};
		fos.write(bytes);
		fos.write(bytes, 1, 2);
		//д���ֽ�����ļ�㷽ʽ
		//д�ַ���
		fos.write("hello".getBytes());
		
		//�ر���Դ
		fos.close();
	}
	//���� FileInputStream
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
	 *  FileOutputStream�ļ�����д�ͻ���
	 *   FileOutputStream���췽���� �ĵڶ��������м�true
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
			throw new RuntimeException("�ļ�д��ʧ��");
		}finally {
		  try {
			  if(fos!=null) {
			fos.close();
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			throw new RuntimeException("�ر���Դʧ��");
		}
		  }
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
