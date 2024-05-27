package com.example;

public class AverageofArray {
	public static void main(String[] args) {   
        int[] number = new int[]{2, 15, 23, 38, -10, 45, -80};
        int sum = 0;
        
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        double average = sum / number.length;
        System.out.println("Average value of array is : " + average); 
    }
}
