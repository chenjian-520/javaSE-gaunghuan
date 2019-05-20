package com.ghgj.lesson3.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
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
			out.println("end");

			// 读
			String sr;
			while (true) {
				if (in.hasNextLine()) {
					sr = in.nextLine();
					System.out.println("客户端说：" + sr);
					if (sr.equals("end")) {
						break;
					}

				}
			}

			socket.close();
		}
	}

}
