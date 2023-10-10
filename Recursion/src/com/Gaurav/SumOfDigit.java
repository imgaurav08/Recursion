package com.Gaurav;

public class SumOfDigit {

	public static void main(String[] args) {
		System.out.println(sum(1111));
	}

	public static int sum(int n) {
		
		if(n == 0) {
			return n;
		}
		return sum(n/10)+ n%10;
	}
	
}
