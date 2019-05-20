package com.ghgj.lesson5.work;
import java.util.Scanner;

class Box <E>{
	E width;
	E height;
	
	public Box(E width,E height) {
		this.width = width;
		this.height = height;
	}

	public E getWidth() {
		return width;
	}

	public E getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + "]";
	}	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Box<Integer> b1 = new Box<Integer>(52,53);
		System.out.println(b1);
		Box<Double> b2 = new Box<Double>(522.2,53.21);
		System.out.println(b2);
		Box<String> b3 = new Box<String>("dsgfssda","sfcx");
		System.out.println(b3);*/
		int a ='a';
		System.out.println(a);
		funtion4();
		
	}
	
	public static void funtion4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入：");
		String str = sc.nextLine();
		char[] a = str.toCharArray();
		int d=0 ,b=0,c=0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]>=48&&a[i]<=57) {
				c++;
			}else if(a[i]==' ') {
				b++;
			}else if(a[i]>='A'&&a[i]<='z') {
				d++;
			}
		}
		System.out.println(c+"  "+b+"  "+d);
	}
	
	public static void buffFuntion1() {
		StringBuffer st = new StringBuffer();
		System.out.println("输入一串数字");
		Scanner sc = new Scanner(System.in);
		st.append(sc.next());
		String str1 = st.toString();
		String str = st.reverse().toString();
		if(str.equals(str1)){
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
		
	}
	
	public static void buffFuntion() {
		StringBuffer st = new StringBuffer();
		System.out.println("输入一串数字");
		Scanner sc = new Scanner(System.in);
		st.append(sc.next());
		st.reverse();
		System.out.println("反转后：");
		System.out.println(st);
	}
	
	public static void stringbuff() {
		Scanner sc = new Scanner(System.in);
		StringBuffer st = new StringBuffer();
		while(true) {
			System.out.println("--输入姓名：--");
			String name = sc.next();
			if (name.equals("q")) {
				break;
			}
			 st.append(name) ;
		}
		System.out.println(st);
	}

}























