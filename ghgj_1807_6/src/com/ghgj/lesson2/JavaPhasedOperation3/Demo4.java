package com.ghgj.lesson2.JavaPhasedOperation3;

class Student{
	private String sNo;
	private String sName;
	private String sSex;
	private int sAge;
	private int sJava;
	public Student(String sNo, String sName, String sSex, int sAge, int sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public String getsNo() {
		return sNo;
	}
	public String getsName() {
		return sName;
	}
	public String getsSex() {
		return sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public int getsJava() {
		return sJava;
	}
	
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("001","¹ù¾¸","ÄÐ",21,98);
		Student st2 = new Student("002","»ÆÈØ","Å®",20,95);
		Student st3 = new Student("003","Ñî¿µ","ÄÐ",21,84);
		Student st4 = new Student("004","ÑîÃ÷","ÄÐ",18,78);
		Student st5 = new Student("005","Áõç÷","Å®",16,100);
		Student [] arr = new Student[] {st1,st2,st3,st4,st5};
		double sum =0 ,max = arr[0].getsJava(),min =arr[0].getsJava();
		for(int i=0;i<5;i++) {
			sum+=arr[i].getsJava();
			if(max<arr[i].getsJava()) {
				max = arr[i].getsJava();
			}if(min>arr[i].getsJava()) {
				min = arr[i].getsJava();
			}
		}
		System.out.println(sum +"..."+max+"..."+min);
	
	}

}
