package com.ghgj.lesson1.shop;

public class User {
	private int number;
	private String name;
	private String type;
	private int integrals;

	public User() {

	}

	public User(int number, String name, String type, int integrals) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.integrals = integrals;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type.equals("½ğ¿¨") || type.equals("ÆÕÍ¨")) {
			this.type = type;
		} else {
			System.out.println("ÊäÈë´íÎó£¡");
		}

	}

	public int getIntegrals() {
		return integrals;
	}

	public void setIntegrals(int integrals) {
		this.integrals = integrals;
	}

	public void set(int number, String name, String type, int integrals) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.integrals = integrals;
	}

	public String show() {
		return number + "\t" + name + "\t" + type + "\t" + integrals;
	}

}
