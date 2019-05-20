package com.ghgj.lesson2.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null; 
		FileOutputStream fos=null;
		
		try {
			fis= new FileInputStream("F:\\eclipse\\a.txt");
			fos= new FileOutputStream("F:\\a.txt");
			int len = 0;
			byte [] bytes = new byte[1024];
			while( (len=fis.read(bytes))!=-1 )  {
				fos.write(bytes,0,len);	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("ÎÄ¼þ¸´ÖÆÊ§°Ü");
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				 		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("¹Ø±Õ´íÎó");
			}finally {
				try {
					if(fis!=null) {
					fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException("¹Ø±Õ´íÎó");
				} 
			}
		}
	}

}
