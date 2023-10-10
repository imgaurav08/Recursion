package com.Gaurav;

public class LearnRecursion {

	public static void main(String[] args) {
		print(4);

	}

	public static void print(int n) {
	 
		if(n==4) {
			System.out.println(4);
			return;
		}
		System.out.println(n);
		print(n+1);
	}
	
}
