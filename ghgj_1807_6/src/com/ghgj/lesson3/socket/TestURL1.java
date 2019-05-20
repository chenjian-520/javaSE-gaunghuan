package com.ghgj.lesson3.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = null;
		try{
			url = new URL("http://www.jbhua.com/uploads/allimg/180310/1-1P310200452.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(InputStream in = url.openStream();
			OutputStream out = new FileOutputStream("F:/eclipse/meinv.jpg");
			){
			int temp;
			while( (temp = in.read())!=-1 ) {
				out.write(temp);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
