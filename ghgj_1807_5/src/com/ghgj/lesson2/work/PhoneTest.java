package com.ghgj.lesson2.work;

class Phone<E,T>{
	private E name;
	private T number;
	public Phone(E name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", number=" + number + "]";
	}
	
	
}


public class PhoneTest {
	public static void main(String[] args) {
		Phone<String,Integer> phone = new Phone<>("2501",3515142);
		System.out.println();
	}
}
