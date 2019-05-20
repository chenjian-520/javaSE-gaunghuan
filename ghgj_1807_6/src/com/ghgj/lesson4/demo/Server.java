package com.ghgj.lesson4.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8542);
		
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		Scanner in = new Scanner(is);
		PrintWriter out = new PrintWriter(os,true);
		out.println("服务器连接成功");
		String a ,b;
		while(true) {
			if(in.hasNextLine()) {
			 a =in.nextLine();
			System.out.println("客户端说："+a);
			}
			Scanner sc = new Scanner (System.in);
			b = sc.nextLine();
			System.out.println("服务器说：");
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
