package com.ghgj.lensson1.demo;

import java.io.IOException;
import java.io.PrintWriter;

public class TestPritWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("F:/eclipse/a.txt");
		pw.println("����1\r\n����2\r\n����3\r\n����4\r\n����5\r\n����6\r\n");
		pw.close();
	}

}