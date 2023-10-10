package com.Gaurav;

public class NoOfZero {

	public static void main(String[] args) {
		System.out.println(count(30201));

	}

	public static int count(int num) {
		return helper(num, 0);
	}
	
	public static int helper(int n , int counts) {
		if(n==0) {
			return counts;
		}
		int rem= n%10;
		if(rem == 0) {
			return helper(n/10, counts+1);
		}
		
		return helper(n/10, counts);
	}
	
}
