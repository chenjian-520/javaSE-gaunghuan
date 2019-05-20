package com.ghgj.lesson5.work;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class TestDate {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
//		System.out.println(date);
//		
//		System.out.println(System.currentTimeMillis());
//		System.out.println(date.getTime());
//		
		Date date1 = new Date(date.getTime());
		System.out.println(date1);
		String dd=date1.toString();
		System.out.println(dd);
		date1 = Date.valueOf(dd);
		System.out.println(date1);
		
		Time time = new Time (date.getTime());
		System.out.println(time);
		
		Timestamp stamp = new Timestamp(date.getTime());
		System.out.println(stamp);
		System.out.println("------------------------------------------------------");
		//-------------------------------------------------
		Calendar c = Calendar.getInstance();  //获得实现类对象
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH+1));
		System.out.println(c.get(Calendar.DATE));
		Calendar c1 = Calendar.getInstance();
		c1.set(2012,1,2);
		System.out.println(c.before(c1));
		System.out.println(c.after(c1));
		//------------------------------------------------
		//当前环境缺省的格式
		NumberFormat f1 = NumberFormat.getInstance();
		System.out.println(f1.format(23.56546));
		//当前环境缺省的 货币格式
		f1 = NumberFormat.getCurrencyInstance();
		System.out.println(f1.format(3542.18534321));
		
		DecimalFormat df1 = new DecimalFormat("000.00");
		System.out.println(df1.format(43.15321));
		
		//------------------------日期格式化----------------------
		//父类
		//当前环境缺省格式
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(date));
		df  = DateFormat.getInstance();
		System.out.println(df.format(date));//18-8-10 下午1:05
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(date));
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println(df.format(date));
		df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(df.format(date));
		
		//子类 
		// yy MM dd  hh(12) H(24)  mm  ss S
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:sss");
		System.out.println(sf1.format(date));
		
		//日期
		LocalDate ldate = LocalDate.now();
		ldate = LocalDate.of(2021, 12, 2);
		System.out.println(ldate);
		System.out.println(ldate.getYear());
		System.out.println(ldate.getMonthValue());
		System.out.println(ldate.getDayOfMonth());
		System.out.println(ldate.getDayOfYear());
		System.out.println(ldate.plusYears(10));
		System.out.println(ldate.minusYears(2));
		
		//时间
		LocalTime ltime = LocalTime.now();
		ltime = LocalTime.of(3,20, 23);
		System.out.println(ltime);
		System.out.println(ltime.getHour());
		System.out.println(ltime.plusHours(10));
		System.out.println(ltime.minusHours(12));
		
		//日期时间
		LocalDateTime ldt1 = LocalDateTime.now();
		ldt1 = LocalDateTime.of(2012,2,3,5,4,56);
		System.out.println(ldt1);
		System.out.println(ldt1.getYear());
		System.out.println(ldt1.getDayOfMonth());
		
		//运算
		LocalDateTime ldt2 = LocalDateTime.now();
		ldt2 = LocalDateTime.of(2012, 2, 2, 4, 5);
		
		LocalDateTime ldt3 = LocalDateTime.now();
		ldt3 = LocalDateTime.of(2012, 3, 2, 4, 5);
		
		Duration du = Duration.between(ldt3, ldt2);
		System.out.println(du.toDays());
	}
}












































