package com.ghgj.lesson1.atm;

public class UserManger {
	User[]  um = new  User[1000];
	// 当前登录对象下标
	int  flag;
	public UserManger() {	
		User  a = new User("0001","3517827",50000);
		um[0] = a;
	}
	
	//查询
	public void xun() {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				break;
			}
			System.out.println(um[i]);
		}
	}
	//登录
	public boolean login(String number,String password) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				return false;
			}
			if(um[i].getNumber().equals(number)&&um[i].getPassword().equals(password)) {
				flag = i;
				return true;
			}	
		}
		return false;
	}
	// 添加 用户账户 密码
	public void addUser(User user) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				um[i]=user;
				System.out.println("开户成功！");
				System.out.println("卡号\t余额");
				System.out.println(um[i].getNumber()+"\t"+um[i].getMoney());
				break;
			}
		}
	}
	
	//1.存钱 
	public void addMoney(int money) {
		um[flag].addMoney(money);
		System.out.println("你成功存款"+money+"元");
		System.out.println("你当前余额为："+um[flag].getMoney());
		
	}
	//2.取钱	
	public void takeMoney(int money) {
		um[flag].takeMoney(money);
		System.out.println("你成功取款"+money+"元");
		System.out.println("你当前余额为："+um[flag].getMoney());
	}
	//3.转账	
	public boolean transfer(String number,int money) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				return false;
			}
			if(um[i].getNumber().equals(number)) {
				um[flag].takeMoney(money);
				um[i].addMoney(money);
				System.out.println(um[flag]);
				System.out.println(um[i]);
				return true;
			}
		}
		return false;
	}
	//4.查余额
	public void query() {
		System.out.println(um[flag]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
