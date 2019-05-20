package com.ghgj.lensson1.xianchen;

public class TestMain {
	public static void main(String[] args) {
		//Thread
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("abc");
		System.out.println(Thread.currentThread().getName());
	}
}
