package com.ghgj.lesson2.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Demo.demo4();
		
		
	}
	//������洢��Ա��Ϣ
	public static void shop() {
		int[] num = new int[3] ;
		String[] birst = new String[3];
		int[] total = new int[3];
		Scanner sc =new Scanner (System.in);
		num[0]=3534;birst[0]="12/10";total[0]=1255;
		boolean flag = true; int i=0;
		
		for (int j=0 ;j<num.length;j++) {
			if(birst[j]!=null) {
			System.out.print("��Ա��:"+num[j]);	
			System.out.print("��Ա����:"+birst[j]);
			System.out.println("��Ա����:"+total[j]);
			
			i=j+1;  //��λ�±�
			}
		}
		while(flag) {
			System.out.println("�Ƿ�������ӻ�Ա����y/n��");
			String st = sc.next();
			if(st.equals("n")) {
				flag = false;
			}else if(st.equals("y")&&i<birst.length){
				
			System.out.println("��¼���»�Ա��");
			num[i]=sc.nextInt();
			System.out.println("��¼���»�Ա����");
			birst[i]=sc.next();
			System.out.println("��¼���»�Ա����");
			total[i]=sc.nextInt();
			i++;
			}else if(i>=birst.length) {
				System.out.println("�����Ա����");
				flag = false;
			}
			else {
				System.out.println("����������");
			}
		
		
		}
		System.out.println("********************���Ӻ�����л�Ա******************");
		int a=0 ,b =0;
		for (int j=0 ;j<num.length;j++) {
			if(birst[j]!=null) {
			System.out.print("��Ա��:"+num[j]);	
			System.out.print("��Ա����:"+birst[j]);	
			System.out.println("��Ա����:"+total[j]);
			
			if(a<total[j]) {
				a=total[j];
				b=j;
			}
			
			}
			
		}
	System.out.println("���˻�Ա��"+num[b]+"\t"+birst[b]+"\t"+total[b]);
		
	sc.close();
	}
	//��ǿfor
	public static void demo6() {
		int [] arr = new int [] {25,15,35,87,2};
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	//ѡ����������
	public static void demo5() {
		int [] arr = new int [] {25,15,35,87,2};
		for(int i=0;i<arr.length-1;i++) { //λ��
			for (int j=i+1;j<arr.length;j++) { //����
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		arr[0]=arr[0]+arr[arr.length-1];
		arr[arr.length-1]=arr[0]-arr[arr.length-1];
		arr[0]=arr[0]-arr[arr.length-1];
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	//ð����������
	public static void demo4() {
		int [] arr = new int [] {25,15,35,87,2};
		for(int i=0;i<arr.length-1;i++) {     //��
			for (int j=0;j<arr.length-1;j++) { //����
				if(arr[j]<arr[j+1]) {
					arr[j+1]=arr[j]+arr[j+1];
					arr[j]=arr[j+1]-arr[j];
					arr[j+1]=arr[j+1]-arr[j];
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	//�����ֵ
	public static void demo3() {
		int [] score = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("����10����");
		for(int i=0 ; i<10 ; i++) {
			score[i]=sc.nextInt();
		}
		
		for(int i=1 ; i<score.length ; i++) {
			if(score[0]<score[i]) {
				score[0]=score[i];
			}
		}
		System.out.println("MaxNum:"+score[0]);
	}
	
	//��������ƽ��ֵ
	public static void demo2() {
		int [] arr = new int[] {9,6,11,34,10,2};		
		double sum = 0;
		boolean  flag= true;
		Scanner supermen = new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
			sum +=arr[i];
		}
		System.out.println();
		System.out.println("ƽ��ֵΪ��"+(sum/arr.length));
		
		System.out.println("����һ������");
		int  a = supermen.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			if(a==arr[i]) {
				flag = false;
				System.out.println(arr[i]+"  ���±�Ϊ��  "+i);
				break;
			}
		}
		if(flag) {
			System.out.println("���ֲ�������������");
		}
		
		
	}
	
	public static void shuzujt() {
		//��̬��ʼ���� �����ƶ�ֵ�б��� ϵͳ�����С��
		//����һ
		int [] arr = new int[] {11,22,23};
		System.out.println(arr.length);
		//������
		int [] arr2 = {11,54,3548};//ֻ��дһ��
		
		for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	
	public static void shuzudt() {
		//����һ������
		int [] arr;
		//��ʼ��                      �����С
		arr  = new int [3];
		/*
		 * ��̬��ʼ��
		 * ������0
		 * ���㣺0
		 * ������false
		 * �ַ���'\u0000'
		 * String��null(�����������͵ĳ�ʼֵ)
		 * 
		 */
		Scanner supermen = new Scanner(System.in);
		System.out.println("��������Ԫ��");
		for(int i=0; i<arr.length;i++) {
			arr[i] = supermen.nextInt();
		}
	
		System.out.println(arr.length);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		supermen.close();
	}
	
	public static void demo1() {
		
		Scanner sc = new Scanner(System.in);
		int score =0;
		int sum=0;
		for(int i=1;i<=6;i++) {
			System.out.println("������ɼ���");
			score = sc.nextInt();
			sum += score;
			}
		System.out.println(sum);
		
	}
}