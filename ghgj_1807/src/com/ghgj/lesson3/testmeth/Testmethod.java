package com.ghgj.lesson3.testmeth;

public class Testmethod {
	/**
	 * 当一个方法不为外界所用的
	 * @param args
	 */
	private String fun(String str) {
		
		System.out.println(str);
		return "ss";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testmethod chen = new Testmethod();

		String s = chen.fun("hello world");
		System.out.println(s);
		chen.xing();
	}
	//输出三角形
	public static void san() {
		for (int i = 1; i <=4 ; i++) {
		for (int b = 4; b >= i; b--) {
			System.out.print(" ");
		}
		for (int j = 1; j <= 2 * i - 1; j++) {

			System.out.print("*");
		}
		System.out.println();
		}
	}
	//输出菱形
	public void xing() {
		for (int i = 1; i <= 7; i++) {
			
			if(i<=4) {
			for (int b = 4; b >= i; b--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");
			}   
			}
			else {
				for(int n = 1 ; n <= i-3 ;n++) {
				System.out.print(" ");
				}
				for(int n=5 ; n>=2*(i-5)+1 ;n--) {
					System.out.print("*");
					}
			}
			
			
			System.out.println();
			
			}

		
		
	
	return ;
	}
}
