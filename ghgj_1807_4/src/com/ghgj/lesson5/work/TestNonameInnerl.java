package com.ghgj.lesson5.work;

class Base1{
	public void f() {};
}

/*class Sub1 extends Base1{
	public void f() {
		System.out.println("sub_f");
	}
}*/

public class TestNonameInnerl {

	Base1 base1 = new Base1() {
		public void f() {
			System.out.println("sub_f");
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sub1 s = new Sub1();
//		s.f();
		
		TestNonameInnerl t = new TestNonameInnerl();
		t.base1.f();
		
		
		//�����ڲ���   �����������ʵ�������ʽ���� 
		new Base1(){
			public void f(){
				System.out.println("sub_f");
			}
			public void m() {}
		}.m();
		
		
	}

}
