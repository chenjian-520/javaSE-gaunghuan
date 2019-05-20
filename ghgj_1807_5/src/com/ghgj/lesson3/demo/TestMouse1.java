package com.ghgj.lesson3.demo;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;





class Mouse1 implements Comparable{
	private String name;
	private int age ;
	private String like;
	public Mouse1(String name, int age, String like) {
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
	//ÖØĞ´±È½Ï·½·¨
	public int compareTo(Object o) {
		if((this.age > ((Mouse1)o).getAge()) && !(((Mouse1)o).name.equals(this.name))) {
			return 1;
		}if((this.age < ((Mouse1)o).getAge()) && !(((Mouse1)o).name.equals(this.name))) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {return true;}
		if(!(obj instanceof Mouse1)) {return false;}
		Mouse1 c = (Mouse1)obj;
		return c.getName().equals(this.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = result*31+name.hashCode();
		return result;
	}
}

public class TestMouse1 {

	public static void main(String[] args) {
		TreeSet<Mouse1> set1 = new TreeSet<>();
		Mouse1 m1 =new Mouse1("½Ü¿Ë",5,"³ÔÈâ");
		Mouse1 m3 =new Mouse1("ÌÔÌÔ",4,"ÍæÓÎÏ·");
		Mouse1 m2 =new Mouse1("ÌÔÌÔ",1,"ÍæÏ·");
		Mouse1 m4 =new Mouse1("ÌÔÌÔ",52,"ÍæÏ·");
		Mouse1 m5 =new Mouse1("ÌÔÌÔ",3,"ÍæÏ·");
		Mouse1 m6 =new Mouse1("ÌÔÌÔ",10,"ÍæÏ·");
		Mouse1 m7 =new Mouse1("ÌÔÌÔ",45,"ÍæÏ·");
		Mouse1 m8 =new Mouse1("ÌÔÌÔ",54,"ÍæÏ·");
		Mouse1 m9 =new Mouse1("ÌÔÌÔ",54,"ÍæÏ·");
		Mouse1 m10 =new Mouse1("½Ü¿Ë",50,"ÍæÏ·");
		
		
		set1.add(m1);
		set1.add(m10);
		
		set1.add(m2);

		set1.add(m3);
		
		set1.add(m5);
		
		set1.add(m4);
		set1.add(m6);
		set1.add(m7);
		
		set1.add(m8);
		
		set1.add(m9);
		
		
		System.out.println(set1);
		
		System.out.println("--------------------");
		Iterator it = set1.iterator();
		it.forEachRemaining(System.out::println);
		set1.remove(m1);
		System.out.println("--------------------");
		//·´Ïòµü´ú
		set1.descendingSet().forEach(new Consumer<Mouse1>() {
			@Override
			public void accept(Mouse1 t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
	}

}
