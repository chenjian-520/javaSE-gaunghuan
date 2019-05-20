package com.ghgj.lesson4.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Clint {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1",8542);
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		Scanner in = new Scanner(is);
		PrintWriter out = new PrintWriter(os,true);
		
		
		String a ,b;
		while(true) {
			if(in.hasNextLine()) {
			 a =in.nextLine();
			System.out.println("服务器说："+a);
			}
			Scanner sc = new Scanner (System.in);
			System.out.println("客户端说：");
			b = sc.nextLine();	
			out.println(b);
			if(b.equals("q")) {
				break;
			}
			
		}
		in.close();
		out.close();
		socket.close();
	}

}
