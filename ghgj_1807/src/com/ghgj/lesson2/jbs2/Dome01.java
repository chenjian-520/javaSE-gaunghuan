package com.ghgj.lesson2.jbs2;

public class Dome01 {
	
	
	
	public static void main(String[] args) {
	
		// ƻ���ʼǱ�
		 String macBrand = "MacBookAir";
		 double macSize = 13.3;
		 double macPrice = 6988.88;
		 int macCount = 5;

		// ����ʼǱ� Thinkpad
		 String thinkpadBrand = "ThinkpadT450";
		 double thinkpadSize = 14.0;
		 double thinkpadPrice = 5999.99;
		 int thinkpadCount = 10;

		// ��˶ASUS�ʼǱ�����
		 String ASUSBrand = "ASUS-FL5800";
		 double ASUSSize = 15.6;
		 double ASUSPrice = 4999.50;
		 int ASUSCount = 18;

		// ͳ�ƿ���ܸ���������ܽ��
		 int totalCount = macCount + thinkpadCount + ASUSCount;
		 double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

		// �б���
		System.out.println("------------------------------�̳ǿ���嵥-----------------------------");
		System.out.println("Ʒ���ͺ�	�ߴ�	�۸�	�����");
		// �б��в�
		System.out.println(macBrand + "	" + macSize + "	" + macPrice + "	" + macCount);
		System.out.println(thinkpadBrand + "	" + thinkpadSize + "	" + thinkpadPrice + "	" + thinkpadCount);
		System.out.println(ASUSBrand + "	" + ASUSSize + "	" + ASUSPrice + "	" + ASUSCount);
		// �б�ײ�
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("�ܿ������" + totalCount);
		System.out.println("�����Ʒ�ܽ�" + totalMoney);

	}




}
