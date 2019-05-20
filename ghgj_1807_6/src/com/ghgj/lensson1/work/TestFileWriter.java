package com.ghgj.lensson1.work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\eclipse\\a.txt");
		String s = "string";
		fw.write(s);
		fw.close();
		funstion1();
	}
	
	//正序读出   逆序写出
		public static void funstion1() throws IOException {
			FileReader fr = new FileReader("F:\\eclipse\\a.txt");
			FileWriter fw = new FileWriter("F:\\eclipse\\chen.txt");
			int temp;
			char[] sb = new char[20];
			int i = 0;
			while(  (temp = fr.read()) != -1 ) {
				sb[i]=(char)temp;
				i++;
			}
			for(int j = sb.length-1;j>=0;j--) {
			fw.write(sb[j]);;
			}
			fr.close();
			fw.close();
		}
	
	//正序读出   逆序写出
	public static void funstion() throws IOException {
		FileReader fr = new FileReader("F:\\eclipse\\a.txt");
		FileWriter fw = new FileWriter("F:\\eclipse\\chen.txt");
		int temp;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while(  (temp = fr.read()) != -1 ) {
			sb.append((char)temp);
		}
		
		fw.write(sb.reverse().toString());
		
		fr.close();
		fw.close();
	}

}
