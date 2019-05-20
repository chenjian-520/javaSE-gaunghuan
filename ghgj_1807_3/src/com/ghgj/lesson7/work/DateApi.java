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
		//计算一下你来到这个世界多少天。
		// String -> Date  parse
		// Date -> String  format
  		Date tadayTime = new Date();
		System.out.println(tadayTime);
		System.out.println("输入你的生日（格式YYYY-MM-dd）");
		SimpleDateFormat sdf =new SimpleDateFormat("YYYY-MM-dd");
		Date date = sdf.parse("1996-10-05");
		long time = tadayTime.getTime()-date.getTime();	
		
		System.out.println("活了"+time/1000/60/60/24+"天");
	}
	
	public static void demo11_6() {
		//获取任意一年二月份的天数
		//高级算法：日历设置到指定年份的3月1日，add向前偏移一天，29闰年
		// Calendar 抽象类 常用方法     getInstance() 建立子类对象
		// get   set    add    getTime 转成 Date 类型
		Calendar c = Calendar.getInstance();
		c.set(2000,2,1);
		// 月的天向前 偏移一天；
		c.add(c.DAY_OF_MONTH,-1);
		//get 方法获取天数
		int day = c.get(c.DAY_OF_MONTH);
		
		System.out.println(day);
		
	}
	
	
}

















