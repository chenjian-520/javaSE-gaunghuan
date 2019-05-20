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
		String name1="T恤",name2="网球鞋",name3="网球拍";
		int price1=245,price2=570,price3=320;
		int num1=2,num2=1,num3=1;
		double sum=(price1*num1)+(price2*num2)+(price3*num3);
		int socre = (int)(sum*0.8)/100*3;
		System.out.println("************消费单************");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println(name1+"\t￥"+price1+"\t"+num1+"\t￥"+(price1*num1));
		System.out.println(name2+"\t￥"+price2+"\t"+num2+"\t￥"+(price2*num2));
		System.out.println(name3+"\t￥"+price3+"\t"+num3+"\t￥"+(price3*num3));
		System.out.println();
		System.out.println("折扣：\t8折");
		System.out.println("金额总计\t￥"+sum*0.8);
		System.out.println("实际缴费\t￥1500");
		System.out.println("找钱\t￥"+(1500-(sum*0.8)));
		System.out.println("本次购物所获得的积分为："+socre);
	}
	public static void kehu() {
		String name1="郭靖",name2="杨康";
		double price1=420.78,price2=45;
		int num1=1,num2=3;
		System.out.println("客户\t\t消费金额");
		System.out.println("郭靖\t\t"+price1*0.95*num1);
		System.out.println("杨康\t\t"+price2*num2);
	}
	public static void phone() {
		String huawei = "华为荣耀9";
		double size = 5.15;
		String dc = "内置锂电池";
		int price = 2299;
		System.out.println(huawei);
		System.out.println(size+"英寸");
		System.out.println(dc);
		System.out.println(price+"元");
	}

	public static void work1() {
		System.out.println("\t图书 购买清单");
		System.out.println("商品名称\t\t购买数量\t商品价格");
		int count1=1, count2=2, count3=3;
		int price1=55 ,price2=66 ,peice3=77;
		System.out.println("计算机基础\t\t"+count1+"\t"+price1);
		System.out.println("java编程思想\t"+count2+"\t"+price2);
		System.out.println("数据结构\t\t"+count3+"\t"+peice3);

	}
}
