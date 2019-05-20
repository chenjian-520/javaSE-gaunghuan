package com.ghgj.lesson3.work;

public class Text {
	public static void main(String1[] args)  {
		Text color =new Text();
		try {
			color.color("b");
		} catch (ColorException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("输入错误");
		}
		
	}
	
	
	public void color (String string) throws ColorException {
		if( string.equals("红")||string.equals("黄")||string.equals("蓝")) {
			System.out.println("打印颜色"+string);
		}else {
			throw new ColorException("颜色只能 为 红 黄   蓝");
		}
	}
}
