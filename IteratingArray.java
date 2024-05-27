package com.example;
import java.util.Arrays;

public class IteratingArray {
	public static void main(String[] args) {
        int[] a = {11, 15, 21, 18, 36, 45, 77, 13, 32, 56};
        int[] b = new int[10];     
 
        System.out.println("array : " + Arrays.toString(a));     
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("New array: " + Arrays.toString(b));
    }
}
