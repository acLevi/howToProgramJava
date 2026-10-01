/* Exercise 4.37:
The factorial of a non-negative integer n is written as n! and is defined as follows:
n! = n * (n -1) * (n - 2) * ... * 1 (for values of n greater than or equal to 1) and
n! = 1 (for n = 0)
For example, 5! = 5 * 4 * 3 * 2 * 1, which equals 120.

b) Write an application that estimates the value of the mathematical constant using the following formula.
Allow the user to enter the number of terms to calculate:

e = 1 + 1/1! + 1/2! + 1/3! + ...
*/

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        int terms = -1, counter = 1;
        long factorial;
        double constant = 1;
        Scanner input = new Scanner(System.in);

        while (terms < 0) {
            System.out.print("Enter a number of terms: ");
            terms = input.nextInt();
        }

        System.out.print("e = 1 ");

        while (counter <= terms) {
            int number = counter;
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

            System.out.printf("+ 1/%d ", factorial);
            constant += 1.0 / factorial;
            counter++;
        }

        System.out.printf("= %f%n", constant);
        input.close();
    }
}
