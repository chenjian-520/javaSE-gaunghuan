package com.ghgj.lesson7.work;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		/*
		 *�����ⲿ���е��ڲ���ķ���inner����
		 *�����ⲿ������ҵ��ڲ��࣬ͨ���ڲ�����󣬵����ڲ���ķ���
		 *��ʽ��
		 *   �ⲿ����.�ڲ�����   ����=new  �ⲿ����󣨣�.new �ڲ�����󣨣���
		 *   ����.�ڲ��෽������
		 */
		OutClass.Inner in = new OutClass().new Inner();
		in.inner();
		
		/*
		 * ���þֲ��ڲ���ķ���innr
		 * 
		 */
		new OutClass().out();
		
		/*
		 * ʹ�������ڲ���
		 * 
		 * ����ʵ���࣬��д����������ʵ�������һ���㶨��
		 * ��ʽ��
		 *    new �ӿڻ��ࣨ��{
		 *    	��д���󷽷�
		 *    };
		 *    ��new��ʼ�����ֺŽ���
		 *    ������ �ӿڵ�ʵ����Ķ���
		 */
		new Smoking(){
			public void smoking(){
				System.out.println(" ssss d");
			}
		}.smoking();
		
		Date date = new Date(1992);
	
		
	}
}