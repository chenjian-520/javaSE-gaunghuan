package com.ghgj.lensson2.work;

import java.util.concurrent.locks.ReentrantLock;

class Kid implements Runnable{
	private int i=0;
	ReentrantLock lock = new ReentrantLock();
	
	public void show() {
		try {
			lock.lock();
			this.i++;
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+"    "+i);
			
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
		this.show();
		
	}
}

public class TestLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid  kid = new Kid();
		Thread t1 = new Thread(kid,"���� ");
		Thread t2 = new Thread(kid,"���� ");
		Thread t3 = new Thread(kid,"ŷ���� ");
		Thread t4 = new Thread(kid,"�ܲ�ͨ");
		Thread t5 = new Thread(kid,"�");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
