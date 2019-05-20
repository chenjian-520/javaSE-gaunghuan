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
		
		// concat 连接字符串
		s1 = s1.concat("sbgasd");
		System.out.println(s1);
		//长度(字符个数)
		System.out.println(s1.length());
		//(转大写)
		System.out.println(s1.toUpperCase());
		//(转小写)
		System.out.println(s1.toLowerCase());
		//(查找参数字符串在原始字符串中第一次出现的位置索引)
		System.out.println(s1.indexOf("s"));
		//(查找参数字符串在原始字符串中最后一次出现的位置索引)
		System.out.println(s1.lastIndexOf("s"));
		//(获得参数指定位置索引出字符char)
		System.out.println(s1.charAt(2));
		//(取子串  从起始 取到 末尾)
		System.out.println(s1.substring(5));
		//(取子串  从起始 取到 结束位置的前一位)
		System.out.println(s1.substring(5,10));
		//(用旧的 替换 新的) 去除 所有空格
		String str = "h e l l o";
		System.out.println(str);
		System.out.println(str.replace(" ", ""));
		System.out.println(s1.replace("hello", "olleh"));
		//(是否以传入的参数为开头)
		System.out.println(s1.startsWith("hello"));
		//(是否以传入的参数为结尾)
		System.out.println(s1.endsWith("sd"));
		//(比较对象 比 参数对象小 返回负数  否则 返回正数)
		String st1= "abc";
		String st2= "abb";
		System.out.println(st1.compareTo(st2));
		//(把字符串转换为字符数组 char)
		char [] str1 = s1.toCharArray();
		for(int i =0;i<str1.length;i++) {
		System.out.print(str1[i]);}
		
		System.out.println();
		//(用参数来分割为一个字符串数组)
		String [] str2 = str.split(" ");
		for(int i =0;i<str2.length;i++) {
			System.out.println(str2[i]);
		}
		
		
		
		
	}

}























