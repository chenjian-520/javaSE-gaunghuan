package com.ghgj.lesson3.work;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class ArratListDemo {
	
	
	/*
	 * �������Ĳ����޸��쳣 java.util.ConcurrentModificationException
	 * �����ڱ����Ĺ�����ʹ����add�����ı��˼��ϵĳ��� ����ɵ��쳣
	 */
	public static void funtion3() {
		List <String> list = new ArrayList<String>();
		list.add("abc0");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		//�Լ���ʹ�õ��������л�ȡ ����ȡʱ���жϼ������Ƿ���ڡ�abc3������
		//����У����һ����ABC3��
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			//�Ի�ȡ��Ԫ��str �����ж� �ǲ�����abc3
			if(str.equals("abc3")) {
				list.add("ABC3");
			}
			System.out.println(str);
		}
	}

	//list �����ص�
	public static void funtion2() {
		List <String> list = new ArrayList<String>();
		list.add("abc0");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// list.add(index, element); ����Խ��
		// list.get() ������   ������
		list.add(0, "ssg0");
		System.out.println(list);
		/*
		 * E remove(int index)
		 * �Ƴ�ָ�������ϵ�Ԫ��
		 * ���ر�ɾ��֮ǰ��Ԫ��
		 */
		
		String a=list.remove(0);
		System.out.println(a);
		System.out.println(list);
		/*
		 * E set(int index,E)
		 * �޸�ָ�������ϵ�Ԫ��
		 * ���ر�ɾ��֮ǰ��Ԫ��
		 */
		String b=list.set(0,"sdg");
		System.out.println(b);
		System.out.println(list);
	}
	
	
	//����
	public static void funtion1() {
		 Collection<String> coll = new ArrayList<String>();
		 coll.add("skuv");
		 coll.add("yyuv");
		 coll.add("hjuu");
		 
		 
		 Iterator<String> it = coll.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 ArrayList<Integer> array = new ArrayList<Integer>();
		 HashSet<String> set = new HashSet<String>();
		 set.add("sss");
		 set.add("sgdh");
		 set.add("sinm");
		 array.add(153);
		 array.add(554);
		 array.add(855);
		 
		iterator(set);
		iterator(array);
		 
	}
	                              //����ͨ���   ��
	public static void iterator(Collection<?> args) {
		Iterator<?>  it = args.iterator();
		while(it.hasNext()) {
	    // ����ǿת   ����
		//	Iterator<?> a=(Iterator<?>) it.next();
			System.out.println(it.next());
		}
	}
	
	// ����ArrayList  �͵�����
	public static void funtion() {
		ArrayList<String> array = new ArrayList<String>();
		array.add("ssss");
		array.add("sdtg");
		array.add("sdtg");
		array.add("sdtg");
		System.out.println(array);
		array.clear();
		System.out.println(array);
		array.add("sdtg");
		array.add("sdtg");
		array.add("sdtg");
		//contains   �жϼ����Ƿ����ʲô���� 
		 boolean a = array.contains("sdtg");
		 System.out.println(a);
		 //toarray()  ����ת���� object����
		 Object[] s1=array.toArray();
		   for(int i = 0;i<s1.length;i++) {
			   System.out.println(s1[i]);
		   }
		 //remove()    �Ƴ�ָ��Ԫ�� ɾ���ɹ�����true
		 
		 //������
		 Iterator<String> it = array.iterator();
		 while (it.hasNext()) {
			 String st=it.next();
			 System.out.println(st);
		 }
		 //for �ô���Լ�ڴ�
		 for(Iterator<String> it2 = array.iterator();it2.hasNext();) {
			 System.out.println(it2.next());
		 }
		 
		 //for����
		 for(int i=0;i<array.size();i++) {
			 String h = array.get(i);
			 System.out.print(h);
		 }
		 //��ǿfor������ ��
		 for(String y: array) {
			 System.out.print(y);
		 }
		 
	}
}
