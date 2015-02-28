// ************************************************************
// Dates.java
// Author: Dominik Mendel
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ************************************************************

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        //Variables:
        int month, day, year; //date read in from user
        int daysInMonth = 0; //number of days in month read in
        boolean monthValid, yearValid, dayValid; //true if input from user is valid
        boolean leapYear; //true if user's year is a leap year
        //User input:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        year = scan.nextInt();
        System.out.println("Please enter the month: ");
        month = scan.nextInt();
        System.out.println("How many days are in that month? ");
        day = scan.nextInt();

        //Verifying year:
        if ((year >= 1000) && (year <= 1999))
            yearValid = true;
        else
            yearValid = false;
        //Verifying month:
        if ((month >= 1) && (month <= 12))
            monthValid = true;
        else
            monthValid = false;
        //Verifying leap year:
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            leapYear = true;
        else
            leapYear = false;
        //Calculating days in month
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                if (leapYear)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
                break;
        }
        if ((day > daysInMonth) || (day < daysInMonth))
            dayValid = false;
        else
            dayValid = true;

        //If year or month is false:
        if ((yearValid == false) || (monthValid == false) || (dayValid == false))
            System.out.println("This is not a valid year, month, or number of days in the second millennium.");
        else {
            if (leapYear == true) {
                System.out.println("This is a valid date, and a leap year.");
                System.out.println("Year " + year + " has " + daysInMonth + " days in the month " + month + ".");
            } else {
                System.out.println("This is a valid date.");
                System.out.println("Year " + year + " has " + daysInMonth + " days in the month " + month + ".");
            }
        }
    }
}
