package com.ghgj.lesson4.work;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue1 {

	public static void main(String[] args) {
		Queue<String> q =new LinkedList<>();
		//���β��
		q.add("aa");
		q.add("bb");
		q.add("dd");
		q.add("cc");
		//q.forEach(System.out::println);
		System.out.println(q);
		//����
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q);
		//ʧ�ܷ���null
		System.out.println(q.poll());
		System.out.println(q);
		//���в��������null  ����  LinkedList����   ���Լ�   �����鲻Ҫ��null
		q.offer(null);
		System.out.println(q);
		//ѭ������
		while(q.size()>0) {
			  System.out.println(q.poll());
			//System.out.println(q.peek());
		}
		
		
		
	}

}
