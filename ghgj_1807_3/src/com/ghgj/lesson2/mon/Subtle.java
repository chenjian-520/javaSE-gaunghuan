package com.ghgj.lesson2.mon;

public class Subtle {
	String name;
	int lifeValue;
	int agressvity;
	
	public Subtle(String name, int lifeValue, int agressvity) {
		super();
		this.name = name;
		this.lifeValue = lifeValue;
		this.agressvity = agressvity;
	}

	public Subtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subtle [name=" + name + ", lifeValue=" + lifeValue + ", agressvity=" + agressvity + "]";
	}

	public void run() {
		System.out.println("ÒÆ¶¯");
	}

	public void play() {
		System.out.println("¹¥»÷");
	}
}
