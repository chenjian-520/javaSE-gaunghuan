package com.ghgj.lesson3.work;

interface IUse{
	public abstract void usb();
}

public class TestUsb implements IUse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUse usb = new TestUsb();
		usb.usb();
	}

	@Override
	public void usb() {
		// TODO Auto-generated method stub
		System.out.println("手机正在传输数据");
	}

}
