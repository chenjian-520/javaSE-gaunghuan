package com.ghgj.lesson1.work;



class Anima1{
	public void Reproduction(){
		System.out.println("��ֳ");
	}
}

class Goose extends Anima1 {	
	/*public void fly() {
		// TODO Auto-generated method stub
		System.out.println("��");
	}*/
	IFly fly = ()->{System.out.println("fei");};
}

class Duck extends Anima1 {
	public void swim() {
		System.out.println("��ˮ");
	}
}



class TangDuck extends Duck{
	
	/*public void say() {
		// TODO Auto-generated method stub
		System.out.println("˵�˻�");
	}*/
	ISay say = ()->{System.out.println("shuo");};
}

interface IFly{
	void fly();
}

interface ISay{
	void say();
}

public class Test2Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}

















