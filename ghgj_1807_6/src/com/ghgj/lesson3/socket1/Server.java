package com.ghgj.lesson3.socket1;

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
		// 服务器
		ServerSocket server = new ServerSocket(5278);
		while (true) {
			// 获得一个客户端连接
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// 包装
			Scanner in = new Scanner(is);
			PrintWriter out = new PrintWriter(os, true);
			// 写信息
			out.println("连接服务器成功");
			String sr, sw;
			while (true) {
				// 读
				
				sr = in.nextLine();
				System.out.println("客户端说：" + sr);

				// 写
				Scanner input = new Scanner(System.in);

				System.out.print("服务器说：");
				sw = input.nextLine();
				out.println(sw);

				if (sw.equals("end")) {
					break;
				}
			}
			socket.close();
		}
	}
}
