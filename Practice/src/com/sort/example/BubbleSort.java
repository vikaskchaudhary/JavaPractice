package com.sort.example;

public class BubbleSort implements SortNumber {

	@Override
	public int[] sortData(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
				
			}
		}
		return arr;
	}

}
