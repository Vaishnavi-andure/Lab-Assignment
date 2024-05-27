package com.examples;
import java.util.Scanner;

public class SumofOddNo {
	public static void main(String[] args) {
		
		int i, n, sum=0;
		System.out.println("input number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("the odd numbers are : ");
		
		for(i=1; i<=n; i++)
		{
			System.out.println(2*i-1);
			sum += 2*i-1;
		}
		System.out.println("the sum of odd natural numbers are " + n + " : " + sum);
	}
}
