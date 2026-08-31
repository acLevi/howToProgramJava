// Exercise 2.32: NegativesAndPositives.java
// Program that inputs five numbers and determines and prints the number
// of negative numbers, positive numbers, and zeros input.

import java.util.Scanner; // program uses class Scanner

public class NegativesAndPositives {

    // main method begins the Java application execution
    public static void main(String[] args) {
        // number: stores the value input by the user
        // positiveCount/negativeCount/zeroCount: counters, each starts at 0
        int number, positiveCount = 0, negativeCount = 0, zeroCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        number = input.nextInt();

        // a number can be zero, positive, or negative; each check
        // increments exactly one counter
        if (number == 0) zeroCount++;
        if (number > 0) positiveCount++;
        if (number < 0) negativeCount++;

        // reads the second number and updates the counters
        System.out.print("Insert the second number: ");
        number = input.nextInt();

        if (number == 0) zeroCount++;
        if (number > 0) positiveCount++;
        if (number < 0) negativeCount++;

        // reads the third number and updates the counters
        System.out.print("Insert the third number: ");
        number = input.nextInt();

        if (number == 0) zeroCount++;
        if (number > 0) positiveCount++;
        if (number < 0) negativeCount++;

        // reads the fourth number and updates the counters
        System.out.print("Insert the fourth number: ");
        number = input.nextInt();

        if (number == 0) zeroCount++;
        if (number > 0) positiveCount++;
        if (number < 0) negativeCount++;

        // reads the fifth number and updates the counters
        System.out.print("Insert the fifth number: ");
        number = input.nextInt();

        if (number == 0) zeroCount++;
        if (number > 0) positiveCount++;
        if (number < 0) negativeCount++;

        // prints the final result: the number of positives, negatives, and zeros
        System.out.printf("%nPositives: %d%nNegatives: %d%nZeros: %d%n", positiveCount, negativeCount, zeroCount);
    } // end method main
} // end class NegativesAndPositives