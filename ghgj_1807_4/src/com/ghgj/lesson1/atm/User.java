package com.ghgj.lesson1.atm;

public class User {
	private String number;
	private String password;
	private int money;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String number, String password, int money) {
		super();
		this.number = number;
		this.password = password;
		this.money = money;
	}
	
	public User(String number, String password) {
		super();
		this.number = number;
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	
	//¥Ê«Æ
	public void addMoney(int money) {
		this.money += money;
	}
	
	//»°«Æ
	public void takeMoney(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {
		return "User [number=" + number + ", password=" + password + ", money=" + money + "]";
	}
	
	
	
}
