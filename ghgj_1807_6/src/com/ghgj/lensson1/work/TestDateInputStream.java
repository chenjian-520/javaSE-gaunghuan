package com.ghgj.lensson1.work;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class TestDateInputStream {

	public static void main(String[] args) throws IOException {
		// д
		//DataOutputStream dout = new DataOutputStream(new FileOutputStream("F:\\eclipse\\b.txt"));
		File f =new File("F:\\eclipse\\b.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		DataOutputStream dout = new DataOutputStream(fos);
		int [] no = {11,22,33};
		String[] name = {"cehn","aa","dd"};
		for(int i=0;i<no.length;i++) {
			dout.writeInt(no[i]);
			dout.writeUTF(name[i]);
		}
		dout.close();
		
		FileInputStream fis =new FileInputStream(f);
		DataInputStream din = new DataInputStream(fis);
		for(int i=0;i<no.length;i++) {
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
		}
		din.close();
	}

}
