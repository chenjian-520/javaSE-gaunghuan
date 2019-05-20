package com.ghgj.lesson3.workteacher;

import java.util.Scanner;

public class TestFood {
	
	//初始化菜单
	static FoodInfo foodInfo[] = new FoodInfo[3];
	//初始化订单
	static OrderInfo orderInfo[] = new OrderInfo[5];
	
	public static void main(String[] args) {
		
		foodInfo[0] = new FoodInfo("小炒肉",38,0);
		foodInfo[1] = new FoodInfo("番茄鸡蛋",50,0);
		foodInfo[2] = new FoodInfo("酸辣土豆丝",28,0);
		
		
		
		
		boolean flag = true;
		while(flag){
			System.out.println("欢迎使用“吃货联盟订餐系统”");
			System.out.println("********************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("********************");
			
			System.out.println("请选择：");
			Scanner sc = new Scanner(System.in);
			
			
			String oerderType = sc.nextLine();
			//判断用户选择的类型
			if("1".equals(oerderType)){
				choseFood(sc);
			}else if("2".equals(oerderType)){
				viewOrder();
			}else if("3".equals(oerderType)){
				System.out.println("签收订单");
			}else if("4".equals(oerderType)){
				System.out.println("删除订单");
			}else if("6".equals(oerderType)){
				flag = false;
			}
			
		}
		
	}
	/**
	 * 我要订餐
	 * @param sc
	 */
	public static void choseFood(Scanner sc){
		System.out.println("******我要订餐******");
		System.out.println("请输入订餐人姓名：");
		//获取用户输入的订单人名
		String orderUserName = sc.nextLine();
		System.out.println("序号\t菜名\t单价\t点赞数");
		for(int i=0;i<foodInfo.length;i++){
			System.out.println(i+1 + "\t" + foodInfo[i].foodName+ "\t" 
							+foodInfo[i].price+"\t"+foodInfo[i].likeNum);
			
		}
		//获取用户输入的菜品编号
		System.out.println("请选择您要点的菜品编号：");
		String foodNo = sc.nextLine();
		//获取用户输入的菜品数量
		System.out.println("请选择您需要的份数：");
		String foodNum = sc.nextLine();
		//获取用户输入的送餐时间
		System.out.println("请输入送餐时间：");
		String foodTime = sc.nextLine();
		//获取用户输入的送餐地址
		System.out.println("请输入送餐地址：");
		String foodAddress = sc.nextLine();
		
		//创建一个新的订单
		OrderInfo order= new OrderInfo(orderUserName,
								foodInfo[Integer.parseInt(foodNo)-1].foodName,
								foodInfo[Integer.parseInt(foodNo)-1].price,
								Integer.parseInt(foodNum),
								foodTime,foodAddress);
		//判断餐袋里面是否还有位置放置订单
		for(int i=0;i<orderInfo.length;i++){
			if(orderInfo[i] == null){
				orderInfo[i] = order;
			}
		}
		
		System.out.println("订餐成功！");
		System.out.println("您订的是："+orderInfo[0].foodName+orderInfo[0].foodNum+
						"份\n送餐时间："+orderInfo[0].foodTime+"\n餐费："+
						orderInfo[0].foodNum*orderInfo[0].foodPrice);
		
	}
	/**
	 * 查看餐袋
	 */
	public static void viewOrder(){
		System.out.println("******查看餐袋*******");
		System.out.println("序号\t订餐人\t产品信息\t送餐时间\t送餐地址\t总金额");
		for(int i=0;i<orderInfo.length;i++){
			if(orderInfo[i] != null){
				System.out.println(i+1 + "\t"+ orderInfo[i].foodName);
			}
			
		}
	}
}
