package com.ghgj.lesson4.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//
		Collections.addAll(list, "aa", "cc", "bb");
		System.out.println(list);
		// ��Ȼ����
		Collections.sort(list);
		System.out.println(list);
		// ָ���Ƚ���
		Collections.sort(list, (s1, s2) -> s1.compareTo(s1));
		System.out.println(list);
		// ����Ԫ���ڼ����г��ֵ����� ǰ�� ��������
		System.out.println(Collections.binarySearch(list, "cc"));
		// ��������С������
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		// ���Ҳ����ڼ����г��ֵĴ���
		System.out.println(Collections.frequency(list, "aa"));
		// �Լ���Ԫ�ؽ��з�ת
		Collections.reverse(list);
		System.out.println(list);
		// ����Ԫ�ص����������ÿ���������һ����
		Collections.shuffle(list);
		System.out.println(list);
		// ����Ԫ�ص���䣬���ò����滻��������Ԫ��
		Collections.fill(list, "xx");
		System.out.println(list);

	}

}
