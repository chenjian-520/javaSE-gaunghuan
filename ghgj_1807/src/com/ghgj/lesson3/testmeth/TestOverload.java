package com.ghgj.lesson3.testmeth;

public class TestOverload {
	/**
	 * �������أ�
	 * ��������ͬ �����б�ͬ�������������������ͣ�����˳�򣩸�����ֵ�޹أ�
	 * ������д�� 
	 * ����˵  �ܼ�
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
