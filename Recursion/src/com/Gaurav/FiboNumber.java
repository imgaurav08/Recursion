package com.Gaurav;

public class FiboNumber {

	public static void main(String[] args) {
		System.out.println(fiboNumber(4));

	}

	public static int fiboNumber(int n) {
		if(n < 2) {
			return n;
		}
	 
		return fiboNumber(n-1) + fiboNumber(n-2);
		
	}
	
}
