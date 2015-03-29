
import java.util.Scanner;

/**
 * Created by derekrodriguez on 3/28/15.
 */
public class Points {
    public static void main(String[] args) {
        //Declare variables;
        int short1 = 0;
        int short2 = 0;
        int points;
        int i;
        int j;
        int x;
        int y;

        //Get the input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("How many points do you have?");
        points = scan.nextInt();
        int[][] table = new int[2][points];
        double distance, shortest = 999999999;
        for (i = 0; i < points; i++) {
            System.out.println("For point " + (i + 1));
            System.out.print("Enter x: ");
            table[0][i] = scan.nextInt();
            System.out.print("Enter y: ");
            table[1][i] = scan.nextInt();
        }
        for (i = 0; i < points - 1; i++)
            for (j = i + 1; j < points; j++) {
                x = table[0][i] - table[0][j];
                y = table[1][i] - table[1][j];
                distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                System.out.println("distance between points " + i + " and " + j + ": " + distance);
                if (distance < shortest) {
                    shortest = distance;
                    short1 = i;
                    short2 = j;
                }
            }
        System.out.println("Shortest distance:" + shortest);
        System.out.println("points: " + (short1 + 1) + ": (" + table[0][short1] + "," + table[1][short1] +
                ") and " + (short2 + 1) + ": (" + table[0][short2] + "," + table[1][short2] + ")");
    }
}