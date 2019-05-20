package com.ghgj.lesson1.work;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;

public class ArraysTest {
	public static void main(String[] args) {
		int[] arr = new int[] {2,1,5,3,4,3};
	/*	Arrays.parallelSetAll(arr, new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int operand) {
				// TODO Auto-generated method stub
				return operand;
			}
		});*/
		
		//Arrays.parallelSetAll(arr, index->index);
		//System.out.println(Arrays.toString(arr));
		
		
		Arrays.parallelPrefix(arr, new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				// TODO Auto-generated method stub
				return left * right;
			}
		});
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.parallelPrefix(arr,(n1,n2) ->n1*n2);
		System.out.println(Arrays.toString(arr));
		
		//遍历数组的Stream流的方法
		Arrays.stream(arr).forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
		});
		//lambda 
		Arrays.stream(arr).forEach( (value) -> {System.out.println(value);});
		//方法引用
		Arrays.stream(arr).forEach(System.out::println);
	
	}
}












