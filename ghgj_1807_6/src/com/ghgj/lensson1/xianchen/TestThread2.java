package com.ghgj.lensson1.xianchen;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
			System.out.println(Thread.currentThread());
		}
	}
	
}

public class TestThread2 {
	public static void main(String[] args) throws InterruptedException {
		//�½�
		MyThread1 t = new MyThread1();
		Thread t1 = new Thread(t,"��ʱ");
		Thread t2 = new Thread(t,"����");
		t1.start();
		t2.start();
/*		//1.�ȴ�
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//2.�ٵ�һ��
	/*	if(t1.isAlive()||t2.isAlive()) {
			Thread.sleep(10);
		}*/
		//3.�������߳���ִ��
		t1.join();
		t2.join();
		System.out.println("main������");
	}
}
