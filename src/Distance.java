/**
 * Created by derekrodriguez on 1/31/15.
 */
//Header file section

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {

    //Start main method
    public static void main(String[] args) {

        //Declare variables;
        double x1, y1, x2, y2;
        double distance;

        //Get the input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first coordinates (x1 and y1):");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print("Enter the second coordinates (x2 and y2):");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

    /*Use DecimalFormat class To format the fractional part of the output rounded to 3 digits*/
        DecimalFormat f = new DecimalFormat("#0.000");

        // Compute the distance
        distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //To format the result and display.
        System.out.println("The distance between the points (" + x1 + "," + y1 + ")" +
                " and (" + x2 + "," + y2 + ")" +
                " is " + f.format(distance));

    }
}
