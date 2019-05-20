package com.ghgj.lesson2.work;

import java.util.Scanner;

enum  Season{
	SPRING("´º") ,SUMMER("ÏÄ"),QUTUMN("Çï"),WINTER("¶¬");
	private String name;
	
	public String getName() {
		return name;
	}

	private Season(String name) {
		this.name = name;
	}
	
}

public class EnumT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÊäÈë¼¾½Ú£º");
		Scanner sc = new Scanner(System.in);
		String season = sc.next();
		String season1=season.toUpperCase();
		Season sea = Season.valueOf(season1);
		switch(sea) {
		case SPRING:System.out.println("¡°´ºÅ¯»¨¿ª¡±");
			break;
		case SUMMER:System.out.println("¡°ÏÄÈÕÑ×Ñ×¡±");
			break;
		case QUTUMN:System.out.println("¡°Çï¸ßÆøË¬¡±");
			break;
		case WINTER:System.out.println("¡°¡°¶¬ÈÕÑ©Æ®¡±¡±");
			break;
		}
	}
}
