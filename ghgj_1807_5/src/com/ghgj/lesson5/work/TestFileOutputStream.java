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
		//创建
		File f = new File("f:/eclipse/m.txt");
		//false  会覆盖  (默认)  追加  true
		FileOutputStream fout = new FileOutputStream(f);
		//写
		String s = "world";
		//写一字节
//		fout.write('a');
		fout.write(s.getBytes());
		
		fout.write(s.getBytes(),1,2); //or
		//关流
		fout.close();
	}
	
	public static void funstion1() throws IOException {
		FileOutputStream fout = null;
		try {
			//创建
			File f = new File("f:/eclipse/md.txt");
			//false  会覆盖  (默认)  追加  true
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
