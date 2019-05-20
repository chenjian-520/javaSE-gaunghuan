package com.ghgj.lesson5.work;

public interface IInof {
  
	class A{
		int x = 22;
		public void f() {}
		public static void sf() {}
	}
	
	interface IA{
		int N =45;
		void af();
		default void df() {}
		static void sf1() {}
	}
}

class IAImpl implements IInof.IA{

	@Override
	public void af() {
		// TODO Auto-generated method stub
		df();
		IInof.IA.sf1();
	}
	
}

class InfoImpl implements IInof{
	public void methood() {
		System.out.println(IA.N);
		IA.sf1();
		//匿名内部类
		IA ia = new IA() {
			@Override
			public void af() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	public void show() {
		System.out.println( new A().x);
	}
}


//-----------------------------------------------------
class Base{
	class A{}
}

class Sub extends Base{
	// 不会覆盖 属于不同的名称空间
	class A{}
}























