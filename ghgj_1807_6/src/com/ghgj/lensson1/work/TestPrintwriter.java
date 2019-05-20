package com.ghgj.lensson1.work;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestPrintwriter {

	public static void main(String[] args) throws FileNotFoundException {

		funstion1();
	}
	
	public static void funstion() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("F:\\eclipse\\jj.txt");
		
		for(int i=0;i<=5;i++) {
			pw.println("第"+i+"个数字");
		}
		 
		pw.close();
	}
	
	public static void funstion1() throws FileNotFoundException {
		//自动资源释放
		try(PrintWriter pw = new PrintWriter("F:\\eclipse\\jj.txt");
			Scanner sc =new Scanner(System.in);) {
			
			System.out.println("请输入姓名");
			while(true) {
				String s =sc.nextLine();
				if(s.equals("q")) {
					break;
				}
				pw.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

}
