package com.ghgj.lensson1.xianchen;

class ThreadDemo2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
					System.out.println("进入异常处理");
				}
			}
		}
	}
}


public class TestIerrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 demo = new ThreadDemo2();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		t1.start();
		t2.start();
		t1.interrupt();//中断t1
	}

}
