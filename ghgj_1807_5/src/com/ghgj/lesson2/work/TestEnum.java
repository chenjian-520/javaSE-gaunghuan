package com.ghgj.lesson2.work;

import java.util.Scanner;

 enum Color{
	//枚举类的对象
	RED {
		@Override
		public void chen() {
			// TODO Auto-generated method stub
			
		}
	},GREEN {
		@Override
		public void chen() {
			// TODO Auto-generated method stub
			
		}
	},BLUE {
		@Override
		public void chen() {
			// TODO Auto-generated method stub
			
		}
	};
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void chen();
}

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Color.RED);
		for(Color c:Color.values()) {
			System.out.println(c.name());
			System.out.println(c.ordinal());
		}
		
		//switch
		Scanner sc = new Scanner(System.in);
		System.out.println("输入颜色");
		String s = sc.next();
		//类型转换
		Color  a = Color.valueOf(s);
		switch(a) {
		case RED:System.out.println("红色");
			break;
		case GREEN:System.out.println("绿色");
			break;
		case BLUE:System.out.println("蓝色");
			break;
		}
	}

}
