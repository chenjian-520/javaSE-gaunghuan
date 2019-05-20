package com.ghgj.lesson1.JavaPhasedOperation2;


class ClassRoom{
	private int height;
	private int wight;

	public int getHeight() {
		return height;
	}
	public int getWight() {
		return wight;
	}
	public ClassRoom(int height, int wight) {
		super();
		this.height = height;
		this.wight = wight;
	}

	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	static class Table{
		private int number;
		private int heightTable;	
		public int getNember() {
			return number;
		}
		public int ClassRoom() {
			return heightTable;
		}
		public Table(int number, int heightTable) {
			super();
			this.number = number;
			this.heightTable = heightTable;
		}
		public void show() {
			System.out.println("×À×Ó£º"+number+"...."+heightTable);
		}
	}
	
	public  void show(){
		Table table = new Table(4,120);
		System.out.println("½ÌÊÒ£º"+height+"..."+wight);
		table.show();
	}
}

public class TestClassRoom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom clr = new ClassRoom(12,15);
		clr.show();
		ClassRoom.Table a=new ClassRoom.Table(4,4);
		a.show();
	}
}
