package com.ghgj.lesson5.work;


interface Info1{
	void af();
}


public class TestNonameInfo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Info1() {
			@Override
			public void af() {
				// TODO Auto-generated method stub
				System.out.println("sdsdfsdgg");
			}
		}.af();
		
		Info1 in=new Info1() {
			@Override
			public void af() {
				// TODO Auto-generated method stub
				System.out.println("sdgg");
			}
		};
		
		in.af();
		
	}

}
