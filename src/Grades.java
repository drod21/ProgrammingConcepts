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

        while (yesno == 'y' || yesno == 'Y') {
            count = 0;
            for (int i = 0; i < testKey.length; i++) {
                System.out.println("Enter the answer to be graded");
                mGrade = scan.nextInt();
                if (mGrade == testKey[i]) {
                    ++count;
                }
            }
            total = (double) count / testQ * 100;

            System.out.println("The number of questions correct are: " + count);
            System.out.println("The percentage correct is: " + total);
            System.out.println("Grade another Quiz? y/n");
            yesno = scan.next().charAt(0);
        }
    }
}
