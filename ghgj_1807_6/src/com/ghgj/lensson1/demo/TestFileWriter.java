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
		System.out.println("输入你要写入文件的字符串");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		fw.write(st);
		fw.close();
		sc.close();
	}
	
	
	//从控制台输入一行字符串，写入Hello.txt文件中。
	public static void funstion1() throws Exception {
		FileWriter fw = new FileWriter("F:\\eclipse\\hello.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("输入你要写入文件的字符串");
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
	
	
	//使用FileWriter   将 字符串”好好学习Java”写入 写数据到  haha.txt 中。
	public static void funstion() throws Exception {
		FileWriter fw = new FileWriter("F:\\eclipse\\haha.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		char [] a="好好学习java".toCharArray();
		bw.write(a, 0, a.length);
		bw.close();
	}
}
