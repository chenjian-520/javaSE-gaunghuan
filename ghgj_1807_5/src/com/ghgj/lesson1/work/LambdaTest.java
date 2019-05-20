package com.ghgj.lesson1.work;

import java.util.concurrent.SynchronousQueue;

@FunctionalInterface
interface Info{
	int  af();
	static void sf() {};
	default void sd() {};
}

@FunctionalInterface
interface Infoo{
	void  af(int a);
	static void sf() {};
	default void sd() {};
}

class InfoImpl implements Info{
	@Override
	public int af() {
		// TODO Auto-generated method stub
		System.out.println("ddddd");
		return 0;
	}
}


public class LambdaTest {
	//lambda 表达式
//	Info info1 = ()->{System.out.println("afafafafafaf");};
	//只有一行代码  可以省略{ }
//	Info info2 = ()->System.out.println("afafafafafaf");
	//Infoo info3 = (a)->{System.out.println("infoo");};
//	Infoo info3 = a->System.out.println("infoo");
	
	//Info in = () -> {return 22;};
	Info in = () ->  2;
	
	public static void main(String[] args) {
		
		System.out.println(new LambdaTest().in.af());
		
		new Info() {
			@Override
			public int af() {
				// TODO Auto-generated method stub
				System.out.println("dsdfdghbd");
				return 0;
			}
		}.af();
		
		
	}

	private void info3(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}




















