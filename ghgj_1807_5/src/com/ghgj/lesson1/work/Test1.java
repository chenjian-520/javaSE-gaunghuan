package com.ghgj.lesson1.work;

interface InfoArray{
public abstract	void reverse(int[] arr);
}

class ArrayImpl{
	public void display (int[] arr, InfoArray info) {
		info.reverse(arr);
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,5,9,7,2,6,4};
		ArrayImpl apl = new ArrayImpl();
		
		apl.display(arr, new InfoArray() {
			public void reverse(int[] arr) {
				int [] a =new int [arr.length];
				for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
					a[i] = arr[j];
				}
				for(int b:a) {
					System.out.print(b+" ");
				}	
			};
		});
		
		apl.display(arr,(arr1)->{
			int [] a =new int [arr.length];
			for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
				a[i] = arr[j];
			}
			for(int b:a) {
				System.out.print(b+" ");
			}
		});
		
	}

}
