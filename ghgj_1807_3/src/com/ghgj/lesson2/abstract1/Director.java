package com.ghgj.lesson2.abstract1;

public class Director extends Employee { //董事类  继承 员工类
	

	public Director(int id, int sex, String name, String duty, double salary, int holidays) {
		super(id, sex, name, duty, salary, holidays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSbsidy(int day) {
		// TODO Auto-generated method stub
		if(day<=3) {
			return 30*(30-day);
		}else {
			return 20*(30-day);
		}
	}

}
