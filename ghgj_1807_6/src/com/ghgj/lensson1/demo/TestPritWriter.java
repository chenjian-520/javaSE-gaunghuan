package com.ghgj.lensson1.demo;

import java.io.IOException;
import java.io.PrintWriter;

public class TestPritWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("F:/eclipse/a.txt");
		pw.println("星期1\r\n星期2\r\n星期3\r\n星期4\r\n星期5\r\n星期6\r\n");
		pw.close();
	}

}
