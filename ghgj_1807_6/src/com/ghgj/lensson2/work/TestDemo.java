package com.ghgj.lensson2.work;

class TestThread1 implements Runnable {
	int i = 10;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (i > 0) {
			System.out.println(i);
			i--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread1 th = new TestThread1();
		Thread t1 = new Thread(th);
		t1.start();

	}

}
