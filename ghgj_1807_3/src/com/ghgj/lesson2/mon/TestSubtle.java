package com.ghgj.lesson2.mon;

public class TestSubtle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeMonster snake = new SnakeMonster("����",1000,1000);
		snake.run();
		snake.play();
		CentipedeEssence centipe = new CentipedeEssence("����",100,100);
		centipe.run();
		centipe.play();
	}
}
