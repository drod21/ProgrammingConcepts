import java.util.Scanner;

/**
 * Created by derekrodriguez on 3/28/15.
 */
public class Grades {
    public static void main(String[] args) {

        int testQ; //number of questions
        int mGrade;
        int count = 0;
        double total;
        char yesno = 'y';


        System.out.println("How many questions are there?");
        Scanner scan = new Scanner(System.in);
        testQ = scan.nextInt();
        int[] testKey = new int[testQ];

        System.out.println("Please enter your test key.");
        for (int i = 0; i < testKey.length; i++) {
            testKey[i] = scan.nextInt();
        }
    }
}
