package com.ghgj.lensson1.xianchen;

class ThreadDemo1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread()+"玩游戏");
		}
	}
}

public class TestSubThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 demo = new ThreadDemo1();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		//设置优先级
//		t1.setPriority(10);
//		t2.setPriority(1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
//		t1.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		
		
	}

}
