package com.ghgj.lesson1.JavaPhasedOperation2;

interface Food {
	String food();
}

abstract class Animal{
	public abstract void eat(Food food) ;
}

class Dog extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("π∑≥‘"+food.food());
	}
}

class Cat extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("√®≥‘"+food.food());
	}
}

class Fish extends Animal implements Food{
	@Override
	public void eat(Food food) {
		System.out.println("¥Û”„≥‘–°”„");
	}
	@Override
	public String food() {
		return "”„∏…";
	}
}

class Bone implements Food{
	@Override
	public String food() {
		return "π«Õ∑";
	}
} 

class Feeder {
	public void feed(Animal animal,Food food) {
		animal.eat(food);
	}
}

public class TestFeeder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish = new Fish();
		Bone bone = new Bone();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Feeder feeder = new Feeder();
		feeder.feed(dog, bone);
		feeder.feed(cat, fish);
		fish.eat(fish);
		System.out.println(bone.food());
		cat.eat(fish);
		
	}

}
