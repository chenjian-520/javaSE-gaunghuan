package com.ghgj.lesson1.jbs;

/**
 * ��ʦ�ࣺ���ԣ����������䣬�Ա�
 * ��Ϊ�����飬�Է���
 * 
 * �����������ͣ�4�� 8��  �� ���Σ������ͣ��ַ��ͣ������ͣ�
 * 8��:bit byte chat short int long float double boolean;
 * �����������ͣ�
 * ���飬�����ͣ�
 * 
 * ע�⣺һ��javaԭ�ļ��ж����java������ж��
 * ����public ���ε����������һ��Ҫ��ԭ�ļ�����һ��
 * 
 * ��Ա���������ж��壬Ҳ�����ԣ��������з����ɼ�
 * �ֲ��������ֲ����壬�ֲ�ʹ�ã�������������ʧ
 * 
 */
public class TestTeacher {
	//���������������� ��������;
	String name;
	int age;
	
	/**
	 *���巽����
	 *����ֵ���� �� �������ƣ���������  ���������ƣ�{} 
	 */
	 
	public void eat(){
		System.out.println("hello world");
	}
	
	public static void main(String[] agrs) {
		//ʵ������������  ������  = new ����();
		TestTeacher teach = new TestTeacher(); 
		teach.eat();
	}
	
	
}
