package com.ghgj.lesson7.work;

public class OutClass {
	private int a = 1;
	int i =1;
	//�ⲿ���Աλ�ã������ڲ���
	class Inner{
		int i = 2;
		public void inner() {
			int i=3;
			System.out.println(OutClass.this.i);
		}
	}
	
	
	public void out () {
		
		class Innr{
			public void innr() {
				System.err.println("sssaf");
			} 	
		}
		Innr in  = new Innr();
		in.innr();
	}
}
