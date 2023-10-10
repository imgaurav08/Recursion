package com.Gaurav;

import java.util.ArrayList;

public class MultipleOcuureanceOftarget {

	public static void main(String[] args) {
		int [] arr = {1,2,1,5,6};
		int target = 7;
		findAllOccurence(arr, target, 0);
		System.out.println(list);

	}

	static ArrayList<Integer> list = new ArrayList<> ();
	public static void findAllOccurence(int [] arr , int target, int index) {
		
		if(index== arr.length) {
			return ;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
	    findAllOccurence(arr, target, index+1);
	}
	
}
