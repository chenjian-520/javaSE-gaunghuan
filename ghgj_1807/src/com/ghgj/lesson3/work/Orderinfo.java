package com.ghgj.lesson3.work;

public class Orderinfo {
	String usrName;
	String foodName;
	float foodPrice;
	int foodNum;
	String foodTime;
	String foodAddress;
	String orderStatus = "ÒÑÔ¤¶©";
	public Orderinfo(String usrName, String foodName,float foodPrice, int foodNum,
			String foodTime, String foodAddress) {
		super();
		this.usrName = usrName;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodNum = foodNum;
		this.foodTime = foodTime;
		this.foodAddress = foodAddress;
	}
	
	
}