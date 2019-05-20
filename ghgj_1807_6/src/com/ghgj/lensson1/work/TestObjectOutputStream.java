package com.ghgj.lensson1.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int no;
	private String name;
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class TestObjectOutputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student gou = new Student(001,"chen");
		
		//1
		File f1 = new File("F:\\eclipse\\object.txt");
		FileOutputStream four = new FileOutputStream(f1);
		ObjectOutputStream object = new ObjectOutputStream(four);
		//写
		object.writeObject(gou);
		//关
		object.close();
		
		//反序列化
		FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Student stu=(Student)objin.readObject();
		System.out.println(stu);
		objin.close();
		
		
	}

}
