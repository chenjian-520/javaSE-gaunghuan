package com.ghgj.lesson2.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��c:\\a.txt
 * d\\a.txt
 */
public class Copyfiel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null; 
		FileOutputStream fos=null;
		
		try {
			fis= new FileInputStream("F:\\eclipse\\a.txt");
			fos= new FileOutputStream("F:\\a.txt");
			int len = 0;
			while( (len=fis.read())!=-1 )  {
				fos.write(len);	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("�ļ�����ʧ��");
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("�رմ���");
			}finally {
				try {
					if(fis!=null) {
					fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException("�رմ���");
				} 
			}
		}
	}
}
