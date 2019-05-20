package com.ghgj.lesson3.work;

class Pet{
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println("��");
	}
}

class Dog extends Pet{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Թ�ͷ");
	}
	public void run  () {
		System.out.println("��");
	}
}

class Cat extends Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
		System.out.println("��");
	}
}

class PetHospatill{  //����ҽԺ  ���� ����   ���� ���ݵĳ��������
	public void treatment(Pet pet) {
		System.out.println("����"+pet.getName());
		
		pet.eat();
		if(pet instanceof Dog) {
			Dog a =(Dog)pet;
			a.run();}
		else {
			Cat b =(Cat)pet;
			b.play();
		}
	}
}

public class TestHospatil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog wangwang = new Dog("wangwang");
		Cat maomao =new Cat("maomao ");
		PetHospatill pho = new PetHospatill();
		pho.treatment(maomao);
		pho.treatment(wangwang);
		
		
		
		
		
	}

}
