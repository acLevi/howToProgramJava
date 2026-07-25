// Exercise 2.16: Program that return the sum, 
// product, difference and quotient

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int x, y, sum, product, diff, quot;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first integer: ");
        x = input.nextInt();
        System.out.print("Insert the second integer: ");
        y = input.nextInt();

        sum = x + y;
        product = x * y;
        diff = x - y;
        quot = x / y;

        System.out.printf("Sum: %d%nDifference: %d%nProduct: %d%nQuotient: %d%n", sum, diff, product, quot);
    } 
}
