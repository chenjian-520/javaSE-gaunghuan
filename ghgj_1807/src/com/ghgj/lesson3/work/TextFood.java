package com.ghgj.lesson3.work;

import java.util.Scanner;

import com.ghgj.lesson3.workteacher.OrderInfo;

public class TextFood {
	
	static Foodinfo food[] = new Foodinfo[4];//所点菜单 储存数组
	static Foodinfo foodin[] = new Foodinfo[4];//所点菜单 储存数组
	//初始化订单
	static Orderinfo orderInfo1[] = new Orderinfo[5];
	
	public static void main(String[] args) {
		
	
		//主逻辑代码
		boolean b=true;
		while(b) {
			print();			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();	

			switch(i) {
			case 1:oredfood();break;
			case 2:menu();break;
			case 3:indent();break;
			case 6:System.out.println("退出系统");b=false;break;
			default:break;
			}
			
		
			
		}

	}
	
  //1我要订餐
	public static void oredfood() {
		
		System.out.println("***我要订餐***");
		System.out.println("请输入订餐人姓名：");	
		
		Scanner na = new Scanner(System.in);
		String name =na.next();
			
		
		Foodinfo fd = new Foodinfo("chen", 00);
		boolean flag =true;
		while(flag) {
			System.out.println("输入0返回：");
			fd.menu();
			System.out.println("输入5点菜完毕");
			//获取用户输入的菜品编号
			System.out.println("请选择您要点的菜品编号：");
			
			Scanner sc = new Scanner(System.in);
			int b = sc.nextInt();
			
			if(b==1) {
				
				food[0] = new Foodinfo("鱼香肉丝", 38);
				//获取用户输入的菜品数量
				System.out.println("请选择您需要的份数：");
				int foodNum = sc.nextInt();
				food[0].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("所点菜："+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==2) {
				
				food[1] = new Foodinfo("红烧肉", 48);
				//获取用户输入的菜品数量
				System.out.println("请选择您需要的份数：");
				int foodNum = sc.nextInt();
				food[1].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("所点菜："+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==3) {
				
				food[2] = new Foodinfo("清炒土豆", 18);
				//获取用户输入的菜品数量
				System.out.println("请选择您需要的份数：");
				int foodNum = sc.nextInt();
				food[2].num = foodNum;
				
				for(int i=0 ;i<4;i++) {
					if(food[i]!=null) {
				System.out.println("所点菜："+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
				}
			}
			}
			if(b==4) {
				
				food[3] = new Foodinfo("清炒白菜", 18);
				//获取用户输入的菜品数量
				System.out.println("请选择您需要的份数：");
				int foodNum = sc.nextInt();
				food[3].num = foodNum;
				
					for(int i=0 ;i<4;i++) {
						if(food[i]!=null) {
					System.out.println("所点菜："+(i+1)+food[i].name+"\t"+food[i].num+"\t"+food[i].price);
					}
				}	
			}
			if(b==5) {
			
				
				//获取用户输入的送餐时间
				System.out.println("请输入送餐时间：");
				Scanner sc1 = new Scanner(System.in);
				String foodTime = sc1.next();
				//获取用户输入的送餐地址
				System.out.println("请输入送餐地址：");
				String foodAddress = sc1.next();
				
				//创建一个新的订单
				Orderinfo ord= new Orderinfo(name,
										food[0].name,
										food[0].price,
										food[0].num
										,foodTime,foodAddress);
				//判断餐袋里面是否还有位置放置订单
				for(int i=0;i<orderInfo1.length;i++){
					if(orderInfo1[i] == null){
						orderInfo1[i] = ord;  break;
					}
				}
				
				System.out.println("订餐成功！");
				System.out.println("您订的是："+orderInfo1[0].foodName+orderInfo1[0].foodNum+
								"份\n送餐时间："+orderInfo1[0].foodTime+"\n餐费："+
								orderInfo1[0].foodNum*orderInfo1[0].foodPrice);
			}
	
			if(b==0) {
				flag=false;
			}	
			}
			
	}
	
	// 2查看菜单
	public static void menu() {
		//初始化菜单
		foodin[0] = new Foodinfo("鱼香肉丝", 38);
		foodin[1] = new Foodinfo("红烧肉", 48);
		foodin[2] = new Foodinfo("清炒土豆", 18);
		foodin[3] = new Foodinfo("清炒白菜", 18);
						
		boolean flag =true;
		while(flag) {

		for(int i=0 ;i<4;i++) {
			System.out.println("菜单："+(i+1)+foodin[i].name+"   "+foodin[i].price);
		}
	
		System.out.println("输入0返回：");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
	
		if(s==0) {
			flag=false;
		  }
		
		}
	}
	
	//3签收订单
	public static void indent() {
		System.out.println("请输入你订单名字：");
		Scanner sc4 = new Scanner(System.in);
		String sds = sc4.next();
		for(int i=0; i<4; i++) {
			System.out.println(orderInfo1[i].usrName);
			if((orderInfo1[i].usrName).equals(sds)){
				System.out.println("恭喜"+orderInfo1[i].usrName+"签收订单成功");
				orderInfo1[i] = null;

			    }
			}
		
	}
	
	//打印格式
	public static void print() {
		
		System.out.println("欢迎使用小麦公博订餐系统");
		System.out.println("*****************************");
		System.out.println("1:我要订餐");
		System.out.println("2:查看菜单");
		System.out.println("3:签收订单");
		System.out.println("4:删除订单");
		System.out.println("5:我要点赞");
		System.out.println("6:退出系统");
		System.out.println("*****************************");
		System.out.println("请选择：");
	}
	
	
}
