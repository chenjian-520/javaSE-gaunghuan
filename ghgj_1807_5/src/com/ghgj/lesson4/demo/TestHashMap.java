package com.ghgj.lesson4.demo;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> ht = new HashMap<>();
		ht.put("CA", "���ô�");
		ht.put("CF", "�з�");
		ht.put("CG", "�չ�");
		ht.put("CH", "��ʿ");
		ht.put("CL", "����");
		ht.put("CM", "����¡");		
		ht.put("CN", "�й�");
		ht.put("CO", "���ױ���");
		ht.put("CR", "��˹�����");
		ht.put("CS", "�ݿ�");		
		ht.put("CU", "�Ű�");
		ht.put("CY", "����·˹");
		ht.put("DE", "�¹�");
		ht.put("DK", "����");
		ht.put("DO", "�������Ǽӹ��͹�");
		ht.put("DZ", "����������");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ӣ����д��");
		String name = sc.next();
		if(ht.containsKey(name)) {
			System.out.println(ht.get(name));
		}else {
			System.out.println("�޴˹��ң�");
		}
		System.out.println("һ���й��ң�"+ht.size());
		ht.keySet().forEach((k)->System.out.print(k+"  "));
		System.out.println();
		ht.values().forEach((k)->System.out.print(k+"  "));
	}

}
