package com.ghgj.lensson1.demo;

class Eat implements Runnable{
	private int a=6;
	@Override
	synchronized public void run() {
	// TODO Auto-generated method stub
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()
					+":"+a);
			a--;
		}
		
	}
}
public class Xianchen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eat eat = new Eat();
		Thread t1 = new Thread(eat,"张三");
		Thread t2 = new Thread(eat,"李四");
		t1.start();
		t2.start();
		
	}

}
