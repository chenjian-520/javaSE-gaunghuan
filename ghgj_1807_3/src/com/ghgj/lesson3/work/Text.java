package com.ghgj.lesson3.work;

public class Text {
	public static void main(String1[] args)  {
		Text color =new Text();
		try {
			color.color("b");
		} catch (ColorException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("�������");
		}
		
	}
	
	
	public void color (String string) throws ColorException {
		if( string.equals("��")||string.equals("��")||string.equals("��")) {
			System.out.println("��ӡ��ɫ"+string);
		}else {
			throw new ColorException("��ɫֻ�� Ϊ �� ��   ��");
		}
	}
}
