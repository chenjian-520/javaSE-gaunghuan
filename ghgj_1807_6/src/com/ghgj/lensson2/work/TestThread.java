package com.ghgj.lensson2.work;

class Car implements Runnable{
	private static  int piao =20;
	synchronized public void getT(){
	piao--;
	System.out.println(Thread.currentThread().getName()+"��Ʊһ�ţ�     ��Ʊ��"+piao);
	}
	@Override
	 public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<10;i++) {
		
			this.getT();
		}
	}
}

class Car1 extends Thread{
	private static  int piao =20;
	

	public Car1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	 public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			piao--;
		System.out.println(Thread.currentThread().getName()+"��Ʊһ�ţ�     ��Ʊ��"+piao);
		}
	}
}


public class TestThread {
	public static void main(String[] args) {
		Car car = new Car();
		Thread t1 = new Thread(car,"����");
		Thread t2 = new Thread(car,"����");
		t1.start();
		t2.start();
		
	/*	Car1 t1 = new Car1("����");
		Car1 t2 = new Car1("����");
		t1.start();
		t2.start();*/
	}
}

















