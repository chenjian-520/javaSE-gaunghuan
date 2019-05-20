package com.ghgj.lesson4.work;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue1 {

	public static void main(String[] args) {
		Queue<String> q =new LinkedList<>();
		//向队尾加
		q.add("aa");
		q.add("bb");
		q.add("dd");
		q.add("cc");
		//q.forEach(System.out::println);
		System.out.println(q);
		//出队
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q);
		//失败返回null
		System.out.println(q.poll());
		System.out.println(q);
		//队列不允许加入null  但是  LinkedList特殊   可以加   但建议不要加null
		q.offer(null);
		System.out.println(q);
		//循环出队
		while(q.size()>0) {
			  System.out.println(q.poll());
			//System.out.println(q.peek());
		}
		
		
		
	}

}
