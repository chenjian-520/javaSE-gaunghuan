package com.ghgj.lesson4.work;

public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = new String("abc");
		String s4 = "hello";
		String s5 = new String("hello");

		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s2==s5);
		
		System.out.println(s2.endsWith(s5));
		
		// concat �����ַ���
		s1 = s1.concat("sbgasd");
		System.out.println(s1);
		//����(�ַ�����)
		System.out.println(s1.length());
		//(ת��д)
		System.out.println(s1.toUpperCase());
		//(תСд)
		System.out.println(s1.toLowerCase());
		//(���Ҳ����ַ�����ԭʼ�ַ����е�һ�γ��ֵ�λ������)
		System.out.println(s1.indexOf("s"));
		//(���Ҳ����ַ�����ԭʼ�ַ��������һ�γ��ֵ�λ������)
		System.out.println(s1.lastIndexOf("s"));
		//(��ò���ָ��λ���������ַ�char)
		System.out.println(s1.charAt(2));
		//(ȡ�Ӵ�  ����ʼ ȡ�� ĩβ)
		System.out.println(s1.substring(5));
		//(ȡ�Ӵ�  ����ʼ ȡ�� ����λ�õ�ǰһλ)
		System.out.println(s1.substring(5,10));
		//(�þɵ� �滻 �µ�) ȥ�� ���пո�
		String str = "h e l l o";
		System.out.println(str);
		System.out.println(str.replace(" ", ""));
		System.out.println(s1.replace("hello", "olleh"));
		//(�Ƿ��Դ���Ĳ���Ϊ��ͷ)
		System.out.println(s1.startsWith("hello"));
		//(�Ƿ��Դ���Ĳ���Ϊ��β)
		System.out.println(s1.endsWith("sd"));
		//(�Ƚ϶��� �� ��������С ���ظ���  ���� ��������)
		String st1= "abc";
		String st2= "abb";
		System.out.println(st1.compareTo(st2));
		//(���ַ���ת��Ϊ�ַ����� char)
		char [] str1 = s1.toCharArray();
		for(int i =0;i<str1.length;i++) {
		System.out.print(str1[i]);}
		
		System.out.println();
		//(�ò������ָ�Ϊһ���ַ�������)
		String [] str2 = str.split(" ");
		for(int i =0;i<str2.length;i++) {
			System.out.println(str2[i]);
		}
		
		
		
		
	}

}























