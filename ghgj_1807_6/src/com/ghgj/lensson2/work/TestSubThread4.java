package com.ghgj.lensson2.work;


//����   �����

class Zhangsan{
	public void say() {
		System.out.println("������飬�Ҿ͸��㻭");
	}
	public void get() {
		System.out.println("�����������");
	}
}
class Lisi{
	public void say() {
		System.out.println("����һ����Ҿ͸�����");
	}
	public void get() {
		System.out.println("���Ļ���˻�");
	}
}
class ThreadDemo implements Runnable{
	private static Zhangsan zhangsan = new Zhangsan();
	private static  Lisi lisi = new Lisi();
	public boolean tag = false;
	public void run() {
		if(tag) {
			synchronized (zhangsan) {
				zhangsan.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lisi) {
					zhangsan.get();
				}
				
			}
		}else {
			synchronized (lisi) {
				lisi.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (zhangsan) {
					lisi.get();
				}
			}
		}
	}
}
public class TestSubThread4 {

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		demo1.tag = true;
		ThreadDemo demo2 = new ThreadDemo();
		demo2.tag = false;
		Thread t1 = new Thread(demo1);
		Thread t2 = new Thread(demo2);
		t1.start();
		t2.start();

	}

}