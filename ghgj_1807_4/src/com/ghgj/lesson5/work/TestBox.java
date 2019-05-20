package com.ghgj.lesson5.work;

import java.util.Date;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 22;
		Integer i = new Integer(n);
		//装箱
		//i = Integer.valueOf(n);
		//自动装箱
		i = n;
		//拆箱
		n = i.intValue();
		//自动拆箱
		n = i;
		/* 不可变类
		 * 除了 float 和   double  都有一部分缓存
		 * 整数 -128   127
		 * char 0-127
		 * bollean  都 
		 */
		Integer i1 = 22;
		Integer i2 = 22;
		System.out.println(i1 == i2);
		
		//数据转换 字符串 数字
		//字符串 -》 数字
		String s = "35153";
		int num = new Integer(s).intValue();
		num = Integer.parseInt(s); //////常用
		num = Integer.valueOf(s);
		
		//数字 -》 字符串
		s = num + "";
		s = String.valueOf(num);
		s = Integer.toString(num);
		
		//进制转换
		System.out.println(Integer.toBinaryString(2));//2
		System.out.println(Integer.toOctalString(8));//8
		System.out.println(Integer.toHexString(16));//16
		 
		
		
		System.out.println(Integer.valueOf("1",2));
		System.out.println(Integer.valueOf("7",8));
		System.out.println(Integer.valueOf("15",16));
		
		//查看范围
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
	
	
	}

}























