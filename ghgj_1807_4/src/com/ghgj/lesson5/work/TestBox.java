package com.ghgj.lesson5.work;

import java.util.Date;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 22;
		Integer i = new Integer(n);
		//װ��
		//i = Integer.valueOf(n);
		//�Զ�װ��
		i = n;
		//����
		n = i.intValue();
		//�Զ�����
		n = i;
		/* ���ɱ���
		 * ���� float ��   double  ����һ���ֻ���
		 * ���� -128   127
		 * char 0-127
		 * bollean  �� 
		 */
		Integer i1 = 22;
		Integer i2 = 22;
		System.out.println(i1 == i2);
		
		//����ת�� �ַ��� ����
		//�ַ��� -�� ����
		String s = "35153";
		int num = new Integer(s).intValue();
		num = Integer.parseInt(s); //////����
		num = Integer.valueOf(s);
		
		//���� -�� �ַ���
		s = num + "";
		s = String.valueOf(num);
		s = Integer.toString(num);
		
		//����ת��
		System.out.println(Integer.toBinaryString(2));//2
		System.out.println(Integer.toOctalString(8));//8
		System.out.println(Integer.toHexString(16));//16
		 
		
		
		System.out.println(Integer.valueOf("1",2));
		System.out.println(Integer.valueOf("7",8));
		System.out.println(Integer.valueOf("15",16));
		
		//�鿴��Χ
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
	
	
	}

}























