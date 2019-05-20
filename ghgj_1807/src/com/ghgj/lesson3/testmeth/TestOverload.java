package com.ghgj.lesson3.testmeth;

public class TestOverload {
	/**
	 * 方法重载：
	 * 方法名相同 参数列表不同（参数个数，参数类型，参数顺序）跟返回值无关；
	 * 方法重写： 
	 * 后面说  很简单
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int add(int a, int b) {
		return a + b;

	}
	public double add(double a, double b) {
		return a + b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverload chen = new TestOverload();
		int sum = chen.add( 4 , 5 );
		System.out.println(sum);
		
		

	}

}
