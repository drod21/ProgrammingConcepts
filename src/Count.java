// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String phrase; // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int length; // the length of the phrase
        char ch; // an individual character in the string
        int aCount;
        int eCount;
        int sCount;
        int tCount;

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        do {
            //Read in a string and find its length
            System.out.print("Enter a sentence or phrase( 'quit' to quit): ");
            phrase = scan.nextLine();
            if (phrase.equalsIgnoreCase("quit")) {
                break;
            }
            length = phrase.length();

            // Initialize counts
            countBlank = 0;
            aCount = 0;
            eCount = 0;
            sCount = 0;
            tCount = 0;

            // a for loop to go through the string character by character and count the blank spaces
            for (int i = 0; i < length; i++) {
                ch = phrase.charAt(i);
                switch (ch) {
                    case ' ':
                        countBlank++;
                        break;

                    case 'A':
                    case 'a':
                        aCount++;
                        break;

                    case 'E':
                    case 'e':
                        eCount++;
                        break;

                    case 'S':
                    case 's':
                        sCount++;
                        break;

                    case 'T':
                    case 't':
                        tCount++;
                        break;
                }
            }

            System.out.println(); // Print the results
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of 'A' and 'a' : " + aCount);
            System.out.println("Number of 'E' and 'e' : " + eCount);
            System.out.println("Number of 'S' and 's' : " + sCount);
            System.out.println("Number of 'T' and 't' : " + tCount);
            System.out.println();
        } while (!phrase.equalsIgnoreCase("quit"));
        System.out.println("Program ended.");
        scan.close(); //close Scanner object
    }
}