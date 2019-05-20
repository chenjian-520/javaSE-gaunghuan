package com.ghgj.lesson5.work;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File file1 = new File("f:\\eclipse");
		File file = new File("f:/eclipse","a.txt");
		File file2 = new File (file1,"b.txt");
		//�ļ�  ·��  �Ƿ�  ���� true
		System.out.println(file.exists());
		//�½�һ���ļ�
		file.createNewFile();
		System.out.println(file.exists());
		//����ļ�����
		System.out.println(file2.getName());
		//���·��
		//����Ǿ���·����ʾ���ԣ���������·����ʾ���·��
		System.out.println(file.getPath());
		//ֻ��ʾ����·��
		System.out.println(file.getAbsolutePath());
		//��·��
		System.out.println(file2.getParent());
		//�ļ��Ƿ�ɶ�   ��д
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//�Ƿ����ļ�
		System.out.println(file.isFile());
		//�ļ����һ���޸ĵ�ʱ��
		System.out.println(file.lastModified());
		long ms =file.lastModified();
		Date date = new Date(ms);
		//�ļ���С
		System.out.println(file.length());
		//ɾ��
	//	file.delete();
		System.out.println(file.exists());
		
		
		
	}

}
