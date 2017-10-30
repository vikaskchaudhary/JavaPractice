package com.sort.example;

public class InsertionSort implements SortNumber{

	@Override
	public int[] sortData(int[] arr) {
		int n=arr.length;
		//int k;
		for(int i=1;i<n;i++){
			int k=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>k){
				arr[j+1]=arr[j];
				j=j-1;
			}
			j=j+1;
			arr[j]=k;
		}
		
		return arr;
	}

}
