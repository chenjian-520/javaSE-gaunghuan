package com.ghgj.lesson1.day1;

public class Student {
	
	int no;
	String name;
	int score;
	public String show() {
		return no+" ,"+name +" ,"+score;
	}
	
	public void showSt(Student[] stu) {
		for(int i=0 ; i<=stu.length;i++) {
			if(stu[i]==null) {
				break;
			}
			System.out.println(stu[i].show());
		}
		
	
		
	}
	
}

