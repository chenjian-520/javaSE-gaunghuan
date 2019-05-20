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
		// 自然升序
		Collections.sort(list);
		System.out.println(list);
		// 指定比较器
		Collections.sort(list, (s1, s2) -> s1.compareTo(s1));
		System.out.println(list);
		// 查找元素在集合中出现的索引 前提 升序排序
		System.out.println(Collections.binarySearch(list, "cc"));
		// 集合中最小和最大的
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		// 查找参数在集合中出现的次数
		System.out.println(Collections.frequency(list, "aa"));
		// 对集合元素进行反转
		Collections.reverse(list);
		System.out.println(list);
		// 集合元素的无序输出（每次输出都不一样）
		Collections.shuffle(list);
		System.out.println(list);
		// 集合元素的填充，，用参数替换集合所有元素
		Collections.fill(list, "xx");
		System.out.println(list);

	}

}
