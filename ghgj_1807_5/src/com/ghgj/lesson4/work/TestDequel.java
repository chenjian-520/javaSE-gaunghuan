package com.ghgj.lesson4.work;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Consumer;

public class TestDequel {

	public static void main(String[] args) {
		//Qeque ˫�����
		//ģ�����
		Deque <String> d = new ArrayDeque<>();
		d.add("aa");
		d.add("bb");
		d.add("dd");
		d.add("cc");
		d.add("ee");
		System.out.println(d);
		//����
	/*	while(d.size()>0) {
			//System.out.println(d.poll());
			System.out.println(d.pollFirst());
		}*/
		System.out.println("-----------------------------");
		//ģ��ջ
		d.addFirst("aa");
		d.addFirst("bb");
		d.addFirst("cc");
		d.addFirst("dd");
		System.out.println(d);
		System.out.println(d.pollFirst());
		System.out.println(d.poll());
		System.out.println(d.pollLast());
	/*	while(d.size()>0) {
			//System.out.println(d.pollFirst());
			System.out.println(d.poll());
		}*/
		System.out.println("-----------------------------");
		//ջ����
/*		d.push("gg");
		d.push("dd");
		System.out.println(d.pop());
		System.out.println(d.pop());
		funstion();*/
	}
	
	public static void funstion() {
		Deque<String> d = new ArrayDeque<>();
		d.add("����");
		d.add("����");
		d.add("����");
		d.add("ܽ��");
		d.add("����");
		int  i = 1 ;
		while(d.size()>0) {
			System.out.println(i+" "+d.poll()+"�������");
			i++;
			System.out.println("ʣ�ࣺ");
			if(d.size()>0) {
				d.forEach(new Consumer<String>() {
					int j = 1;
					@Override
					public void accept(String t) {
						// TODO Auto-generated method stub
						System.out.println(j+"."+t);
						j++;
					}
				});
				
			}else {
				System.out.println("����û�ж�����");
				System.out.println("ȫ���������");	
			}
			
		}
		
		
	}

}












