package com.ghgj.lesson5.work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		funstion();
	}
	
	public static void funstion() throws IOException {
		//����
		File f = new File("f:/eclipse/m.txt");
		//false  �Ḳ��  (Ĭ��)  ׷��  true
		FileOutputStream fout = new FileOutputStream(f);
		//д
		String s = "world";
		//дһ�ֽ�
//		fout.write('a');
		fout.write(s.getBytes());
		
		fout.write(s.getBytes(),1,2); //or
		//����
		fout.close();
	}
	
	public static void funstion1() throws IOException {
		FileOutputStream fout = null;
		try {
			//����
			File f = new File("f:/eclipse/md.txt");
			//false  �Ḳ��  (Ĭ��)  ׷��  true
			fout = new FileOutputStream(f);
			String s = "worldhello";
			fout.write(s.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
	}

}
