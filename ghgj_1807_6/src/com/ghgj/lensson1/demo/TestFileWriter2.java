package com.ghgj.lensson1.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		funstion();
	}
	
	//ʹ��FileWriter�ཫһ��Student.java�ĵ����Ƶ�newstudent.txt�ļ��С�
	public static void funstion() {
		try(FileReader fr = new FileReader("F:\\eclipse\\student.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("F:\\eclipse\\newstudent.txt"); 
			BufferedWriter bw = new BufferedWriter(fw);)
		{	String a ="s";
			while( (a = br.readLine()) != null) {
				bw.write(a);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}