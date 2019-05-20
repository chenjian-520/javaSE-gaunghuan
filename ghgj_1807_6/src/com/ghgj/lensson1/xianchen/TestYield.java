package com.ghgj.lensson1.xianchen;

class ThreadDemo3 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==5&&Thread.currentThread().getName().equals("t1")) {
				Thread.yield();//ÈÃ²½
			}
		}
	}
}

class ThreadDemo4 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
}

public class TestYield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo4 demo = new ThreadDemo4();
		Thread t1 = new Thread(demo,"t1");
		Thread t2 = new Thread(demo,"t2");
		t1.start();
		t2.start();
		
		
	}

}
