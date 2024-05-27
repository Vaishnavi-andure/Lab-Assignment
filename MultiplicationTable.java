package com.demo;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		System.out.println("input number :");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
			
		System.out.println("\n");
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}	
}
