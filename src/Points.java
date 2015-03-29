
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

        System.out.print("Enter the second coordinates (x2 and y2):");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        // Compute the distance
        distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //To format the result and display.
        System.out.println("The distance between the points (" + x1 + "," + y1 + ")" +
                " and (" + x2 + "," + y2 + ")" +
                " is "  );

    }
}
