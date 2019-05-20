package com.ghgj.lesson5.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "aa");
		map.put(2, "aa");
		map.put(3, "aa");
		map.put(4, "aa");
		map.put(5, "aa");
		map.forEach((a,b)->System.out.println(a+".."+b));
	}

}
 class Test {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("斐波那契序列前n项为：");
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+"\t");
		}		
	}
}
