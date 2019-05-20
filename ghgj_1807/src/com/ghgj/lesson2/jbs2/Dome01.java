package com.ghgj.lesson2.jbs2;

public class Dome01 {
	
	
	
	public static void main(String[] args) {
	
		// 苹果笔记本
		 String macBrand = "MacBookAir";
		 double macSize = 13.3;
		 double macPrice = 6988.88;
		 int macCount = 5;

		// 联想笔记本 Thinkpad
		 String thinkpadBrand = "ThinkpadT450";
		 double thinkpadSize = 14.0;
		 double thinkpadPrice = 5999.99;
		 int thinkpadCount = 10;

		// 华硕ASUS笔记本电脑
		 String ASUSBrand = "ASUS-FL5800";
		 double ASUSSize = 15.6;
		 double ASUSPrice = 4999.50;
		 int ASUSCount = 18;

		// 统计库存总个数、库存总金额
		 int totalCount = macCount + thinkpadCount + ASUSCount;
		 double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

		// 列表顶部
		System.out.println("------------------------------商城库存清单-----------------------------");
		System.out.println("品牌型号	尺寸	价格	库存数");
		// 列表中部
		System.out.println(macBrand + "	" + macSize + "	" + macPrice + "	" + macCount);
		System.out.println(thinkpadBrand + "	" + thinkpadSize + "	" + thinkpadPrice + "	" + thinkpadCount);
		System.out.println(ASUSBrand + "	" + ASUSSize + "	" + ASUSPrice + "	" + ASUSCount);
		// 列表底部
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("总库存数：" + totalCount);
		System.out.println("库存商品总金额：" + totalMoney);

	}




}
