/* Exercise 4.37:
The factorial of a non-negative integer n is written as n! and is defined as follows:
n! = n * (n -1) * (n - 2) * ... * 1 (for values of n greater than or equal to 1) and
n! = 1 (for n = 0)
For example, 5! = 5 * 4 * 3 * 2 * 1, which equals 120.

a) Write an application that reads a non-negative integer, calculates its factorial, and prints it.
*/

import java.util.Scanner;

public class FactorialA {
    public static void main(String[] args) {
        long number = -1;
        long factorial;
        Scanner input = new Scanner(System.in);

        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            number = input.nextInt();
        }

        if (number == 0) {
            factorial = 1;
        } else {
            factorial = number;
            long predecessor = number;
            while (predecessor > 1) {
                predecessor--;
                factorial *= predecessor;
            }
        }
        System.out.printf("%d! = %d %n", number, factorial);
        input.close();
    }
}
