package com.ghgj.lensson1.work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		//读
		FileReader fr = new FileReader("F:\\eclipse\\asd.txt");
		//
		int temp;
		StringBuffer sf =new StringBuffer();
		while(  (temp = fr.read()) !=-1  ) {
			sf.append((char)temp);
		}
		fr.close();
		
		//-----------------------写
		String s = sf.toString();
		s = s.replace("{name}", "花花"); //用新的替换旧的     旧     新
		s = s.replace("{type}", "加菲猫");
		s = s.replace("{master}", "陈健");
		FileWriter fw = new FileWriter("F:\\eclipse\\asd.txt");
		fw.write(s);
		fw.close();
		
	}

}
