package com.ghgj.lensson1.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Person{
	String name;
	int age ;
	int  price;
	public Person(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		funstion5();
	}
	
	
	//Scanner 的用法   从流中获取数据
	public static void funstion5() throws IOException{
		FileInputStream fis = new FileInputStream("F:\\eclipse\\b.txt");
		Scanner sc = new Scanner(fis);
		String s = sc.nextLine();
		String a = sc.nextLine();
		System.out.println(s);
		System.out.println(a);
		sc.close();
		
	}
	
	
	public static void funstion4(){
		while(true) {
			System.out.println("请输入学员姓名：");
			Scanner  sc = new Scanner(System.in);
			String name = sc.next();
			FileOutputStream fos = null;
			try {
				 fos = new FileOutputStream("F:\\eclipse\\b.txt",true);	
				 fos.write("\r\n".getBytes());	
				 fos.write(name.getBytes());
				 if(name.equals("q")) {
					 break;
				 }
					
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fos.close();
					sc.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("添加成功");
			}
				
		
		}
	}
	
	//读写缓冲	区
	public static void funstion3() {
		File  in =new File("G:\\360Downloads\\318157.jpg");
		File  in1 =new File("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\3.jpg");
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bfin = null;
		BufferedOutputStream bfout =null;
	
		try {
			  fis = new FileInputStream(in);
			  fos = new FileOutputStream(in1);
			 bfin = new BufferedInputStream(fis);
			 bfout=new BufferedOutputStream(fos); 
				
			  int len;
			 
			  while((len=bfin.read()) !=-1 ) {
				  bfout.write(len);
			  }
			  bfout.flush();//刷新缓冲区
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void funstion2() {
		File  in =new File("G:\\360Downloads\\318157.jpg");
		File  in1 =new File("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\3.jpg");
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		try {
			  fis = new FileInputStream(in);
			  fos = new FileOutputStream(in1);
			  int len;
			  byte[] bytes = new byte[1024];
			  while((len=fis.read(bytes)) !=-1 ) {
				  fos.write(bytes,0,len);
			  }
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void funstion1() {
		List<Person> p = new ArrayList<>();
		p.add(new Person("zhangsan",18,5000));
		p.add(new Person("list",20,6000));
		p.add(new Person("wangwu",30,8000));
		System.out.println(p);
		p.add(0,new Person("zhaoliu",25,5500));
		for(Person a:p) {
			if(a.name.equals("wangwu")) {
				p.remove(a);
				break;}
			}
		p.forEach(System.out::println);
		
		
	Set<Integer> set = new HashSet<>();
	for(;set.size()<7;) {
		int a = (int)(Math.random()*(30-1+1)+1);
		set.add(a);
	}
	System.out.println(set);
	}
}
