package com.ghgj.lesson2.interface3;

public class Test {  //������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog("���","��ɫ","�ǲ�����");
		Rabbit rabbit = new Rabbit("����","��ɫ","������");
		rabbit.shout();
		rabbit.eat();
		System.out.println("------------------");
		frog.shout();
		frog.eat();
	}

}
