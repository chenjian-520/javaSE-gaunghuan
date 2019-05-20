package com.ghgj.lesson3.work;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

//��ˮ�����ע��
@Target(ElementType.TYPE)//�ڶ����ʱ��ʹ��
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface FuitAnno{
	String value() default "Fuit";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FuitColorAnno{
	Color color() default Color.RDE;
}


@FuitAnno(value="apple")
class Fuit{
	private String name;
	 int no;
}

enum Color{
	RDE,YELLOW,GREEN;
}

class Apple extends Fuit{
	@FuitColorAnno
	Color color;
}

public class TestAnno {

	public static void main(String[] args)throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		// ���� ��� ע�����Ϣ
				//���� ��ע����Ϣ
				Class<Fuit> cf = Fuit.class; 
				Annotation [] ans =  cf.getDeclaredAnnotations();
				Arrays.stream(ans).forEach(System.out::println);
				System.out.println("-------------------------------------");
				//����� 
				Class<Apple>  ca = Apple.class;
				Annotation [] ans1 =  ca.getAnnotations();
				Arrays.stream(ans1).forEach(System.out::println);
				//�������� ��Ҳ��ע��
				System.out.println("-----------------------------------------");
				Annotation [] ans2 = ca.getDeclaredField("color").getAnnotations();
				Arrays.stream(ans2).forEach(System.out::println);
			}

	}


