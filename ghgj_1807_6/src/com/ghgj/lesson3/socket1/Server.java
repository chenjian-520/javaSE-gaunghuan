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
			String sr, sw;
			while (true) {
				// ��
				
				sr = in.nextLine();
				System.out.println("�ͻ���˵��" + sr);

				// д
				Scanner input = new Scanner(System.in);

				System.out.print("������˵��");
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
