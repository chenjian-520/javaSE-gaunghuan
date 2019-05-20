package com.ghgj.lesson1.JavaPhasedOperation2;

public abstract class Water {
	public  void water() {
		System.out.println("ˮ");
	}
}

interface IFilter{
	public abstract void filter();
}

interface IBuffer {
	public abstract void buffer ();
}

interface IHeating{
	public abstract void heating ();
}

interface ISugar{
	public abstract void sugar ();
}

class Drinks1 extends Water implements IFilter,IBuffer {

	@Override
	public void buffer() {
		System.out.println("����");
	}
	@Override
	public void filter() {
		System.out.println("����");
	}
	
}
class Drinks2 extends Water implements IBuffer,IHeating  {

	@Override
	public void heating() {
		System.out.println("����");
	}
	@Override
	public void buffer() {
		System.out.println("����");
	}
	
}
class Drinks3 extends Water implements IFilter,ISugar  {

	@Override
	public void sugar() {
		System.out.println("����");
	}
	@Override
	public void filter() {
		System.out.println("����");
	}
	
}
