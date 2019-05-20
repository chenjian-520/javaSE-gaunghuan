package com.ghgj.lesson3.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadRead implements Runnable{
	Socket socket = null;
	
	public ThreadRead(Socket socket) {
		this.socket = socket;
	}
	String sr ;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner in = new Scanner(is);
		while(true) {
			if(in.hasNextLine()) {
		sr = in.nextLine();
		System.out.println("�ͻ���˵��" + sr);
		if(sr.equals("end")) {
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


class ThreadWriter implements Runnable{
	Socket socket = null;
	
	public ThreadWriter(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		OutputStream os;
		PrintWriter out = null;
		try {
			os = socket.getOutputStream();
			out = new PrintWriter(os, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sw;
		out.println("���ӷ������ɹ�");
		Scanner input = new Scanner(System.in);
		while (true) {
			// д
			

//			System.out.println("������˵��");
			sw = input.nextLine();
			out.println(sw);
			if (sw.equals("end")) {
				break;
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



public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ������
		ServerSocket server = new ServerSocket(5278);
	
			// ���һ���ͻ�������
			Socket socket = server.accept();
			System.out.println("-----------������------------");	
			
			ThreadRead tr = new ThreadRead(socket);
			ThreadWriter tw = new ThreadWriter(socket);
			
			Thread t1 =new Thread(tr); 
			Thread t2 =new Thread(tw); 
			
			t1.start();
			t2.start();
			
		}
}
