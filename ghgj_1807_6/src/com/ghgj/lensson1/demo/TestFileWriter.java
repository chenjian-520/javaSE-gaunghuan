package com.ghgj.lensson1.demo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileWriter {

	public static void main(String[] args) throws Exception{
		
		funstion2();
	}
	public static void funstion2() throws Exception {
		FileWriter fw = new FileWriter("F:\\eclipse\\hello.txt");
		System.out.println("������Ҫд���ļ����ַ���");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		fw.write(st);
		fw.close();
		sc.close();
	}
	
	
	//�ӿ���̨����һ���ַ�����д��Hello.txt�ļ��С�
	public static void funstion1() throws Exception {
		FileWriter fw = new FileWriter("F:\\eclipse\\hello.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("������Ҫд���ļ����ַ���");
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String st;
		while((st = bfr.readLine().toString())!=null) {
			pw.println(st);
			if(st.equals("q")) {
				break;
			}
		}
//		pw.println(bfr.readLine().toString());
		pw.close();
		bfr.close();
	}
	
	
	//ʹ��FileWriter   �� �ַ������ú�ѧϰJava��д�� д���ݵ�  haha.txt �С�
	public static void funstion() throws Exception {
		FileWriter fw = new FileWriter("F:\\eclipse\\haha.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		char [] a="�ú�ѧϰjava".toCharArray();
		bw.write(a, 0, a.length);
		bw.close();
	}
}
