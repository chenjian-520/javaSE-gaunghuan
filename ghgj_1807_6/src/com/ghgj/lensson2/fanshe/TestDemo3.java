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
		System.out.println("�޲ι���");
	}
	public Person(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		System.out.println("�вι���");
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
		//1����
		Class<Person> c =Person.class; 
		//2
//		Class<? extends Person> c1 = new Person().getClass();
		//3
//		Class<?> c2 = Class.forName("com.ghgj.lensson2.fanshe.Person");
		//---------------������е�����------------------------------------
//		Field [] fs = c.getFields();
		Field [] fs = c.getDeclaredFields();
		for(Field a:fs) {
			System.out.println(a.getName());
			System.out.println(a.getType());
			System.out.println(Modifier.toString(a.getModifiers()));//����Ȩ��
		}
		Field f = c.getDeclaredField("no");
//		System.setSecurityManager(new SecurityManager()); //��ȫ������
		f.setAccessible(true);
		Object obj = c.newInstance(); //���һ������
		f.set(obj, 22);
		System.out.println(f.get(obj));
		
		System.out.println("----------------����------------------------");
		Method []  ms = c.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName());
			System.out.println(m.getReturnType());//����ֵ����
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.println(Arrays.toString(m.getParameterTypes()));//���ز����б�
			
		}
		//���ʵ���
		Method m1 = c.getDeclaredMethod("f");
		m1.invoke(obj);//���÷���
		
		Method m2 = c.getDeclaredMethod("df", String.class,int.class);
		String s=(String)m2.invoke(obj, "hello",25);
		System.out.println(s);
		
		System.out.println("----------------���췽��------------------------");
		Constructor<?> [] crs = c.getDeclaredConstructors();
		for(Constructor<?> cr : crs) {
			System.out.println(Arrays.toString(cr.getParameterTypes()));
		}
		//����
		Constructor<?> cr1 = c.getDeclaredConstructor();
		cr1.newInstance();
		Constructor<?> cr2 = c.getDeclaredConstructor(int.class,String.class);
		cr2.newInstance(25,"chen"); //���з���
	}
}
