package com.examples;
import java.util.Scanner;

public class DayInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int daysinmonth = 0;
		String Monthofname = "unknown";
		
		System.out.println("enter month number: ");
		int month = sc.nextInt();
		System.out.println("enter year: ");
		int year = sc.nextInt();
		switch (month) {
        	case 1:
        		Monthofname = "January";
        		daysinmonth = 31;
        		break;
        	case 2:
        		Monthofname = "February";
        		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        			daysinmonth = 29;
        		} else {
        			daysinmonth = 28;
        		}
        		break;
        	case 3:
        		Monthofname = "March";
        		daysinmonth = 31;
        		break;
        	case 4:
        		Monthofname = "April";
        		daysinmonth = 30;
        		break;
        	case 5:
        		Monthofname = "May";
        		daysinmonth = 31;
        		break;
        	case 6:
        		Monthofname = "June";
        		daysinmonth = 30;
        		break;
	        case 7:
	            Monthofname = "July";
	            daysinmonth = 31;
	            break;
	        case 8:
	            Monthofname = "August";
	            daysinmonth = 31;
	            break;
	        case 9:
	            Monthofname = "September";
	            daysinmonth = 30;
	            break;
	        case 10:
	            Monthofname = "October";
	            daysinmonth = 31;
	            break;
	        case 11:
	            Monthofname = "November";
	            daysinmonth = 30;
	            break;
	        case 12:
	            Monthofname = "December";
	            daysinmonth = 31;
	    }
	    System.out.print(Monthofname + " " + year + " has " + daysinmonth + " days\n");
	}
}
