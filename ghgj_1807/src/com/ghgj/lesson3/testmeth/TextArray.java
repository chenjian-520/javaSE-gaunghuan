package com.ghgj.lesson3.testmeth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���飺
 * ��ͬ�������Ͷ�����ݷ���һ����������
 * ����һ��������ֻ�ܴ���һ���������������������ʱ���Ҫ������������ͣ�
 * ���������ʱ�����ȷ������ĳ��ȣ�Ҳ���Ǵ洢Ԫ�صĸ���;
 * 
 * @author ASUS
 *
 */
public class TextArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �������飺
		 * ��һ�֣� �������� ������[] = new ��������[����];
		 * �ڶ��֣� �������� ������[] = new ��������[]{Ԫ��һ��Ԫ�ض���Ԫ����������������};
		 * �����֣� �������� ������[] = {Ԫ��һ��Ԫ�ض���Ԫ����������������};
		 */
		int atay[] = new int[5];
		atay[2] = 2;
		int arry[] = new int[] {5,6,3,7,50,};
		int ary[] = {5,5,6,3,3};
		
		
		//ȡ�����е�Ԫ�� ��������[�±�]    ע�⣺������±��0��ʼ;
		System.out.println(atay[2]);
		
		//ѭ���������飺
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
			if(arry[0]<arry[i]) {
				arry[0]=arry[i];
			}
		}
		System.out.println("���ֵΪ��"+arry[0]);
		//null ��  ""  һ���ǿ�  һ���ǳ���Ϊ����ַ��� ;
		String arrStr[] = new String[5];
		arrStr[1]="1";
		System.out.println(arrStr[1].indexOf(0));
		
		//������������
		TextArray ta[] = new TextArray[5];
		ta[2] = new TextArray();
		
		//������������ Scanner��   
		//��������  ������  =  new ��������();
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		System.out.println(i);
		
		
		
		
		
		
		
		
	}

}
