package com.examples;
import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String[] args) {
		
		int i, n;
		System.out.println("input number :");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			System.out.println("number is : " + i + " and cube of " + i + "is : " + (i*i*i));
		}
	}	
}
