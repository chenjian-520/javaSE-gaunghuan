package com.ghgj.lensson1.demo;

class Student implements Runnable{
	@Override
	public void run() {
	// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			System.out.println(Thread.currentThread().getName()
					+":"+"�ú�ѧϰ����������");
		}
	}
}
public class Xianchen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Thread t1 = new Thread(st,"����");
		Thread t2 = new Thread(st,"����");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
