package com.ghgj.lesson4.demo;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> ht = new HashMap<>();
		ht.put("CA", "加拿大");
		ht.put("CF", "中非");
		ht.put("CG", "刚果");
		ht.put("CH", "瑞士");
		ht.put("CL", "智利");
		ht.put("CM", "喀麦隆");		
		ht.put("CN", "中国");
		ht.put("CO", "哥伦比亚");
		ht.put("CR", "哥斯达黎加");
		ht.put("CS", "捷克");		
		ht.put("CU", "古巴");
		ht.put("CY", "塞浦路斯");
		ht.put("DE", "德国");
		ht.put("DK", "丹麦");
		ht.put("DO", "多米尼亚加共和国");
		ht.put("DZ", "阿尔及利亚");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入国家英文缩写：");
		String name = sc.next();
		if(ht.containsKey(name)) {
			System.out.println(ht.get(name));
		}else {
			System.out.println("无此国家！");
		}
		System.out.println("一共有国家："+ht.size());
		ht.keySet().forEach((k)->System.out.print(k+"  "));
		System.out.println();
		ht.values().forEach((k)->System.out.print(k+"  "));
	}

}
