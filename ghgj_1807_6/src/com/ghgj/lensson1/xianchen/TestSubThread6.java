package com.ghgj.lensson1.xianchen;

class Bank implements Runnable{
	private int money;
	public void setMoney(){
		this.money +=100;
		System.out.println("��"+Thread.currentThread().getName()+":"+money);
	}
	
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			//ͬ�������
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
		Thread zhangsan = new Thread(bank,"����");
		Thread lisi = new Thread(bank,"����");
		zhangsan.start();
		lisi.start();
	
	}

}
