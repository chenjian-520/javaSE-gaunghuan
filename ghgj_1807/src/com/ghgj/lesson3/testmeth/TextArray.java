package com.ghgj.lesson3.testmeth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 数组：
 * 相同数据类型多个数据放在一个变量里面
 * 而且一个数组中只能存在一种数据类型在声明数组的时候就要定义该数组类型；
 * 定义数组的时候必须确定数组的长度，也就是存储元素的个数;
 * 
 * @author ASUS
 *
 */
public class TextArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 定义数组：
		 * 第一种： 数据类型 变量名[] = new 数据类型[长度];
		 * 第二种： 数据类型 变量名[] = new 数据类型[]{元素一，元素二，元素三，。。。。。};
		 * 第三种： 数据类型 变量名[] = {元素一，元素二，元素三，。。。。。};
		 */
		int atay[] = new int[5];
		atay[2] = 2;
		int arry[] = new int[] {5,6,3,7,50,};
		int ary[] = {5,5,6,3,3};
		
		
		//取数组中的元素 数组名称[下标]    注意：数组的下标从0开始;
		System.out.println(atay[2]);
		
		//循环遍历数组：
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
			if(arry[0]<arry[i]) {
				arry[0]=arry[i];
			}
		}
		System.out.println("最大值为："+arry[0]);
		//null 和  ""  一个是空  一个是长度为零的字符串 ;
		String arrStr[] = new String[5];
		arrStr[1]="1";
		System.out.println(arrStr[1].indexOf(0));
		
		//引用类型数组
		TextArray ta[] = new TextArray[5];
		ta[2] = new TextArray();
		
		//引用数据类型 Scanner类   
		//数据类型  变量名  =  new 数据类型();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int i = sc.nextInt();
		System.out.println(i);
		
		
		
		
		
		
		
		
	}

}
