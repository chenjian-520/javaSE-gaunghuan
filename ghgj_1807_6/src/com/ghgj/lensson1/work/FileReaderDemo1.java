package com.ghgj.lensson1.work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		//��
		FileReader fr = new FileReader("F:\\eclipse\\asd.txt");
		//
		int temp;
		StringBuffer sf =new StringBuffer();
		while(  (temp = fr.read()) !=-1  ) {
			sf.append((char)temp);
		}
		fr.close();
		
		//-----------------------д
		String s = sf.toString();
		s = s.replace("{name}", "����"); //���µ��滻�ɵ�     ��     ��
		s = s.replace("{type}", "�ӷ�è");
		s = s.replace("{master}", "�½�");
		FileWriter fw = new FileWriter("F:\\eclipse\\asd.txt");
		fw.write(s);
		fw.close();
		
	}

}
