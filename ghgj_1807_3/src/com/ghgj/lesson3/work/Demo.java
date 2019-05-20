package com.ghgj.lesson3.work;

import java.text.DecimalFormat;

public class Demo {
	public static void main(String1[] args) {
	
	}
	
	public void math() {  //99³Ë·¨±í
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
			
		}
		DecimalFormat  a = new DecimalFormat("00.00");
		System.out.println(a.format(22.2185321));
	}
}
