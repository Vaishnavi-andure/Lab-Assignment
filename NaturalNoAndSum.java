package com.examples;
import java.util.Scanner;

public class NaturalNoAndSum {
	public static void main(String[] args) {
		
		int i, n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("input number");
		
		n=sc.nextInt();
		
		System.out.println("the first n natural numbers are " + n);
		
		for(i=1; i<=n; i++)
		{
			System.out.println(i);
			sum += i;
		}
		System.out.println("the sum of natural numbers are " + n + ":" + sum);
	}
}
