package com.example;

public class SumofArray {
	public static void main(String[] args) {      
        
        int[] a= {10, 11, 12, 13, 14, 16, 17, 18, 19, 20};
        int sum = 0;
        
        for (int i : a)
            sum += i;
        
        System.out.println("The sum is " + sum);
    }
}
