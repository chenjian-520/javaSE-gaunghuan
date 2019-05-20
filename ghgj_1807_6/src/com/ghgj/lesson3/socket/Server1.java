package com.ghgj.lesson3.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Server3 implements Runnable {
	Socket socket;
	int name;

	public Server3(Socket socket,int name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
				System.out.println("�ͻ���"+name+"˵��" + sr);
				if (sr.equals("end")) {
					break;
				}

			}
		}

		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Server1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ������
		ServerSocket server = new ServerSocket(5278);
		int i=1;
		while (true) {
			// ���һ���ͻ�������
			Socket socket = server.accept();
			Server3 s = new Server3(socket,i);
			Thread t = new Thread(s);
			t.start();
			i++;
		}
	}

}
