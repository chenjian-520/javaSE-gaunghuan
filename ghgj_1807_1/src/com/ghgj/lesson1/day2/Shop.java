package com.ghgj.lesson1.day2;

import java.util.Scanner;

public class Shop {
	//��ʼ���˵���
	static Res res[] = new Res[5];
	//��ʼ���ͻ�
	static Client cl[] = new Client[10];
	
	public static void main(String[] args) {
		//��ʼ����Ʒ����
		res[0] = new Res("��Ƭ",28);
		res[1] = new Res("�������",18);
		res[2] = new Res("ƹ������",48);
		res[3] = new Res("����",68);
		res[4] = new Res("�綯����",578);
		
		Scanner sc = new Scanner(System.in);
		Scanner na = new Scanner(System.in);
		Scanner ag = new Scanner(System.in);
		Scanner se = new Scanner(System.in);
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;
		
		int i= 0;
		
		while(flag) {     //��һ��ѭ��
			
		Shop.print1();
		String dc = sc.nextLine();
		i++;
		if(dc.equals("1")) {
			System.out.println("����������û���Ϣ������ ����  �Ա� ");
			cl[i] = new Client(na.next(), ag.nextInt(), se.nextLine());
			
			if (i==10) { i = 0 ; }
			while(flag2) {   //�ڶ���ѭ��
			
			
			Shop.print2();
			String de = sc.nextLine();
			
			if(de.equals("1")) {
				flag1 = true;
				while(flag1) {    //������ѭ��
				Shop.print3();
				String dd = sc.nextLine();
				
				if(dd.equals("1")) {
					System.out.println("��ʾ���пͻ���Ϣ  ");
					for(int a =0 ; a<10; a++) {
						if(cl[a]!=null) {
						System.out.println("�û�������"+cl[a].name+"\t���䣺"+cl[a].age+"\t�Ա�"+cl[a].sex);
							}
						else {
							continue;
						}
						}
					}
				else if(dd.equals("2")) {
					System.out.println("���ӿͻ���Ϣ   ");
					System.out.println("����������û���Ϣ������ ����  �Ա� ");
					i++;
					cl[i] = new Client(na.next(), ag.nextInt(), se.nextLine());
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("3")) {
					System.out.println("�޸ĵ�ǰ�û�����ѡ�� �� 1  ");
					System.out.println("�޸ĵ�ǰ�û�����ѡ�� �� 2  ");
					System.out.println("�޸ĵ�ǰ�û��Ա�ѡ�� �� 3  ");
					System.out.println("�˳��޸���ѡ�� �� 4  ");
					int fg = 1;
					while(fg == 1) {
					   		String change = na.next();
					   		if (change.equals("1")) {System.out.println("������������");cl[i].setName(na.next());System.out.println("�޸ĳɹ�");}
					   		else if (change.equals("2")) {System.out.println("������������");cl[i].setAge(na.nextInt());System.out.println("�޸ĳɹ�");}
					   		else if (change.equals("3")) {System.out.println("���������Ա�");cl[i].setSex(na.next());System.out.println("�޸ĳɹ�");}
					   		else if (change.equals("4")) {fg = 0;}
					   		else {System.out.println("ѡ�����������ѡ��");}
					}
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("4")) {
					System.out.println("��ǰ�ͻ�������Ϣ���£�  ");
					for(int b=0; b<=4;b++) {
						System.out.println(res[b].resName+"\t\t"+res[b].resPrice);					
					}
					Shop.print3();
					dd = sc.nextLine();		}
				
				else if(dd.equals("5")) {
					System.out.println("������һ����  ");
					flag1=false;		}
				
				else {
					System.out.println("����ȷ����ѡ��ѡ�  ");
					Shop.print3();
					System.out.println("�밴������������˵���  ");
					 dd = sc.nextLine();}
				
				}
			}
			
			else if(de.equals("2")) {
				double sum = 0;
				System.out.println("�������");
				for(int b=0; b<=4;b++) {
					System.out.println(res[b].resName+"\t\t"+res[b].resPrice);			
					sum = res[b].resPrice+sum;		
				}
				System.out.println("������Ҫ���"+sum);
						print2();
				     de = sc.nextLine();
				     
				
			}
			else if(de.equals("3")) {
				System.out.println("������� ");
				    print2();
			     de = sc.nextLine();
				
			}
			else if(de.equals("4")) {
				System.out.println("ע�� ");
				break;
			}
			else {
				System.out.println("����ȷ������");
			}
			
			}
		}
		else if(dc.equals("2")) {
			System.out.println("�ɹ��˳��Ұ�Shopping����ϵͳ");
			flag = false;
			
		}
		else {
			System.out.println("����ȷ������");
		}
		
		
	}	
		
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
