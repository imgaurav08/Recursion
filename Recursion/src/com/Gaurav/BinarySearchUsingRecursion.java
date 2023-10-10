package com.Gaurav;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
        int [] arr = {2,3,5,66,78,345,789};		
        int target = 345;
        System.out.println(search(arr, target, 0, arr.length-1));
 
	}

	public static int search(int [] arr , int target , int start, int end) {
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end - start)/2;
		if(target == arr[mid]) {
			return mid;
		}
		if(target < arr[mid]) {
			return search(arr, target, start, mid-1);
		}
		return search(arr, target, mid+1, end);
	}
	
	
}
