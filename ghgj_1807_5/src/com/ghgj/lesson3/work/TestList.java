package com.ghgj.lesson3.work;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("ddd");
		list.add("fff");
		System.out.println(list);
		//����� ���� ���һ��Ԫ��
		list.add(1,"ffxz");
		System.out.println(list);
		//��ȡ���� ��Ԫ��
		System.out.println(list.get(2));
		//�õڶ���Ԫ��  �滻��һ��������Ԫ��
		list.set(1, "chen");
		System.out.println(list);
		list.add("sss");
		System.out.println(list);
		//�鿴  ����Ԫ��  �ڼ����е�һ�γ��ֵ�����
		System.out.println(list.indexOf("sss"));
		//�鿴  ����Ԫ��  �ڼ��������һ�γ��ֵ�����
		System.out.println(list.lastIndexOf("sss"));
		//�Ӽ���   ������ ��ֹλ��
		System.out.println(list.subList(2, 4));
		//����  ������Ȼ��������
		list.sort(null);
		System.out.println(list);
		//����
		list.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
		
	}

}










