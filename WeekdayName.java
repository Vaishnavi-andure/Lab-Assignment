package com.examples;
import java.util.Scanner;

public class WeekdayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int day= sc.nextInt();
		System.out.println(getDayName(day));
	}
	public static String getDayName(int day) {
		String dayName = "";
		switch(day) {
			case 1:
				dayName="monday";
				break;
			case 2:
				dayName="tuesday";
				break;
			case 3:
				dayName="wednesday";
				break;
			case 4:
				dayName="thursday";
				break;
			case 5:
				dayName="friday";
				break;
			case 6:
				dayName="saturday";
				break;
			case 7:
				dayName="sunday";
				break;
			default:
				dayName="invalid day";
		}
		return dayName;
	}
}
