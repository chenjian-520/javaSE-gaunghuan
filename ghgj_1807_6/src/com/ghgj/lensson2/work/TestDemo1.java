package com.ghgj.lensson2.work;

class Qingfeng {
	private int count;
	boolean tag = false;
	//产包子
	synchronized public void put(int count) {
		if(tag) {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.count = count;
		System.out.println("我生产了："+this.count);
		tag = true;
		notify();  //唤醒
	}
	//卖包子
	synchronized public void get() {
		if(tag==false) {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("我卖了："+this.count);
		tag = false;
		notify();
	}
	
}

class Producer implements Runnable{
	Qingfeng qingfeng;
	public Producer(Qingfeng qingfeng){
		this.qingfeng=qingfeng;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=5;i++) {
			qingfeng.put(i);
		}
	}
}


class Cosumer implements Runnable{
	Qingfeng qingfeng;
	public Cosumer(Qingfeng qingfeng){
		this.qingfeng=qingfeng;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 1;i<=5;i++) {
			qingfeng.get();
		}
	}
}


public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qingfeng qingfeng = new Qingfeng();
		Producer p = new Producer(qingfeng);
		Cosumer c = new Cosumer(qingfeng);
		
		Thread t1 = new Thread (p);
		Thread t2 = new Thread (c);
		t1.start();
		t2.start();
	}

}















