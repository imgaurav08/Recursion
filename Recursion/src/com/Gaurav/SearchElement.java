package com.Gaurav;

public class SearchElement {

	public static void main(String[] args) {
		int [] arr = {2,34,54,12};
		int target = 54;
		//System.out.println(search(arr, target, 0));
           System.out.println(findIndex(arr, target, 0));
	}

	public static boolean search(int [] arr , int target , int index) {
		if(index == arr.length) {
			return false;
		}
		
		return arr[index]== target || search(arr, target, index+1);
	}
	
	public static int findIndex(int [] arr , int target , int index) {
		if(index== arr.length) {
			return -1;
		}
		if(target == arr[index]) {
			return index;
		}
		return findIndex(arr, target, index+1);
	}
	
	
}
