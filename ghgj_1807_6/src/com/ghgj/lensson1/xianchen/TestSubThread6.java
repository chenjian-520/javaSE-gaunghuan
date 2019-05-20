package com.ghgj.lensson1.xianchen;

class Bank implements Runnable{
	private int money;
	public void setMoney(){
		this.money +=100;
		System.out.println("余额："+Thread.currentThread().getName()+":"+money);
	}
	
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			//同步代码块
//			synchronized(this) {
			setMoney();
//			}
		}
	}
}

public class TestSubThread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Thread zhangsan = new Thread(bank,"张三");
		Thread lisi = new Thread(bank,"李四");
		zhangsan.start();
		lisi.start();
	
	}

}
