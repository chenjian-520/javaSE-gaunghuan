package com.ghgj.lesson2.work;

public class Director extends Employee{
	String assistantName;

	public Director(String assistantName) {
		super(1,"ÄÐ","¹ù¾¸","boss",30000,10);
		this.assistantName = assistantName;
	}
	@Override
	public int getDecMoney(int day) {
		if(day<=3) {
			return day*50;
		}else{
			return day*80;	
		}	
	}

}
