package com.ghgj.lesson4.mapShop;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;

public class Market {
	
	public static void main(String[] args) {
		Market.menu();
		mk.funstion1();
	}
	static Market mk = new Market();
	static	HashMap<Integer,Goods> map = new HashMap<>();
	static  HashMap<Integer,Goods> myMap = new HashMap<>();
	public static void menu() {
		System.out.println("*************************�˵�*************************");
		System.out.println("1.���빺�ﳵ       2.�޸���Ʒ       3.ɾ����Ʒ       4.��ѯ���ﳵ   5.�鿴����    6.�˳�");
		System.out.println("*************************�˵�*************************");
		Goods a=new Goods(1,"����",18,100);
		Goods b=new Goods(2,"����",6,100);
		Goods c=new Goods(3,"�㳦",3,100);
		Goods d=new Goods(4,"�ȹ�",14,100);
		Goods e=new Goods(5,"����",12,100);
		map.put(a.getNumber(), a);
		map.put(b.getNumber(), b);
		map.put(c.getNumber(), c);
		map.put(d.getNumber(), d);
		map.put(e.getNumber(), e);
		System.out.println("���\t����\t����\t����");
		map.values().forEach(System.out::println);
		System.out.println("**************************************");
		
	}

	public void  funstion1() {
	
		int number;
		int many;
		while(true) {
			System.out.print("*����˵�ѡ��:");
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("����ѡ����Ʒ���:");
			number = sc.nextInt();
			System.out.print("���빺����Ʒ����:");
			many = sc.nextInt();
			mk.add(number,many);
			break;
		case 2:
			System.out.print("�����޸���Ʒ���:");
			number = sc.nextInt();
			System.out.print("�����µ���Ʒ����:");
			many = sc.nextInt();
			mk.take(number,many);
			break;
		case 3:
			System.out.print("����ɾ����Ʒ���:");
			number = sc.nextInt();
			mk.delete(number);
			break;
		case 4:mk.query();
			break;
		case 5:
			System.out.println("******************������Ʒ****************");
			System.out.println("���\t����\t����\t����");
			map.values().forEach(System.out::println);
			System.out.println("**************************************");
			break;
		case 6:
			System.out.println("�˳��ɹ�");
			System.exit(0);
			break;
		default:
			System.out.println("�������");
			break;
		}
	}	
}
	//���
	public void add(int number,int many) {
		if(number<=5) {
		int a=map.get(number).getMany()-many;
		map.get(number).setMany(a);
		Goods goods = new Goods(map.get(number).getNumber()
				,map.get(number).getName()
				,map.get(number).getPrice(),many);
		myMap.put(number,goods);	
		}else{
			System.out.println("�������");
		}
	}
	//�޸�
	public void take(int number, int many) {
		if(number<=5) {
		myMap.values().forEach(new Consumer<Goods>() {
			
			@Override
			public void accept(Goods t) {
				// TODO Auto-generated method stub
				if(t.getNumber()==number) {
					t.setMany(many);
					System.out.println("�޸ĳɹ���");
					
				}
			}
			
		});   }else {
			System.out.println("�������");
		}
		
	}
	//ɾ��
	public void delete(int number) {
		for(Goods a:myMap.values()) {
			if(a.getNumber()==number) {
				myMap.remove(number);
				System.out.println("ɾ���ɹ�");
				break;
			}
		}
	}
	//��ѯ
	public void query() {
		System.out.println("���\t����\t����\t����");
		myMap.values().forEach(System.out::println);
		System.out.println("**************************************");
		
	}
	
	
	
	
	
	
}
