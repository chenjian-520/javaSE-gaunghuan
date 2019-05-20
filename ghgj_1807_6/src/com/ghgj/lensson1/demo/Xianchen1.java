package com.ghgj.lensson1.demo;

class Student implements Runnable{
	@Override
	public void run() {
	// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			System.out.println(Thread.currentThread().getName()
					+":"+"好好学习，天天向上");
		}
	}
}
public class Xianchen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Thread t1 = new Thread(st,"张三");
		Thread t2 = new Thread(st,"李四");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
