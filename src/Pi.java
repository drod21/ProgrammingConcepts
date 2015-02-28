import java.util.Random;
import java.util.Scanner;

/**
 * Created by derekrodriguez on 2/28/15.
 */
public class Pi {
    public static void main(String Args[]) {

        float x;
        float y;
        float distance;
        long total;
        double inside = 0;
        double outside = 0;

        Random rand = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of darts:");
        total = scan.nextLong();
        scan.nextLine();

        for (int i = 1; i < total; i++) {
            x = Math.abs(rand.nextFloat() % 2);
            y = Math.abs(rand.nextFloat() % 2);

            distance = (float) Math.sqrt(Math.pow(x - 1, 2) + Math.pow(y - 1, 2));
            //x-1 , y-1 as (1,1) is the coordinate of center
            if (distance <= 1)    //1 = square(radius of circle)
                inside++;
            else
                outside++;
        }
        System.out.println("Total number of arrows inside circle: " + inside);
        System.out.println("Estimated value of Pie: " + (((inside * 4) / (float) total)));
    }
}
