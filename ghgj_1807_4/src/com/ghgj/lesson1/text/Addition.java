package com.ghgj.lesson1.text;

public class Addition {
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public long add(long n1,long n2) {
		return n1+n2;
	}
	public float add(float n1,float n2) {
		return n1+n2;
	}
	public double add(double n1,double n2) {
		return n1+n2;
	}
	public String add(String n1,String n2) {
		return n1+n2;
	}
	
	public static void main(String[] args) {
		Addition  a = new Addition();
		System.out.println(a.add(12, 32));
		System.out.println(a.add(12l, 32l));
		System.out.println(a.add(1285.f, 325f));
		System.out.println(a.add(12.0, 32.0));
		System.out.println(a.add("sf", "sfs"));
	}
	
}
