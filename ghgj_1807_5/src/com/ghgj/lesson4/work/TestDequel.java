package com.ghgj.lesson4.work;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Consumer;

public class TestDequel {

	public static void main(String[] args) {
		//Qeque 双向队列
		//模拟队列
		Deque <String> d = new ArrayDeque<>();
		d.add("aa");
		d.add("bb");
		d.add("dd");
		d.add("cc");
		d.add("ee");
		System.out.println(d);
		//出队
	/*	while(d.size()>0) {
			//System.out.println(d.poll());
			System.out.println(d.pollFirst());
		}*/
		System.out.println("-----------------------------");
		//模拟栈
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
		//栈方法
/*		d.push("gg");
		d.push("dd");
		System.out.println(d.pop());
		System.out.println(d.pop());
		funstion();*/
	}
	
	public static void funstion() {
		Deque<String> d = new ArrayDeque<>();
		d.add("郭靖");
		d.add("杨坤");
		d.add("黄蓉");
		d.add("芙蓉");
		d.add("阳谷");
		int  i = 1 ;
		while(d.size()>0) {
			System.out.println(i+" "+d.poll()+"办理完成");
			i++;
			System.out.println("剩余：");
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
				System.out.println("后面没有队伍了");
				System.out.println("全部办理完成");	
			}
			
		}
		
		
	}

}












