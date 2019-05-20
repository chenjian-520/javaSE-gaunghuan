package com.ghgj.lesson2.work;

public class Window {
	
	public static void main(String[] args) {
		TesxWindow  win = TesxWindow.getInstance();
		TesxWindow  win1 = TesxWindow.getInstance();
		win.chen();
		System.out.println(win+" "+win1);
		System.out.println(win == win1);
	}
}


// 单例模式  饿汉模式
class TesxWindow{
	private static TesxWindow win = new TesxWindow();
	
	private  TesxWindow() {
		
	}
	public void chen () {
		System.out.println("dddd");
	}
	
	public static TesxWindow getInstance() {
		return win;
	}
}



//单例模式  懒汉模式
class TesxWindow1{
	private static TesxWindow1 win = null;
	
	private  TesxWindow1() {
		
	}
	
	public static TesxWindow1 getInstance() {
		if(win == null) {
			win = new TesxWindow1();
		}
		return win;
	}
}