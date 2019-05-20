package com.ghgj.lesson2.work;

import java.util.Arrays;
import java.util.Comparator;

class Demo1 {
	public void f(Point<String> p) {
	}

	// public void f(Point<Integer> p) {}
	<T> void f(T t) {
	} // Object

	<T extends Number> void f(T t) {
	}// Number

	<T extends Point1 & II> void f(T t) {
	}// Point1
}

interface Info<T> {
	void af(T t);
}

class Am implements Info<String> {
	@Override
	public void af(String t) {
		// TODO Auto-generated method stub

	}
}

class Am2<T> implements Info<T> {
	@Override
	public void af(T t) {
		System.out.println("ff");
	};
}

 //自定义比较器
 class Mycomparator implements Comparator<Student>{
 @Override
 public int compare(Student o1, Student o2) {
 // TODO Auto-generated method stub
 //升序
 return o1.nu-o2.nu;
 //降序
 //return o2.nu-o1.nu;
 }

 }
// 接口比较器
class Student implements Comparable<Student> {
	int nu;
	String name;

	public Student(int nu, String name) {
		super();
		this.nu = nu;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [nu=" + nu + ", name=" + name + "]";
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		this.nu = nu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// 升序排列 Arrays.sort
		/*
		 * if(this.nu>o.nu) { return 1; }else if (this.nu<o.nu) { return -1; }else {
		 * return 0; }
		 */
		return this.nu - o.nu;
	}
}

class name implements Comparable<name> {
	private int num;

	public name(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(name o) {
		// TODO Auto-generated method stub
		// 降序排列
		/*
		 * if(this.num>o.num) { return -1; }else if (this.num<o.num) { return 1; }else {
		 * return 0; }
		 */
		return o.num - this.num;
	}

	@Override
	public String toString() {
		return "name [num=" + num + "]";
	}

}

public class Demo {
	public static void main(String[] args) {
		Am2 am = new Am2<String>();
		am.af("dd");
		int[] arr = new int[] { 11, 25, 34, 348, 31 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		String[] arr1 = new String[] { "xzcv", "fghj", "ff", "dfg", "sgf" };
		Arrays.sort(arr);
		for (String a : arr1) {
			System.out.println(a);
		}

		comparater();
		comparater1();
		Comparator1();
	}

	public static void comparater1() {
		name[] stu = new name[4];
		name st1 = new name(1);
		name st2 = new name(4);
		name st3 = new name(2);
		name st4 = new name(3);
		stu[0] = st1;
		stu[1] = st2;
		stu[2] = st3;
		stu[3] = st4;
		Arrays.sort(stu);
		for (name a : stu) {
			System.out.println(a);
		}
	}

	public static void comparater() {
		Student[] stu = new Student[4];
		Student st1 = new Student(1, "sdfsd");
		Student st2 = new Student(4, "yiusdd");
		Student st3 = new Student(2, "cvbfsd");
		Student st4 = new Student(3, "jlksd");
		stu[0] = st1;
		stu[1] = st2;
		stu[2] = st3;
		stu[3] = st4;
		// Mycomparator my = new Mycomparator();
		// Arrays.sort(stu,my);
		// 匿名内部类
		/*
		 * Arrays.sort(stu,new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { // TODO Auto-generated
		 * method stub return o1.n u-o2.nu; } });
		 */
		// lambda 表达式
		Arrays.sort(stu, (stu1, stu2) -> stu1.nu - stu2.nu);

		for (Student a : stu) {
			System.out.println(a);
		}
	}

	public static void Comparator1() {
		yuangong[] stu = new yuangong[4];
		yuangong st1 = new yuangong("chen",20);
		yuangong st2 = new yuangong("jian",51);
		yuangong st3 = new yuangong("liu",28);
		yuangong st4 = new yuangong("chen",12);
		stu[0] = st1;
		stu[1] = st2;
		stu[2] = st3;
		stu[3] = st4;
		//匿名内部类
/*		Arrays.sort(stu,new Comparator<yuangong>() {
			@Override
			public int compare(yuangong o1, yuangong o2) {
				
				//名字相同 比 年龄大小  
				if(o1.getName().compareTo(o2.getName())==0) {
					return o1.getBijiao()-o2.getBijiao();
				}else {
					return o1.getName().compareTo(o2.getName());
				}
			}
		});   */
		
		// Comparator lambda 表达式 实现接口
		Arrays.sort(stu, (o1, o2) -> {
			//名字相同 比 年龄大小  
			if(o1.getName().compareTo(o2.getName())==0) {
				return o1.getBijiao()-o2.getBijiao();
			}else {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for (yuangong a : stu) {
			System.out.println(a);
		}
	}

}

class yuangong {
	private String name;
	private int bijiao;
	public yuangong(String name, int bijiao) {
		super();
		this.name = name;
		this.bijiao = bijiao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBijiao() {
		return bijiao;
	}
	public void setBijiao(int bijiao) {
		this.bijiao = bijiao;
	}
	@Override
	public String toString() {
		return "yuangong [name=" + name + ", bijiao=" + bijiao + "]";
	}

	

}
