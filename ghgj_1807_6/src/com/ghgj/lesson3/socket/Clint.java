package com.ghgj.lesson3.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Clint {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//����һ���ͻ���   
		//						��������IP  �˿�
		Socket socket = new Socket("127.0.1.1",5278);
		//��
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		//��װ
		Scanner sc = new Scanner(is);
		//   true  ˢ�»�����
		PrintWriter out = new PrintWriter(os,true);
		//��
		String sr,sw;
		while(true) {
			sr = sc.nextLine();
			System.out.println("������˵��"+sr);
			if(sr.equals("end")) {
				break;
			}
			
		}
		
		//д
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("�ͻ���˵��");
			sw = input.nextLine();
			out.println(sw);
			if(sw.equals("end")){
				break;
			}
		
		}
		socket.close();
		
		
	}

}
