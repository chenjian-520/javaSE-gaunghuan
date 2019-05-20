package com.ghgj.lesson3.work;


interface WebBank {
	public abstract void webService();
} 

public class TestBank implements WebBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBank bank = new TestBank();
		bank.webService();
	}

	@Override
	public void webService() {
		// TODO Auto-generated method stub
		System.out.println("Õ¯…œ÷ß∏∂");
	}

}
