package com.ghgj.lesson2.day2;

public class Car {
	public void run() {
		System.out.println("������ʻ");
	}
	public void brake() {
		System.out.println("����ɲ��");
	}
}

class Truck extends Car{
	@Override
	public void run() {
		System.out.println("��������");
	}
	@Override
	public void brake() {
		System.out.println("����ж��");
	}
}

class buy extends Car{
	@Override
	public void run() {
		System.out.println("��������վ");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("������ͣ��վ");
	}
}
