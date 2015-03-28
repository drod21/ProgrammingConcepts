// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        int SALESPEOPLE = 5;
        System.out.print("How many salespeople are there? ");
        Scanner scan = new Scanner(System.in);
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int max = sales[0];
        int min = sales[0];
        int max_id = 0, min_id = 0, val, greater = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        max = sales[0];
        max_id = 0;
        min = sales[0];
        min_id = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + i + "         " + sales[i]);
            sum += sales[i];
            if (sales[i] > max) {
                max = sales[i];
                max_id = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                min_id = i;
            }
        }
        System.out.println("The max sale is: " + max);
        System.out.println("The min sale is: " + min);
        System.out.println("The person with the max sales is: " + max_id);
        System.out.println("The person with the minimum sales is: " + min_id);
        System.out.println("The total sales is: " + sum);
        System.out.println("The average sales is: " + ((double) sum / SALESPEOPLE));
        System.out.print("Enter a value for sales: ");
        val = scan.nextInt();
        System.out.println("Salespeople that exceeded sales of " + val + " are");
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > val) {
                System.out.println("     " + i + "         " + sales[i]);
                greater++;
            }

        System.out.println(greater + " sales people had sales greater than " + val);
        System.out.println("\nThe sales with the new ID's:");
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++)
            System.out.println("     " + (i + 1) + "         " + sales[i]);

    }
}