package com.sort.example;

public class SelectionSort implements SortNumber{



	@Override
	public int[] sortData(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min_idx]>arr[j])
				{
					min_idx=j;
				}
			}
			int tmp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=tmp;
		}
		return arr;
	}
}
