package com.ghgj.lesson3.work;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface Personin{
	String value() default "����";
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface Employeein{
	String value() default "Ա��";
}

@Personin(value = "����")
class Person{
public String name;
public String type;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public void eat () {
		System.out.println("�Ժ���   ��������");
	}
}

@Employeein(value = "Ա����")
class Employee extends Person{
	
	public void song(){
		System.out.println("����");
	}
}


public class TestDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class per = Person.class;
		Class emp = Employee.class;
		Field [] fp =per.getDeclaredFields();
		//����
		for(Field a:fp) {
			System.out.println(a.getName());
			System.out.println(a.getType());
			System.out.println(Modifier.toString(a.getModifiers()));
		}
		//ע��
		Annotation[] ap=per.getDeclaredAnnotations();
		Arrays.stream(ap).forEach(System.out::println);
		//����
		Method[] dp=per.getDeclaredMethods();
		Object obj = per.newInstance();
		for(Method m: dp) {
			System.out.println(m.getName());
			System.out.println(Arrays.toString(m.getTypeParameters()));
			System.out.println(m.getParameterCount());
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.println(m.invoke(obj));
		}
		//����
		Constructor[] cp=per.getDeclaredConstructors();
		for(Constructor c : cp) {
			System.out.println(Arrays.toString(c.getGenericParameterTypes()));
		}
		
	}
	

}
