package com.ghgj.lesson3.person;

public class Dog extends Animal{
	String name;
	public void run() {
		System.out.println("Εά");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.name = "ggg";
		System.out.println(dog.name);
		
	}
	
}
