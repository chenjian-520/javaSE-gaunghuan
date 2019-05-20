package com.ghgj.lesson7.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		funtion3();
	}
	/*
	 * 1.����map���Ϸ���entrySet�����������е�ӳ���ϵ����浽set������
	 *    set<entry<k��v>>
	 * 2.����set����
	 * 3.��ȡ��set���ϵ�Ԫ�� ��ӳ��Ķ���
	 * 4.ͨ��ӳ���ϵ���󷽷� getKey()  getValue()��ȡ��ֵ��
	 */
	public static void funtion3() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		map.put("d", 5);
		map.put("e", 8);
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
			
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
		
		
		
		
	}
	/*
	 * Map���ϱ��� 
	 * 1.����map���ϵķ���keySet�����еļ��浽set������
	 * 2.����set���� ��ȡ��set����������Ԫ��
	 * 3.����map�е�get ��ȡֵ
	 */
	public static void funtion2() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		map.put("d", 5);
		map.put("e", 8);
		System.out.println(map);
		
		Set<String> set =map.keySet();
		System.out.println(set.getClass());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key= it.next();
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
			
		}
		System.out.println("---------------------------");
		for(String key:map.keySet()) {
			int value = map.get(key);
			System.out.println(key+"..."+value);
		}
		
		
	}
	/*
	 * ͨ�������󣬻�ȡֵ����
	 * v get��k��
	 */
	public static void funtion1() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		map.put("b", 1);
		map.put("a", 2);
		map.put("c", 3);
		System.out.println(map);
		
		int value = map.get("b");
		System.out.println(value);
		// remove �Ƴ���ֵ��  ���ر��Ƴ�֮ǰ��ֵ
		int  c=map.remove("b");
		System.out.println(map);
		System.out.println(c);
	}
	
	/*
	 * ����ֵ�Դ洢��������
	 * V put��K,V��K ��Ϊ��  V ��Ϊֵ
	 * �洢�����ظ���ʱ����ԭ�е�ֵ����
	 * ����ֵһ���ǿ�
	 * �洢�ظ���ʱ�����ر�����֮ǰ��ֵ
	 */
	public static void funtion() {
		Map<String,Integer> map = new HashMap<String , Integer>();
		Integer i = map.put("a", 1);
		System.out.println(i);
		Integer a = map.put("a", 3);
		System.out.println(a);
		map.put("c", 2);
		System.out.println(map);
	}
}
