package com.ghgj.lensson2.fanshe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class MySecurityManager extends SecurityManager{
	@Override
	public void checkRead(String file) {
		if(file.endsWith(".txt")){
			throw new SecurityException("���ܶ�ȡ�ļ�");
		}
	}
}

public class TestDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("f:/eclipse/b.txt");
//		System.setSecurityManager(new MySecurityManager()); //��ȫ������
		FileInputStream fis = new FileInputStream(f);
		int len ;
		while( (len = fis.read())!=-1) {
		System.out.print((char)len);
		}
		fis.close();
	}

}
