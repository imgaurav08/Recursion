package com.Gaurav;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {2,35,1,6,8};
		sort(arr, arr.length-1, 0);
System.out.println(Arrays.toString(arr));
	}

	public static void sort(int [] arr , int row, int col) {
		if(row==0) {
			return;
		}
		
		if(col < row) {
			if(arr[col] > arr[col+1]) {
				int temp= arr[col+1];
				arr[col+1]= arr[col];
				arr[col]=temp;
			}
			sort(arr, row, col+1);
		}
		else {
			sort(arr, row-1, 0);
		}
	}
	
}
