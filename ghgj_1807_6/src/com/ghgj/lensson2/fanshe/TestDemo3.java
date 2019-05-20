package com.ghgj.lensson2.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Person{
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
	Person(){
		System.out.println("无参构造");
	}
	public Person(int no, String name) {
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

public class TestDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		//1反射
		Class<Person> c =Person.class; 
		//2
//		Class<? extends Person> c1 = new Person().getClass();
		//3
//		Class<?> c2 = Class.forName("com.ghgj.lensson2.fanshe.Person");
		//---------------获得所有的属性------------------------------------
//		Field [] fs = c.getFields();
		Field [] fs = c.getDeclaredFields();
		for(Field a:fs) {
			System.out.println(a.getName());
			System.out.println(a.getType());
			System.out.println(Modifier.toString(a.getModifiers()));//访问权限
		}
		Field f = c.getDeclaredField("no");
//		System.setSecurityManager(new SecurityManager()); //安全管理器
		f.setAccessible(true);
		Object obj = c.newInstance(); //获得一个对象
		f.set(obj, 22);
		System.out.println(f.get(obj));
		
		System.out.println("----------------方法------------------------");
		Method []  ms = c.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName());
			System.out.println(m.getReturnType());//返回值类型
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.println(Arrays.toString(m.getParameterTypes()));//返回参数列表
			
		}
		//访问单个
		Method m1 = c.getDeclaredMethod("f");
		m1.invoke(obj);//调用方法
		
		Method m2 = c.getDeclaredMethod("df", String.class,int.class);
		String s=(String)m2.invoke(obj, "hello",25);
		System.out.println(s);
		
		System.out.println("----------------构造方法------------------------");
		Constructor<?> [] crs = c.getDeclaredConstructors();
		for(Constructor<?> cr : crs) {
			System.out.println(Arrays.toString(cr.getParameterTypes()));
		}
		//单个
		Constructor<?> cr1 = c.getDeclaredConstructor();
		cr1.newInstance();
		Constructor<?> cr2 = c.getDeclaredConstructor(int.class,String.class);
		cr2.newInstance(25,"chen"); //运行方法
	}
}
