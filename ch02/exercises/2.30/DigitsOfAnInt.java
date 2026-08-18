// Exercise 2.30: receives a 5-digit number and returns its digits separated by three spaces.
//
// How it works:
// - Each digit is extracted with the modulo (%) operator, which returns the remainder of a division.
// - A number is decimal (base 10), so each digit occupies a "house" that is a multiple of 10.
// - Example with 42139:
//   42139 % 100      = 39  -> "last two digits"
//   42139 % 1000     = 139 -> "last three digits"
// - By subtracting two remainders and dividing by 10 we "remove" the smaller houses and keep only the digit we want.
//
// The digits are printed from right to left (fifth -> first) because the extraction starts from the least significant digit.

import java.util.Scanner;

public class DigitsOfAnInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second, third, fourth, fifth;

        System.out.print("Enter 5-digit integer: ");
        int x = input.nextInt();

        // Extract each digit of x, from the rightmost (first) to the leftmost (fifth).
        // Example: x = 42139
        // first  = 42139 % 10 = 9
        first = x % 10;

        // (42139 % 100 = 39) - (42139 % 10 = 9) = 30, then 30 / 10 = 3
        second = ((x % 100) - (x % 10)) / 10;

        // (139 - 39) = 100, then 100 / 100 = 1
        third = ((x % 1000) - (x % 100)) / 100;

        // (2139 - 139) = 2000, then 2000 / 1000 = 2
        fourth = ((x % 10000) - (x % 1000)) / 1000;

        // (42139 - 2139) = 40000, then 40000 / 10000 = 4
        fifth = ((x % 100000) - (x % 10000)) / 10000;

        // Print digits in the correct order (leftmost first): 4   2   1   3   9
        System.out.printf("%d   %d   %d   %d   %d", fifth, fourth, third, second, first);
    }
}
