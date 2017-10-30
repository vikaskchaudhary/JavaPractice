package com.sort.example;

public class SortCheck {

	public static void main(String[] args) {
		int[] arr={10,5,6,8,2,7,4,1,9,3};
//		SortNumber obj = new SelectionSort();
		//SortNumber obj = new BubbleSort();
		SortNumber obj = new InsertionSort();
		
		
		for(int i:obj.sortData(arr)){
			System.out.println(i);
		}
	}

}
