package com.Gaurav;

public class ReverseOfNumber {

	public static void main(String[] args) {
      		
           System.out.println(reverse(1432));
	}

	public static int reverse(int num) {
		int digit= (int) (Math.log10(num)+1);
		return helper(num , digit);
	}
	
	
	public static int helper(int n, int digits) {
		if(n % 10== n) {
			return n;
		}
		int rem = n % 10;
		return (int) (rem* Math.pow(10, digits-1) + helper(n/10, digits-1));
	}
	
}
