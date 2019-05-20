package com.ghgj.lesson5.work;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\eclipse");
		System.out.println(f.exists());
		//�Ƿ���Ŀ¼
		System.out.println(f.isDirectory());
		//��ȡĿ¼�µ���Ŀ¼  ��  �ļ��ַ�����ʽ
//		String [] fs =f.list();
		String [] fs = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		});
		for(String s:fs) {
			System.out.println(s);
		}
		
		//��ȡĿ¼�µ���Ŀ¼  ��  �ļ� ��File ��ʽ
//		File [] fs1 =f.listFiles();
		File [] fs1 =f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".java");
			}
		});
			
		
		for(File ss: fs1) {
			if(ss.isDirectory()) {
				System.out.println(ss.getPath());
			}else {
				System.out.println("�ļ�"+ss.getName());
			}
		}
		
		
	}

}
