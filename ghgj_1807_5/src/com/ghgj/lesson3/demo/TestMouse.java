package com.ghgj.lesson3.demo;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

class Mouse implements Comparable<Mouse>{
	private String name;
	private int age ;
	private String like;
	public Mouse(String name, int age, String like) {
		super();
		this.name = name;
		this.age = age;
		this.like = like;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getLike() {
		return like;
	}
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", age=" + age + ", like=" + like + "]";
	}
	@Override
	public int compareTo(Mouse o) {
		// TODO Auto-generated method stub
		return this.age-o.getAge();
	}
	@Override
	public boolean equals(Object obj) {
		Mouse e = (Mouse) obj;
		if(this==obj) {
			return	true;
		}if(obj == null) {
			return false;
		}else {
		return name.equals(e.getName());
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
}

public class TestMouse {

	public static void main(String[] args) {
		Set<Mouse> set1 = new HashSet<>();
		Mouse m1 =new Mouse("½Ü¿Ë",5,"³ÔÈâ");
		Mouse m3 =new Mouse("ÌÔÌÔ",4,"ÍæÓÎÏ·");
		Mouse m2 =new Mouse("ÌÔÌÔ",3,"ÍæÏ·");
		set1.add(m1);
		set1.add(m2);
		set1.add(m3);
		System.out.println(set1);
		TreeSet<Mouse> set = new TreeSet<>(set1);
		
		System.out.println("--------------------");
		Iterator it = set.iterator();
		it.forEachRemaining(System.out::println);
		set.remove(m1);
		System.out.println("--------------------");
		//·´Ïòµü´ú
		set.descendingSet().forEach(new Consumer<Mouse>() {
			@Override
			public void accept(Mouse t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
	}

}
