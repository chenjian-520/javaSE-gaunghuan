package com.ghgj.lensson1.xianchen;

class MyThread extends Thread {
	MyThread(String st){
		super(st);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread()+"����Ϸ");
		}
	}
}

public class TestSubThread1 {

	public static void main(String[] args) {
		//�����߳�
		MyThread t1 = new MyThread("sss");
		t1.start();
		
		// Thread  ����һ���̶߳���
//		Thread t = new Thread();
//		t.start();
		
	}

}
