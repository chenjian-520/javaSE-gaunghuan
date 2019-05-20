package com.ghgj.lesson6.work;

interface Commond{
	public abstract void process(int[] target);
}


class ProcessArray{
	public void process(int[] target,Commond commond) {	
		commond.process(target);
	}
}


public class TestProcessArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] target = new int[] {5,2,5,6,5,4,8};
		ProcessArray pro = new ProcessArray();
		
		//匿名内部类
		Commond commond = new Commond(){
			@Override
			public void process(int[] target) {
				int sun = 0;
				for(int i =0; i<target.length;i++) {	
					sun +=target[i];
				}
				System.out.println("总和为："+sun);
			}
		};
		pro.process(target, commond);
		//lamdba 表达式
		Commond commond1 = (target2)->{
			int sun = 0;
			for(int i =0; i<target.length;i++) {	
				sun +=target[i];
			}
			System.out.println("总和为："+sun);
		};
		pro.process(target, commond1);
		
	}

}
