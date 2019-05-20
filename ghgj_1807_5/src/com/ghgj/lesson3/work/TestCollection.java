package com.ghgj.lesson3.work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


public class TestCollection {

	public static void main(String[] args) {
		//����һ������
		Collection<String> c = new ArrayList<>();
		//�����Ƿ�Ϊ��  Ԫ�ظ���Ϊ0 ���ǿ�
		System.out.println(c.isEmpty());
		//
		c.add("sdfs");
		c.add("sdvvv");
		c.add("sdfxc");
		System.out.println(c);
//		for(String a: c) {
//			System.out.println(a);
//		}
		//�����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		//������Ԫ�صĸ���
		System.out.println(c.size());
		//
		Collection<String> c1 = new ArrayList<>();
		c1.add("ee");
		c1.add("fff");
		System.out.println(c1);
		//�Ѳ��� ������ ������Ԫ����ӵ���ǰ����c��  ֻҪ��ǰ���Ϸ����˸ı� true
		boolean bl=c.addAll(c1);
		System.out.println(c+"   ����"+bl);
		//ɾ��ָ�� Ԫ��    �ı䷵�� true
		c.remove("ee");
		System.out.println(c);
		//ɾ������������  ����Ԫ��   ֻҪ��ǰ���Ϸ����˸ı�  ����true
		c.removeAll(c1);
		System.out.println(c);
		c.add("aaaaaa");
		c.add("dddddd");
		System.out.println(c);
		//����  ����  ɾ�� 
	/*	c.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()>5;
			}
		});*/
		c.removeIf((s)->s.length()>5);
		System.out.println(c);
		//�Ƿ� ���ڲ���ָ��Ԫ��  ����true
		System.out.println(c.contains("sdfs"));
		//�Ƿ� ���ڲ���������ȫ��Ԫ��   ����true
		System.out.println(c.containsAll(c1));
		//������ת���ɼ���
		//�������Ԫ��  �Ƴ�Ԫ��
		List<String> list = Arrays.asList(new String[] {"sxgg","asdzx","dfsdfc","eeee"});
		System.out.println(list);
		c.addAll(list);
		System.out.println(c);
		System.out.println(c.containsAll(list));
		//����ת����
		//Object[] obj = c.toArray();
		Object[] obj = c.toArray(new Object [10]);
		for(Object o: obj) {
			System.out.println(o);
		}
		//��ռ�����Ԫ��
		c.clear();
		System.out.println(c+"..."+c.isEmpty());
		
	}

}








