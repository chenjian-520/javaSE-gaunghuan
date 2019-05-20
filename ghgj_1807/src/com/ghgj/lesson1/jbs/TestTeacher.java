package com.ghgj.lesson1.jbs;

/**
 * 教师类：属性：姓名，年龄，性别，
 * 行为：教书，吃饭，
 * 
 * 基本数据类型：4类 8种  ： 整形，浮点型，字符型，布尔型，
 * 8种:bit byte chat short int long float double boolean;
 * 引用数据类型：
 * 数组，类类型，
 * 
 * 注意：一个java原文件中定义的java类可以有多个
 * 但是public 修饰的类的类名称一定要和原文件保持一致
 * 
 * 成员变量：类中定义，也叫属性，所有类中方法可见
 * 局部变量：局部定义，局部使用，方法结束后消失
 * 
 */
public class TestTeacher {
	//定义属性数据类型 属性名称;
	String name;
	int age;
	
	/**
	 *定义方法：
	 *返回值类型 加 方法名称（参数类型  ，参数名称）{} 
	 */
	 
	public void eat(){
		System.out.println("hello world");
	}
	
	public static void main(String[] agrs) {
		//实例化对象：类名  变量名  = new 类名();
		TestTeacher teach = new TestTeacher(); 
		teach.eat();
	}
	
	
}
