package com.ghgj.lesson4.work;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>((n1,n2)->n2-n1);
		q.add(22);
		q.add(23);
		q.add(55);
		q.add(6);
		q.add(8);
		q.add(82);
		while(q.size()>0) {
			System.out.println(q.poll());
		}
		
	}

}
