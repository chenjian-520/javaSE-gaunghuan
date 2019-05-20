package com.ghgj.lesson3.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClintRead implements Runnable{
	Socket socket = null;
	
	public ClintRead(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(is);
		String sr;
		while(true) {
			if(sc.hasNextLine()) {
			sr = sc.nextLine();
			System.out.println("������˵��" + sr);
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

class ClintWriter implements Runnable{
	Socket socket = null;
	
	public ClintWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = new PrintWriter(os, true);
		String sw;
		Scanner input = new Scanner(System.in);
		while (true) {
			
//			System.out.println("�ͻ���˵��");
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

public class Clint {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		// ����һ���ͻ���
		// ��������IP �˿�
		Socket socket = new Socket("127.0.1.1", 5278);
		System.out.println("-----------�ͻ���------------");		
		ClintRead tr = new ClintRead(socket);
		ClintWriter tw = new ClintWriter(socket);
		
		Thread t1 =new Thread(tr); 
		Thread t2 =new Thread(tw); 
		
		t1.start();
		t2.start();
		
	}

}
