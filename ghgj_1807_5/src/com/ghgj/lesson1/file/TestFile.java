package com.ghgj.lesson1.file;

import java.io.File;

/*
 * java.io.File
 * �ļ� file
 * Ŀ¼ directory
 * ·�� path
 */
public class TestFile {

	public static void main(String[] args) {
		// File��̬��Ա����
		//��ϵͳ�йص�·���ָ���
		String separator = File.pathSeparator;
		System.out.println(separator);//��һ���ֺţ�Ŀ¼�ķָ�    Linux :
		
		//���Ʒָ���
		separator = File.separator;
		System.out.println(separator);//����  \ Ŀ¼���Ʒָ��   Linux /
	}

}
