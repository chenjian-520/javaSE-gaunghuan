package com.ghgj.lesson2.work;

import java.util.Scanner;

 enum Color{
	//ö����Ķ���
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
		System.out.println("������ɫ");
		String s = sc.next();
		//����ת��
		Color  a = Color.valueOf(s);
		switch(a) {
		case RED:System.out.println("��ɫ");
			break;
		case GREEN:System.out.println("��ɫ");
			break;
		case BLUE:System.out.println("��ɫ");
			break;
		}
	}

}
