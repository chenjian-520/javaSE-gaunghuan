package com.ghgj.lensson2.work;

import java.util.concurrent.locks.ReentrantLock;

class Car2 implements Runnable{

	private static  int piao =20;
	
	ReentrantLock lock = new ReentrantLock(true);//��ƽ��
	 public void getT(){
	try {
		lock.lock();
		piao--;
		System.out.println(Thread.currentThread().getName()
				+"��Ʊһ�ţ�     ��Ʊ��"+piao);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		lock.unlock();
	}
	
	 }
	
	
	@Override
	 public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<10;i++) {
		
			this.getT();
		}
	}
}

public class TestReentrantLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		Thread t1 = new Thread(car,"����");
		Thread t2 = new Thread(car,"����");
		t1.start();
		t2.start();
	}

}
