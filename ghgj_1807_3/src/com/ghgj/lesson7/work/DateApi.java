package com.ghgj.lesson7.work;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class DateApi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		demo11_6();
	}
	
	public static void demo11_5() throws Exception{
		//����һ�������������������졣
		// String -> Date  parse
		// Date -> String  format
  		Date tadayTime = new Date();
		System.out.println(tadayTime);
		System.out.println("����������գ���ʽYYYY-MM-dd��");
		SimpleDateFormat sdf =new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse("1996-10-05");
		long time = tadayTime.getTime()-date.getTime();	
		
		System.out.println("����"+time/1000/60/60/24+"��");
	}
	
	public static void demo11_6() {
		//��ȡ����һ����·ݵ�����
		//�߼��㷨���������õ�ָ����ݵ�3��1�գ�add��ǰƫ��һ�죬29����
		// Calendar ������ ���÷���     getInstance() �����������
		// get   set    add    getTime ת�� Date ����
		Calendar c = Calendar.getInstance();
		c.set(2000,2,1);
		// �µ�����ǰ ƫ��һ�죻
		c.add(c.DAY_OF_MONTH,-1);
		//get ������ȡ����
		int day = c.get(c.DAY_OF_MONTH);
		
		System.out.println(day);
		
	}
	
	
}

















