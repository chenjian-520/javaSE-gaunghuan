package com.ghgj.lensson2.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Son{
	private int no;
	private String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Son(){
		System.out.println("无参构造");
	}
	public Son(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		System.out.println("有参构造");
	}
	public void f(){
		System.out.println("fff");
	}
	public void df(String s ,int a){
		System.out.println(s +"  "+ a);
	}
	
}


public class TestDemo5 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<Son> s = Son.class;  //反射对象 
//		Class<? extends Son> s1 = new Son().getClass();
//		Class<?> s2 = Class.forName("com.ghgj.lensson2.fanshe.Son");
		
		Field [] fs = s.getDeclaredFields();
		for(Field f : fs) {
			System.out.println(f.getName());
			System.out.println(f.getType());
			System.err.println(Modifier.toString(f.getModifiers()));
		}
		
		Method [] md = s.getDeclaredMethods();
		for(Method m : md) {
			System.out.println(m.getName());
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.println(m.getReturnType());
			System.out.println(m.getParameterCount());
			System.out.println(Arrays.toString(m.getParameterTypes()));
		}
		Constructor<?>[] cs = s.getDeclaredConstructors();
		for(Constructor c : cs) {
			System.out.println(c.getName());
			System.out.println(c.getParameterCount());
			System.out.println(Arrays.toString(c.getParameterTypes()));
		}
		
		
	}

}
