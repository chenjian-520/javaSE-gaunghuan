package com.ghgj.lensson2.fanshe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//类加载的  自定义加载器


class Myloader extends ClassLoader{
	String path;
	Myloader(String path){
		this.path = path;
	}
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> c = null;
		path = path +name.replace(".", "/").concat(".class");
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(path);
			byte [] b = new byte [fin.available()]; 
			int len = fin.read(b);
			c = this.defineClass(name, b,0, len);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fin != null) {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		}
		return c;
	}
}

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 自定义类加载器  加载类C   .class
		Myloader my = new Myloader("f:/eclipse/");
		@SuppressWarnings("rawtypes")
		Class c = Class.forName("C",true,my);
		System.out.println(c.getClassLoader());
		
		
			
		
	}

}
