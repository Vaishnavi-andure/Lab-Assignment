package com.demo;

public class PalindromeNo {
	public static void main(String args[]){  
		  int p,sum=0,temp;    
		  int n=343; 
		  
		  temp=n;    
		  while(n>0){    
		   p = n % 10;   
		   sum = (sum * 10) + p;    
		   n = n/10;    
		  }    
		  if(temp == sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome number");    
	}  
}
