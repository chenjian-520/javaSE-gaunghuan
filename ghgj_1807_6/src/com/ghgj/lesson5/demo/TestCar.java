package com.ghgj.lesson5.demo;

class Car {
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Car(int num) {
		super();
		this.num = num;
	}	
	@Override
	public String toString() {
		return "Car [num=" + num + "]";
	}
	public void stop(int a) {
		System.out.println(num+"号车正在停车"+a);
	}
	public void  start(int a) {
		System.out.println(num+"号车正在离开"+a);
	}
}

class CarStop implements Runnable{
	static int a =3;
	
	public CarStop(int a ) {
		this.a= a;
	}
	
	@Override
	public void run() {
		int h = (int)(Math.random()*(1000-1+1)+1);
		Car c = new Car(h);
		while(true){
			if(a==3) {
				T1(c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}if(a==2){
				T2(c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}if(a==1) {
				T3(c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else {
				System.out.println(h+"号没有等到车位");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void T1(Car c) {
		if (a == 3) {
			synchronized (c) {
				c.stop(1);
				a = 2;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c.start(1);
			}
		} else {
			return;
		}
	}
	 public static void T2(Car c) {
		if (a == 2) {
			synchronized (c) {
				c.stop(2);
				a = 1;
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c.start(2);
			}
		} else {
			return;
		}	
	}
	 public static void T3(Car c) {
		if (a == 1) {
			synchronized (c) {
				c.stop(3);
				a = 3;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c.start(3);
			}
		} else {
			return;
		}
	}
}

public class TestCar {

	public static void main(String[] args) throws InterruptedException {
		CarStop car = new CarStop(3);
		Thread t1 =new Thread(car); 
		Thread t2 =new Thread(car); 
		Thread t3 =new Thread(car); 
		Thread t4 =new Thread(car); 
		t1.start();
		Thread.sleep(3000);
		t2.start();
		Thread.sleep(3000);
		t3.start();
		Thread.sleep(3000);
		t4.start();	
	}
}
