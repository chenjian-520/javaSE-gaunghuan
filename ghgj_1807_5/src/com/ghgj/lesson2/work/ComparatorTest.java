package com.ghgj.lesson2.work;

import java.util.Arrays;
import java.util.Comparator;

class Member implements Comparable<Member>{
	private String name ;
	private int number;
	private int inte;
	public Member(String name, int number, int inte) {
		super();
		this.name = name;
		this.number = number;
		this.inte = inte;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public int getInte() {
		return inte;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", number=" + number + ", inte=" + inte + "]";
	}
	@Override
	public int compareTo(Member o) {
		return this.number-o.getNumber();
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] meb= new Member[5];
		Member me1 = new Member("chen",151,180);
		Member me2 = new Member("chen1",211,150);
		Member me3 = new Member("chen2",101,980);
		Member me4 = new Member("chen3",511,480);
		Member me5 = new Member("chen4",111,880);
		meb[0]=me1;meb[1]=me2;meb[2]=me3;
		meb[3]=me4;meb[4]=me5;		
		Arrays.sort(meb);
		for(Member a: meb) {
			System.out.println(a);
		}
		System.out.println("--------------------------");
		Arrays.sort(meb, (st1,st2)->{
			return st1.getInte()-st2.getInte();
		});
		
		for(Member a: meb) {
			System.out.println(a);
		}
	}

}
