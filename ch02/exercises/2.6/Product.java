// Exercise 2.6: Program that calculates the product of three integers
// and displays the result.
//
// How it works:
// - The program reads three integers from the user via Scanner.
// - The product is calculated using the multiplication operator (*).
// - The result is displayed using printf with format specifiers (%d for integers).
//
// Example:
//   Input:  2, 3, 5
//   Output: The product of 2, 3 and 5 is 30.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        // Read three integers from user input
        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // Calculate the product of the three integers
        result = x * y * z;

        // Display the result using printf for formatted output
        // %d is a format specifier that prints an integer value
        System.out.printf("The product of %d, %d and %d is %d.%n", x, y, z, result);
    }
}
