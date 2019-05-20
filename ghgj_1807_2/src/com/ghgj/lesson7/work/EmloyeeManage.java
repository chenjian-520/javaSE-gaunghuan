package com.ghgj.lesson7.work;

public class EmloyeeManage {
	Emloyee [] emloyee = new Emloyee[100];
	
	
	public int addwage() {  //计算工资
		int sum =0;
		for(int i =0;i<emloyee.length;i++) {
			if(emloyee[i]==null) {
				break;
			}
			sum+=emloyee[i].wage;
		}
		return sum;
	}
	
	public int addheight() {  //计算身高
		int sum =0;
		for(int i =0;i<emloyee.length;i++) {
			if(emloyee[i]==null) {
				break;
			}
			sum+=emloyee[i].height;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emloyee n1 = new Emloyee();
		Emloyee n2 = new Emloyee();
		EmloyeeManage em = new EmloyeeManage();
		n1.height=160;
		n2.height=170;
		em.emloyee[0] =n1;
		em.emloyee[1] =n2;
		System.out.println(em.emloyee[0].toString());
		System.out.println(em.addheight());
	}
}
