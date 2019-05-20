package com.ghgj.lesson2.file;

import java.io.File;
import java.io.FileFilter;

class Accept implements FileFilter{
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		//   �ж��ǲ����ļ���
		if(pathname.isDirectory()) {
			return true;
		}
		   //      �õ��ļ���                             תСд                                             �ж�����ǲ���.exe
		return pathname.getName().toLowerCase().endsWith(".exe");
	}
}


public class FileTest {

	//�����ļ��������.exe�ļ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("f:\\dnf");
		System.out.println(file.getName());
		getAllDir(file);
	}
	public static void getAllDir(File dir) {
		 File[]  fileArr =dir.listFiles(new Accept());
		 for(File f: fileArr) {
			 //�ж��ǲ����ļ���
			 if(f.isDirectory()) {
				 getAllDir(f);
			 }else {
				 System.out.println(f);
			 }
		 }
	}

}
