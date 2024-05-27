package com.examples;
import java.util.Scanner;

public class MultiplicationofInteger {
	public static void main(String[] args) {
			
		int i, n;
		System.out.println("input number :");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
			
		System.out.println("\n");
		for(i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}	
}
