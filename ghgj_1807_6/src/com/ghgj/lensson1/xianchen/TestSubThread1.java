package com.ghgj.lensson1.xianchen;

class MyThread extends Thread {
	MyThread(String st){
		super(st);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread()+"玩游戏");
		}
	}
}

public class TestSubThread1 {

	public static void main(String[] args) {
		//创建线程
		MyThread t1 = new MyThread("sss");
		t1.start();
		
		// Thread  创建一个线程对象
//		Thread t = new Thread();
//		t.start();
		
	}

}
