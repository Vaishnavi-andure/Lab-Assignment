package com.examples;
import java.util.Scanner;

public class GreatestNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("enter 3rd number: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("the greater no is " + num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("the greater no is " + num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("the greater no is " + num3);
		}
		
	}
}
