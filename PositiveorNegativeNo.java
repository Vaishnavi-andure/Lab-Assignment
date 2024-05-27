package com.examples;
import java.util.Scanner;

public class PositiveorNegativeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int input = sc.nextInt();
		
		if(input>0)
		{
			System.out.println("number is positive ");
		}
		else
		{
			System.out.println("number is negative ");
		}
	}
}
