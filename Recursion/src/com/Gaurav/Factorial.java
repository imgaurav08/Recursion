package com.Gaurav;

public class Factorial {

	public static void main(String[] args) {
	 long ans = factorial(16);
	 System.out.println(ans);
   
	}

	
	  public static long factorial(long num) {
		  if( num >=1) {
			  return num * factorial(num-1);
		  }
		  return 1;
	  }
}
