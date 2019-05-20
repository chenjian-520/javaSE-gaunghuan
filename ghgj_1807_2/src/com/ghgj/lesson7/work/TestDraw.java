package com.ghgj.lesson7.work;

public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw cc = new Draw();
		cc.lines=4;
		cc.drawTrian();
		System.out.println();
		cc.drawRec();
		System.out.println();
		cc.drawPra();
	}

}

class Draw {
	int count;
	int lines;

	public void drawTrian() {
		int a =0;
		for (int i = 1; i <= lines; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				a++;
			}
			System.out.println();
		}
		count = a;
	}
	
	public void drawRec() {
		int a =0;
		for (int i = 1; i <= lines-2; i++) {
			for(int j=1;j<=lines;j++) {
				System.out.print("*");
				a++;
			}
			System.out.println();
		}
		count = a;
	}
	
	public void drawPra() {
		int a =0;
		for (int i = 1; i <= lines; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=lines;j++) {
				System.out.print("*");
				a++;
			}
			System.out.println();
		}
		count = a;
	}

}