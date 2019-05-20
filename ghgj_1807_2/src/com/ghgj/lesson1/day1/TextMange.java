package com.ghgj.lesson1.day1;

public class TextMange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.no = 11;
		stu1.name = "chenjian";
		stu1.score = 23;
		Student stu2 = new Student();
		stu2.no = 21;
		stu2.name = "cen";
		stu2.score = 444;
		Student stu3 = new Student();
		stu3.no = 31;
		stu3.name = "che";
		stu3.score = 255;
		
		Student [] stu =new Student[8];
		stu [0]=stu1;
		stu [1]=stu2;
		stu [2]=stu3;
		stu1.showSt(stu);
		
		int sum = TextMange.sunNum(stu);
			
		System.out.println("×Ü³É¼¨Îª£º"+sum);
		
		
		
	}

	public static int sunNum(Student [] stu) {
		int sum=0;
		for(int i=0;i<stu.length;i++) {
			if(stu[i]==null) {
				break;
			}
			sum+=stu[i].score;
	   }
		return sum;
	}
}
