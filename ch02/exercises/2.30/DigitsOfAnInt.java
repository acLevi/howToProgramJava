// Exercise 2.30: DigitsOfAnInt.java
// Program that receives a five-digit number and displays its digits
// separated from one another by three spaces each.

import java.util.Scanner; // program uses class Scanner

public class DigitsOfAnInt {
    // main method begins the Java application execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first, second, third, fourth, fifth;

        // prompts the user to enter a five-digit number and reads it
        System.out.print("Enter 5-digit integer: ");
        int x = input.nextInt();

        // extracts each digit using the % (modulo) operator, which
        // returns the remainder of a division, and integer division
        //
        // first: remainder of dividing x by 10 is the units digit
        // (e.g., 42339 % 10 = 9)
        first = x % 10;

        // second: (remainder of x / 100) minus (remainder of x / 10)
        // removes the units digit, then dividing by 10 shifts the
        // tens digit to the units position (42339: (39 - 9) / 10 = 3)
        second = ((x % 100) - (x % 10)) / 10;

        // third: same technique, removing the two rightmost digits
        // and shifting the hundreds digit into the units position
        // (42339: (339 - 39) / 100 = 3)
        third = ((x % 1000) - (x % 100)) / 100;

        // fourth: (42339: (2339 - 339) / 1000 = 2)
        fourth = ((x % 10000) - (x % 1000)) / 1000;

        // fifth: (42339: (42339 - 2339) / 10000 = 4)
        fifth = ((x % 100000) - (x % 10000)) / 10000;

        // prints the digits from left to right, separated by three spaces
        System.out.printf("%d   %d   %d   %d   %d", fifth, fourth, third, second, first);
        input.close(); // releases the resources used by the Scanner
    } // end method main
} // end class DigitsOfAnInt
