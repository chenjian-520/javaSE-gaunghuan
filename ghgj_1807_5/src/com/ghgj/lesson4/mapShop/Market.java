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
		System.out.println("*************************菜单*************************");
		System.out.println("1.加入购物车       2.修改商品       3.删除商品       4.查询购物车   5.查看超市    6.退出");
		System.out.println("*************************菜单*************************");
		Goods a=new Goods(1,"薯条",18,100);
		Goods b=new Goods(2,"饼干",6,100);
		Goods c=new Goods(3,"香肠",3,100);
		Goods d=new Goods(4,"热狗",14,100);
		Goods e=new Goods(5,"汉堡",12,100);
		map.put(a.getNumber(), a);
		map.put(b.getNumber(), b);
		map.put(c.getNumber(), c);
		map.put(d.getNumber(), d);
		map.put(e.getNumber(), e);
		System.out.println("编号\t名称\t单价\t数量");
		map.values().forEach(System.out::println);
		System.out.println("**************************************");
		
	}

	public void  funstion1() {
	
		int number;
		int many;
		while(true) {
			System.out.print("*输入菜单选择:");
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("输入选择商品编号:");
			number = sc.nextInt();
			System.out.print("输入购买商品数量:");
			many = sc.nextInt();
			mk.add(number,many);
			break;
		case 2:
			System.out.print("输入修改商品编号:");
			number = sc.nextInt();
			System.out.print("输入新的商品数量:");
			many = sc.nextInt();
			mk.take(number,many);
			break;
		case 3:
			System.out.print("输入删除商品编号:");
			number = sc.nextInt();
			mk.delete(number);
			break;
		case 4:mk.query();
			break;
		case 5:
			System.out.println("******************超市商品****************");
			System.out.println("编号\t名称\t单价\t数量");
			map.values().forEach(System.out::println);
			System.out.println("**************************************");
			break;
		case 6:
			System.out.println("退出成功");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}	
}
	//添加
	public void add(int number,int many) {
		if(number<=5) {
		int a=map.get(number).getMany()-many;
		map.get(number).setMany(a);
		Goods goods = new Goods(map.get(number).getNumber()
				,map.get(number).getName()
				,map.get(number).getPrice(),many);
		myMap.put(number,goods);	
		}else{
			System.out.println("输入错误！");
		}
	}
	//修改
	public void take(int number, int many) {
		if(number<=5) {
		myMap.values().forEach(new Consumer<Goods>() {
			
			@Override
			public void accept(Goods t) {
				// TODO Auto-generated method stub
				if(t.getNumber()==number) {
					t.setMany(many);
					System.out.println("修改成功！");
					
				}
			}
			
		});   }else {
			System.out.println("输入错误");
		}
		
	}
	//删除
	public void delete(int number) {
		for(Goods a:myMap.values()) {
			if(a.getNumber()==number) {
				myMap.remove(number);
				System.out.println("删除成功");
				break;
			}
		}
	}
	//查询
	public void query() {
		System.out.println("编号\t名称\t单价\t数量");
		myMap.values().forEach(System.out::println);
		System.out.println("**************************************");
		
	}
	
	
	
	
	
	
}
