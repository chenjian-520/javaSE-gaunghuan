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
		// ������
		ServerSocket server = new ServerSocket(5278);
		while (true) {
			// ���һ���ͻ�������
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// ��װ
			Scanner in = new Scanner(is);
			PrintWriter out = new PrintWriter(os, true);
			// д��Ϣ
			out.println("���ӷ������ɹ�");
			out.println("end");

			// ��
			String sr;
			while (true) {
				if (in.hasNextLine()) {
					sr = in.nextLine();
					System.out.println("�ͻ���˵��" + sr);
					if (sr.equals("end")) {
						break;
					}

				}
			}

			socket.close();
		}
	}

}
