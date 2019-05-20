package com.ghgj.lesson3.workteacher;

import java.util.Scanner;

public class TestFood {
	
	//��ʼ���˵�
	static FoodInfo foodInfo[] = new FoodInfo[3];
	//��ʼ������
	static OrderInfo orderInfo[] = new OrderInfo[5];
	
	public static void main(String[] args) {
		
		foodInfo[0] = new FoodInfo("С����",38,0);
		foodInfo[1] = new FoodInfo("���Ѽ���",50,0);
		foodInfo[2] = new FoodInfo("��������˿",28,0);
		
		
		
		
		boolean flag = true;
		while(flag){
			System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
			System.out.println("********************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("********************");
			
			System.out.println("��ѡ��");
			Scanner sc = new Scanner(System.in);
			
			
			String oerderType = sc.nextLine();
			//�ж��û�ѡ�������
			if("1".equals(oerderType)){
				choseFood(sc);
			}else if("2".equals(oerderType)){
				viewOrder();
			}else if("3".equals(oerderType)){
				System.out.println("ǩ�ն���");
			}else if("4".equals(oerderType)){
				System.out.println("ɾ������");
			}else if("6".equals(oerderType)){
				flag = false;
			}
			
		}
		
	}
	/**
	 * ��Ҫ����
	 * @param sc
	 */
	public static void choseFood(Scanner sc){
		System.out.println("******��Ҫ����******");
		System.out.println("�����붩����������");
		//��ȡ�û�����Ķ�������
		String orderUserName = sc.nextLine();
		System.out.println("���\t����\t����\t������");
		for(int i=0;i<foodInfo.length;i++){
			System.out.println(i+1 + "\t" + foodInfo[i].foodName+ "\t" 
							+foodInfo[i].price+"\t"+foodInfo[i].likeNum);
			
		}
		//��ȡ�û�����Ĳ�Ʒ���
		System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
		String foodNo = sc.nextLine();
		//��ȡ�û�����Ĳ�Ʒ����
		System.out.println("��ѡ������Ҫ�ķ�����");
		String foodNum = sc.nextLine();
		//��ȡ�û�������Ͳ�ʱ��
		System.out.println("�������Ͳ�ʱ�䣺");
		String foodTime = sc.nextLine();
		//��ȡ�û�������Ͳ͵�ַ
		System.out.println("�������Ͳ͵�ַ��");
		String foodAddress = sc.nextLine();
		
		//����һ���µĶ���
		OrderInfo order= new OrderInfo(orderUserName,
								foodInfo[Integer.parseInt(foodNo)-1].foodName,
								foodInfo[Integer.parseInt(foodNo)-1].price,
								Integer.parseInt(foodNum),
								foodTime,foodAddress);
		//�жϲʹ������Ƿ���λ�÷��ö���
		for(int i=0;i<orderInfo.length;i++){
			if(orderInfo[i] == null){
				orderInfo[i] = order;
			}
		}
		
		System.out.println("���ͳɹ���");
		System.out.println("�������ǣ�"+orderInfo[0].foodName+orderInfo[0].foodNum+
						"��\n�Ͳ�ʱ�䣺"+orderInfo[0].foodTime+"\n�ͷѣ�"+
						orderInfo[0].foodNum*orderInfo[0].foodPrice);
		
	}
	/**
	 * �鿴�ʹ�
	 */
	public static void viewOrder(){
		System.out.println("******�鿴�ʹ�*******");
		System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��");
		for(int i=0;i<orderInfo.length;i++){
			if(orderInfo[i] != null){
				System.out.println(i+1 + "\t"+ orderInfo[i].foodName);
			}
			
		}
	}
}
