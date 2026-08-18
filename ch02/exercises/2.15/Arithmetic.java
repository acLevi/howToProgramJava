// Exercise 2.15: Program that calculates the sum, product, difference
// and quotient of two integers.
//
// How it works:
// - The program reads two integers from the user via Scanner.
// - Each arithmetic operation is performed using the corresponding operator:
//   + (addition), * (multiplication), - (subtraction), / (division).
// - The results are displayed using printf with format specifiers (%d for integers).
//
// Example:
//   Input:  x = 10, y = 3
//   Output: Sum: 13, Difference: 7, Product: 30, Quotient: 3
//
// Note: Integer division truncates the result (e.g., 10 / 3 = 3, not 3.33).
//       Division by zero will cause an ArithmeticException.

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int x, y, sum, product, diff, quot;
        Scanner input = new Scanner(System.in);

        // Read two integers from user input
        System.out.print("Insert the first integer: ");
        x = input.nextInt();
        System.out.print("Insert the second integer: ");
        y = input.nextInt();

        // Perform arithmetic operations
        sum = x + y;
        product = x * y;
        diff = x - y;
        quot = x / y;

        // Display the results using printf for formatted output
        System.out.printf("Sum: %d%nDifference: %d%nProduct: %d%nQuotient: %d%n", sum, diff, product, quot);
    }
}
