package com.ghgj.lesson2.day3;

import java.util.Scanner;


public class Shop1 {
	public static void main(String[] agrs) {
		Shop1.demo6();
		
	}
	
	public static void demo6() {
		
		System.out.println("���������ѽ��");
		Scanner sc = new Scanner(System.in);
		double money = sc.nextInt();
		
		System.out.println("�Ƿ�μӻ������");
		System.out.println("1:��50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2:��100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3:��100Ԫ����10Ԫ����5�������");
		System.out.println("4:��200Ԫ����10Ԫ����һ���ղ������˹�");
		System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮ����һƿ");
		System.out.println("0:������");
		System.out.println("��ѡ��");
		int  xz = sc.nextInt();
		
		if(xz == 0) {
			System.out.println("�������ѽ��Ϊ��"+money);
		}else if(money<50) {
			switch(xz) {
			case 1:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 2:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 3:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 4:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 5:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			default:System.out.println("����ʧ�ܣ�");
			break;
				
			}
		}else if(money<100) {
			switch(xz) {
			case 1:System.out.println("�������ѽ��Ϊ��"+(money+2));
					System.out.println("�ɹ��������¿�������һƿ");
				break;
			case 2:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 3:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 4:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 5:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			default:System.out.println("����ʧ�ܣ�");
			break;
			}
		}else if(money<200) {
			switch(xz) {
			case 1:System.out.println("�������ѽ��Ϊ��"+(money+2));
				   System.out.println("�ɹ��������¿�������һƿ");
				break;
			case 2:System.out.println("�������ѽ��Ϊ��"+(money+3));
			       System.out.println("�ɹ�����500ml����һƿ");
				break;
			case 3:System.out.println("�������ѽ��Ϊ��"+(money+10));
				   System.out.println("�ɹ�����5�������");
				break;
			case 4:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			case 5:System.out.println("�������ѽ��Ϊ��"+money);
			System.out.println("����ʧ�ܣ�");
				break;
			default:System.out.println("����ʧ�ܣ�");
			break;
			}
		}else if (money>=200) {
			switch(xz) {
			case 1:System.out.println("�������ѽ��Ϊ��"+(money+2));
				   System.out.println("�ɹ��������¿�������һƿ");
				break;
			case 2:System.out.println("�������ѽ��Ϊ��"+(money+3));
			       System.out.println("�ɹ�����500ml����һƿ");
				break;
			case 3:System.out.println("�������ѽ��Ϊ��"+(money+10));
				   System.out.println("�ɹ�����5�������");
				break;
			case 4:System.out.println("�������ѽ��Ϊ��"+(money+10));
				   System.out.println("�ɹ�����һ���ղ������˹�");
				break;
			case 5:System.out.println("�������ѽ��Ϊ��"+(money+20));
				   System.out.println("�ɹ�����ŷ����ˬ��ˮ����һƿ");
				break;
			default:System.out.println("����ʧ�ܣ�");
			break;
			}
		}
	}
	
	public static void zhekou() {
		double money = 0;
		Scanner sc = new Scanner(System.in);	
		System.out.println("�������Ƿ��ǻ�Ա���ǣ�y���������ַ���");
		String st= sc.next();
		if(st.equals("y")) {
			System.out.println("�����빺���");
			double db = sc.nextDouble();
			if(db>200) {
				money = db*0.75;
			}else{
				money = db*0.8;
			}
			System.out.println("ʵ��֧����"+money);
		}else {
			System.out.println("�����빺���");
			double db = sc.nextDouble();
			if(db>200) {
				money = db*0.9;
			}else{
				money = db;
			}
			System.out.println("ʵ��֧����"+money);
		}
	}
	
	public static void money() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int mon = sc.nextInt();
		double sum = mon+mon*0.04+mon*0.02;
		System.out.print("ʵ�ʷ��Ĺ���Ϊ��"+sum);
	}
	public static void luck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա���ţ�");
		int care = sc.nextInt();
		if( (care/1000)+(care/100%10)+(care/10%10)+(care%10)>20 )
		{
			System.out.println("��ϲ���Ϊ���˻�Ա��");
		}
		else {System.out.println("��ӭ�´ι��٣�");}
		
	}
	
	public static void print1() {
		System.out.println("***********�Ұ�Shopping����ϵͳ*************");
		System.out.println("             1.��¼ϵͳ                                                           ");
		System.out.println("             2.�˳�ϵͳ                                                           ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
	}
	
	public static void print2() {
		System.out.println("           �Ұ�Shopping����ϵͳ                                       ");
		System.out.println("****************************************");
		System.out.println("             1.�ͻ���Ϣ����                                                    ");
		System.out.println("             2.�������                                                           ");
		System.out.println("             3.�������                                                           ");
		System.out.println("             4.ע��                                                                   ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
	}
	
	public static void print3() {
		System.out.println("     �Ұ�Shopping����ϵͳ>>�ͻ���Ϣ����                           ");
		System.out.println("****************************************");
		System.out.println("             1.��ʾ���пͻ���Ϣ                                           ");
		System.out.println("             2.���ӿͻ���Ϣ                                                   ");
		System.out.println("             3.�޸�                                                                   ");
		System.out.println("             4.��ѯ�ͻ���Ϣ                                                   ");
		System.out.println("             5.������һ����                                                   ");
		System.out.println("****************************************");
		System.out.println("***����ѡ��");
	}

}