package com.ghgj.lesson3.work;

public class Score {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Score score = new Score();
		/*try {
			score.setScore(220);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		*/
		try {
			score.isTriangle(5, 1, 2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	public void setScore(int score) throws Exception {
		if(score<=100&&score>=0) {
			System.out.println("������"+score);
		}else{
			throw new Exception("�������ܳ���100");
		}
	}
	
	public void isTriangle(int a, int b, int c) throws IllegalArgumentException{
		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("�����ܹ���������");
		}else {
			throw new IllegalArgumentException("���߲��ܹ��������Σ���");
		}
	}

}
