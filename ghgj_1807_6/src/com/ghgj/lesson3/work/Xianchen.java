package com.ghgj.lesson3.work;

class Mail implements Runnable {
	static int piao = 10 ;
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i = 1 ;i<=5;i++) {
			piao--;
			System.out.println(Thread.currentThread().getName()
					+"��Ʊ"+i+"��"+"��Ʊ��"+piao);
		}
	}
}

public class Xianchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mail  m = new Mail();
		Thread t1 = new Thread (m,"С��");
		Thread t2 = new Thread (m,"С��");
		t1.start();
		t2.start();
	}

}
