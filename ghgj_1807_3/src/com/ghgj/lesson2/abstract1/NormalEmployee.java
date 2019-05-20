package com.ghgj.lesson2.abstract1;

public class NormalEmployee extends Employee { //普通员工类  继承员工类

	public NormalEmployee(int id, int sex, String name, String duty, double salary, int holidays) {
		super(id, sex, name, duty, salary, holidays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSbsidy(int day) {
		// TODO Auto-generated method stub
		if(day<=3) {
			return 20*(30-day);
		}else {
			return 15*(30-day);
		}
	}

}
