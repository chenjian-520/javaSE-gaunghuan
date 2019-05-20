package com.ghgj.lesson3.socket1;

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
		// 创建一个客户端
		// 服务器的IP 端口
		Socket socket = new Socket("127.0.1.1", 5278);
		// 流
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		// 包装
		Scanner sc = new Scanner(is);
		// true 刷新缓冲区
		PrintWriter out = new PrintWriter(os, true);
		
		String sr, sw;
		while (true) {
			// 读
			sr = sc.nextLine();
			System.out.println("服务器说：" + sr);

			// 写
			Scanner input = new Scanner(System.in);

			System.out.print("客户端说：");
			sw = input.nextLine();
			out.println(sw);

			if (sw.equals("end")) {
				break;
			}
		}
		socket.close();

	}

}
