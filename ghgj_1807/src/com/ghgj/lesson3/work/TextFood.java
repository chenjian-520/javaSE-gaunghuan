package com.ghgj.lesson3.work;

import java.util.Scanner;

import com.ghgj.lesson3.workteacher.OrderInfo;

public class TextFood {
	
	static Foodinfo food[] = new Foodinfo[4];//����˵� ��������
	static Foodinfo foodin[] = new Foodinfo[4];//����˵� ��������
	//��ʼ������
	static Orderinfo orderInfo1[] = new Orderinfo[5];
	
	public static void main(String[] args) {
		
	
		//���߼�����
		boolean b=true;
		while(b) {
			print();			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();	

			switch(i) {
			case 1:oredfood();break;
			case 2:menu();break;
			case 3:indent();break;
			case 6:System.out.println("�˳�ϵͳ");b=false;break;
			default:break;
			}
			
		
			
		}

	}
	
  //1��Ҫ����
	public static void oredfood() {
		
		System.out.println("***��Ҫ����***");
		System.out.println("�����붩����������");	
		
		Scanner na = new Scanner(System.in);
		String name =na.next();
			
		
		Foodinfo fd = new Foodinfo("chen", 00);
		boolean flag =true;
		while(flag) {
			System.out.println("����0���أ�");
			fd.menu();
			System.out.println("����5������");
			//��ȡ�û�����Ĳ�Ʒ���
			System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
			
			Scanner sc = new Scanner(System.in);
			int b = sc.nextInt();
			
			if(b==1) {
				
				food[0] = new Foodinfo("������˿", 38);
				//��ȡ�û�����Ĳ�Ʒ����
				System.out.println("��ѡ������Ҫ�ķ�����");
				int foodNum = sc.nextInt();
				food[0].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("����ˣ�"+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==2) {
				
				food[1] = new Foodinfo("������", 48);
				//��ȡ�û�����Ĳ�Ʒ����
				System.out.println("��ѡ������Ҫ�ķ�����");
				int foodNum = sc.nextInt();
				food[1].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("����ˣ�"+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==3) {
				
				food[2] = new Foodinfo("�峴����", 18);
				//��ȡ�û�����Ĳ�Ʒ����
				System.out.println("��ѡ������Ҫ�ķ�����");
				int foodNum = sc.nextInt();
				food[2].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("����ˣ�"+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==4) {
				
				food[3] = new Foodinfo("�峴�ײ�", 18);
				//��ȡ�û�����Ĳ�Ʒ����
				System.out.println("��ѡ������Ҫ�ķ�����");
				int foodNum = sc.nextInt();
				food[3].num = foodNum;
				
					for(int i=0 ;i<4;i++) {
						if(food[i]!=null) {
					System.out.println("����ˣ�"+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
					}
				}	
			}
			if(b==5) {
			
				
				//��ȡ�û�������Ͳ�ʱ��
				System.out.println("�������Ͳ�ʱ�䣺");
				Scanner sc1 = new Scanner(System.in);
				String foodTime = sc1.next();
				//��ȡ�û�������Ͳ͵�ַ
				System.out.println("�������Ͳ͵�ַ��");
				String foodAddress = sc1.next();
				
				//����һ���µĶ���
				Orderinfo ord= new Orderinfo(name,
										food[0].name,
										food[0].price,
										food[0].num
										,foodTime,foodAddress);
				//�жϲʹ������Ƿ���λ�÷��ö���
				for(int i=0;i<orderInfo1.length;i++){
					if(orderInfo1[i] == null){
						orderInfo1[i] = ord;  break;
					}
				}
				
				System.out.println("���ͳɹ���");
				System.out.println("�������ǣ�"+orderInfo1[0].foodName+orderInfo1[0].foodNum+
								"��\n�Ͳ�ʱ�䣺"+orderInfo1[0].foodTime+"\n�ͷѣ�"+
								orderInfo1[0].foodNum*orderInfo1[0].foodPrice);
			}
	
			if(b==0) {
				flag=false;
			}	
			}
			
	}
	
	// 2�鿴�˵�
	public static void menu() {
		//��ʼ���˵�
		foodin[0] = new Foodinfo("������˿", 38);
		foodin[1] = new Foodinfo("������", 48);
		foodin[2] = new Foodinfo("�峴����", 18);
		foodin[3] = new Foodinfo("�峴�ײ�", 18);
						
		boolean flag =true;
		while(flag) {

		for(int i=0 ;i<4;i++) {
			System.out.println("�˵���"+(i+1)+foodin[i].name+"   "+foodin[i].price);
		}
	
		System.out.println("����0���أ�");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
	
		if(s==0) {
			flag=false;
		  }
		
		}
	}
	
	//3ǩ�ն���
	public static void indent() {
		System.out.println("�������㶩�����֣�");
		Scanner sc4 = new Scanner(System.in);
		String sds = sc4.next();
		for(int i=0; i<4; i++) {
			System.out.println(orderInfo1[i].usrName);
			if((orderInfo1[i].usrName).equals(sds)){
				System.out.println("��ϲ"+orderInfo1[i].usrName+"ǩ�ն����ɹ�");
				orderInfo1[i] = null;

			    }
			}
		
	}
	
	//��ӡ��ʽ
	public static void print() {
		
		System.out.println("��ӭʹ��С�󹫲�����ϵͳ");
		System.out.println("*****************************");
		System.out.println("1:��Ҫ����");
		System.out.println("2:�鿴�˵�");
		System.out.println("3:ǩ�ն���");
		System.out.println("4:ɾ������");
		System.out.println("5:��Ҫ����");
		System.out.println("6:�˳�ϵͳ");
		System.out.println("*****************************");
		System.out.println("��ѡ��");
	}
	
	
}
