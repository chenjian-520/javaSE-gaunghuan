package com.ghgj.lesson3.work;

interface ILetter{
	public abstract void writeHeader();
	public abstract void writeBody();
	public abstract void writeFooter();
	
}
class HomeLetter implements ILetter{

	@Override
	public void writeHeader() {
		// TODO Auto-generated method stub
		System.out.println("�������Ǻ�");
	}

	@Override
	public void writeBody() {
		// TODO Auto-generated method stub
		System.out.println("������ѧϰ�ܿ���");
	}

	@Override
	public void writeFooter() {
		// TODO Auto-generated method stub
		System.out.println("2018.08.08");
	}
	
}

class HoneyLetter implements ILetter{

	@Override
	public void writeHeader() {
		// TODO Auto-generated method stub
		System.out.println("�װ���������ð�");
	}

	@Override
	public void writeBody() {
		// TODO Auto-generated method stub
		System.out.println("����ѧϰ�ܿ���");
	}

	@Override
	public void writeFooter() {
		// TODO Auto-generated method stub
		System.out.println("2018.08.08");
	}
	
}

public class TestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLetter lq = new HomeLetter();
		HoneyLetter lq1 = new HoneyLetter();
		lq.writeBody();lq.writeFooter();lq.writeHeader();
		lq1.writeBody();lq1.writeFooter();lq1.writeHeader();
		ILetter hl = new HoneyLetter();
		hl.writeBody();
	
	}

}
