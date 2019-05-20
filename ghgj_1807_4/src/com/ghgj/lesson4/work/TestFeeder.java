package com.ghgj.lesson4.work;

class Feeder{
	public void feed(Animal animal) {
		if(animal instanceof Dog) {
			Bone food = new Bone("»‚");
			 Dog  dog = (Dog)animal;
			 dog.eat(food);
		}else {
			Fish food  = new Fish("”„");
			 Cat  cat = (Cat)animal;
			 cat.eat(food);
		}
		
	}
}
class Food{
	private String name;

	public Food(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class Bone extends Food{

	public Bone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class Fish extends Food{

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class Animal {
	public void eat(Food food) {
		System.out.println("chi");
	}
}

class Dog extends Animal{
	@Override
	public void eat(Food food ) {
		System.out.println("π∑π∑Œπ≥‘"+food.getName());
	}
}

class Cat extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("√®Œπ≥‘"+food.getName());
	}
}

public class TestFeeder {
	public static void main(String[] args) {
		Feeder feeder = new Feeder();
		Dog dog = new Dog();
		Cat cat = new Cat();
		feeder.feed(cat);
		feeder.feed(dog);
	}
}
