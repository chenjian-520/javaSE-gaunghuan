package com.ghgj.lesson4.stream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class TestStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.builder().add(11).add(123).add(1454).build();
//		System.out.println(is.max().getAsInt());
// 		System.out.println(is.min().getAsInt());
//		System.out.println(is.sum());
//		System.out.println(is.average().getAsDouble());
//		System.out.println(is.count());
		//all
	/*	System.out.println(is.allMatch(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				// TODO Auto-generated method stub
				return value>20;
			}
		}));*/
//		System.out.println(is.allMatch(v->v>20));
		//any  只要有一个元素大于20  返回true
//		System.out.println(is.anyMatch(n->n>20));
		
		is.filter(v->v>20).forEach(s->System.out.println(s));
		
	}

}
