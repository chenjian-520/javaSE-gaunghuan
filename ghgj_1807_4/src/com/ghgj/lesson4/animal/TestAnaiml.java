package com.ghgj.lesson4.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class TestAnaiml {
	static ArrayList<Animal> array = new ArrayList<Animal>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("¼Ó·ÆÃ¨",4);
		Duck duck = new Duck("ÌÆÐ¡Ñ¼",2);
		Dolphin dolphin = new Dolphin("º£ëàç÷ç÷");
		array.add(cat);
		array.add(duck);
		array.add(dolphin);
		
		Iterator<Animal> it = array.iterator();
		while(it.hasNext()) {
			Animal animal=it.next();
			
			System.out.print(animal.toString()+"  ");
			animal.shout();
			
		}
	}

}
