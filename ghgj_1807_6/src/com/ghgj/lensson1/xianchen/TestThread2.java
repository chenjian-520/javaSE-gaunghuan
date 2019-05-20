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
		//新建
		MyThread1 t = new MyThread1();
		Thread t1 = new Thread(t,"暂时");
		Thread t2 = new Thread(t,"试试");
		t1.start();
		t2.start();
/*		//1.等待
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//2.少等一会
	/*	if(t1.isAlive()||t2.isAlive()) {
			Thread.sleep(10);
		}*/
		//3.让其他线程先执行
		t1.join();
		t2.join();
		System.out.println("main结束了");
	}
}
