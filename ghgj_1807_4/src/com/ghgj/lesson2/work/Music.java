package com.ghgj.lesson2.work;

abstract public class Music {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Music(String name) {
		super();
		this.name = name;
	}
	public abstract void play();
}
