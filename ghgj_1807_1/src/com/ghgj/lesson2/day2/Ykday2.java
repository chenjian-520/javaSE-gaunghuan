package com.ghgj.lesson2.day2;

public class Ykday2 {

	public static void main(String[] args) {
		Ykday2.socre();
		
	}
	
	public static void socre() {
		int socre = 64;
		String str = socre<60 ?  "c" :  socre>=90 ? "a":"b";
		System.out.println(str);
	}
	
	public static void guojing() {
		String name1="T��",name2="����Ь",name3="������";
		int price1=245,price2=570,price3=320;
		int num1=2,num2=1,num3=1;
		double sum=(price1*num1)+(price2*num2)+(price3*num3);
		int socre = (int)(sum*0.8)/100*3;
		System.out.println("************���ѵ�************");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println(name1+"\t��"+price1+"\t"+num1+"\t��"+(price1*num1));
		System.out.println(name2+"\t��"+price2+"\t"+num2+"\t��"+(price2*num2));
		System.out.println(name3+"\t��"+price3+"\t"+num3+"\t��"+(price3*num3));
		System.out.println();
		System.out.println("�ۿۣ�\t8��");
		System.out.println("����ܼ�\t��"+sum*0.8);
		System.out.println("ʵ�ʽɷ�\t��1500");
		System.out.println("��Ǯ\t��"+(1500-(sum*0.8)));
		System.out.println("���ι�������õĻ���Ϊ��"+socre);
	}
	public static void kehu() {
		String name1="����",name2="�";
		double price1=420.78,price2=45;
		int num1=1,num2=3;
		System.out.println("�ͻ�\t\t���ѽ��");
		System.out.println("����\t\t"+price1*0.95*num1);
		System.out.println("�\t\t"+price2*num2);
	}
	public static void phone() {
		String huawei = "��Ϊ��ҫ9";
		double size = 5.15;
		String dc = "����﮵��";
		int price = 2299;
		System.out.println(huawei);
		System.out.println(size+"Ӣ��");
		System.out.println(dc);
		System.out.println(price+"Ԫ");
	}

	public static void work1() {
		System.out.println("\tͼ�� �����嵥");
		System.out.println("��Ʒ����\t\t��������\t��Ʒ�۸�");
		int count1=1, count2=2, count3=3;
		int price1=55 ,price2=66 ,peice3=77;
		System.out.println("���������\t\t"+count1+"\t"+price1);
		System.out.println("java���˼��\t"+count2+"\t"+price2);
		System.out.println("���ݽṹ\t\t"+count3+"\t"+peice3);

	}
}
